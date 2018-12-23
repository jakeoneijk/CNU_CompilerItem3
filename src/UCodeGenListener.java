import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class UCodeGenListener extends MiniGoBaseListener {

	private class Table {
		Table parent = null;
		HashMap<String,Variable> v = new HashMap<String,Variable>();
		HashMap<String,Variable> arg = new HashMap<String,Variable>();

		int getVariableProc(){
			int result = 0;
			for(String key :v.keySet()){
				Variable va = v.get(key);
				result += va.number;
			}	
			return result;
		}

		int getArgumentProc(){
			int result = 0;
			for(String key :arg.keySet()){
				Variable va = v.get(key);
				result += va.number;
			}	
			return result;
		}
	}

	private class Variable {
		String name = "";
		int base = 0;
		int offset = 0;
		int number = 0;
		int type = 10; // 0: int , 1: boolean , 10: unknown
		boolean isParam = false;
		public int type(){
			return this.type;
		}
		public Variable(String name, int base, int offset, int number){
			this.base = base;
			this.name = name;
			this.offset = offset;
			this.number = number;
		}

		public Variable(String name, int base, int offset, int number,String type){
			this.base = base;
			this.name = name;
			this.offset = offset;
			this.number = number;
			if(type.equals("bool")){
				this.type = 1;
			}else if(type.equals("int")){
				this.type = 0;
			}
		}
		
		public Variable(String name, int base, int offset, int number, boolean isParam, String type){
			this.base = base;
			this.name = name;
			this.offset = offset;
			this.number = number;
			this.isParam = isParam;
			if(type.equals("bool")){
				this.type = 1;
			}else if(type.equals("int")){
				this.type = 0;
			}
		}

	}
	
	private class DataStack {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		DataStack parent;
		String name = "";
		int type = 10;
		int block = 0;
		
		public DataStack(String name, int type, int block){
			this.name = name;
			this.type = type;
			this.block = block;
		}
		
		public void addParent(DataStack d){
			parent = d;
		}
		
		public int size(){
			return stack.size();
		}
		
		public void push(int element){
			stack.add(element);
		}
		
		public int pop(){
			return stack.remove(stack.size()-1);
		}
		
		public int peek(){
			return stack.get(stack.size()-1);
		}
	}
	
	Stack<DataStack> stackOfStack = new Stack<DataStack>();
	Stack<Table> stack = new Stack<Table>();
	Stack<String> loopStack = new Stack<String>();
	ParseTreeProperty<Integer> exprType = new ParseTreeProperty<Integer>();
	HashMap<String, ArrayList<Integer>> functionInfo = new HashMap<String, ArrayList<Integer>>();

	int[] symOffset = new int[100];
	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
	int next = 0;

	@Override public void enterProgram( MiniGoParser.ProgramContext ctx) {
		Arrays.fill(symOffset, 1);
		System.out.println();
		Table t = new Table();
		stack.add(t);
		ArrayList<Integer> write = new ArrayList<Integer>();
		write.add(1);
		this.functionInfo.put("write",write);
	}

	@Override public void exitProgram( MiniGoParser.ProgramContext ctx) { 
		String temp  = "";
		for(int i = 0; i<ctx.getChildCount(); i++){
			temp += newTexts.get(ctx.getChild(i));
		}
		temp += whiteSpace(0)+"bgn " + stack.peek().getVariableProc()+"\n"+whiteSpace(0)+"ldp\n"+whiteSpace(0)+"call main\n"+whiteSpace(0)+"end\n";
		newTexts.put(ctx, temp);
		System.out.println(temp);
		 try {
		      BufferedWriter out = new BufferedWriter(new FileWriter("result.txt"));
		  
		      out.write(temp);
		  
		      out.close();
		    } catch (IOException e) {
		        System.err.println(e); 
		        System.exit(1);
		    }
		 stack.pop();
	}

	@Override public void enterLocal_decl( MiniGoParser.Local_declContext ctx) { }
	@Override public void exitLocal_decl( MiniGoParser.Local_declContext ctx) {
		int child = ctx.getChildCount();

		Table t = stack.peek();

		String temp = "";
		int base = stack.size();
		int offset = symOffset[base];
		int number = 1;
		if(child == 3){ // variable
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number,ctx.getChild(2).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		else if(child == 6){// array
			if(ctx.getChild(2).getText().equals("[")){
				number = Integer.parseInt(ctx.getChild(3).getText());
				t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number,ctx.getChild(5).getText()));
				temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
				symOffset[base] = symOffset[base]+number;
			}else if(ctx.getChild(2).getText().equals("<")){
				int type = 10;
				String name = "";
				/*
				 * type 결정
				 */
				if(ctx.getChild(3).getText().equals("int")){
					type = 0;
				} else if(ctx.getChild(3).getText().equals("bool")){
					type = 1;
				} else {
					printCodeLine(ctx);
					System.out.println("[error] 스택 타입에러 : void는 넣을 수 없습니다.");
					System.exit(1);
				}
				
				/*
				 * IDENT를 name에 저장
				 */
				name = ctx.getChild(1).getText();
				number = 10;
				DataStack ds = new DataStack(name,type,base);
				
				if(stackOfStack.size()>0)
					ds.parent = stackOfStack.peek();
				
				stackOfStack.add(ds);
				
				t.v.put(name, new Variable(name,base,offset,number,ctx.getChild(3).getText()));
				temp += whiteSpace(0) + "sym " + base + " " + offset + " " + number + "\n";
				symOffset[base] = symOffset[base]+number;
			}
		}
		
		newTexts.put(ctx, temp);

	}

	@Override public void enterVar_decl( MiniGoParser.Var_declContext ctx) { }
	@Override public void exitVar_decl( MiniGoParser.Var_declContext ctx) { 
		int child = ctx.getChildCount();

		Table t = stack.peek();

		String temp = "";
		int base = stack.size();
		int offset = symOffset[base];
		int number = 1;

		if(child == 3){
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number,ctx.getChild(2).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		else if(child == 5){
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number,ctx.getChild(4).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
			offset = symOffset[base];
			t.v.put(ctx.getChild(3).getText(), new Variable(ctx.getChild(3).getText(),base,offset,number,ctx.getChild(4).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		} 
		else if(child == 6){
			if(ctx.getChild(2).getText().equals("[")){
				number = Integer.parseInt(ctx.getChild(3).getText());
				t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number,ctx.getChild(5).getText()));
				temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
				symOffset[base] = symOffset[base]+number;
			} 
			else if(ctx.getChild(2).getText().equals("<")){
				int type = 10;
				String name = "";
				/*
				 * type 결정
				 */
				if(ctx.getChild(3).getText().equals("int")){
					type = 0;
				} else if(ctx.getChild(3).getText().equals("bool")){
					type = 1;
				} else {
					printCodeLine(ctx);
					System.out.println("[error] 스택 타입에러 : void는 넣을 수 없습니다.");
					System.exit(1);
				}
				
				/*
				 * IDENT를 name에 저장
				 */
				name = ctx.getChild(1).getText();
				number = 10;
				DataStack ds = new DataStack(name,type,base);
				
				if(stackOfStack.size()>0)
					ds.parent = stackOfStack.peek();
				
				stackOfStack.add(ds);
				
				t.v.put(name, new Variable(name,base,offset,number,ctx.getChild(3).getText()));
				temp += whiteSpace(0) + "sym " + base + " " + offset + " " + number + "\n";
				symOffset[base] = symOffset[base]+number;
			}
		}
		newTexts.put(ctx, temp);
	}

	@Override public void enterFun_decl( MiniGoParser.Fun_declContext ctx) {
		int type = (ctx.type_spec(0).getText().equals("int"))?0:1;
		ArrayList<Integer> info = new ArrayList<Integer>();
		info.add(type);
		this.functionInfo.put(ctx.getChild(1).getText(),info);
		Table t = new Table();
		t.parent = stack.peek();
		stack.add(t);
	}
	@Override public void exitFun_decl( MiniGoParser.Fun_declContext ctx) {
		String name = ctx.getChild(1).getText();
		String temp = "";
		int offset = stack.size();
		int variableSize = stack.peek().getArgumentProc()+stack.peek().getVariableProc();

		temp += name+whiteSpace(name.length()) +"proc "+variableSize+" "+offset+" "+offset+"\n";

		temp += newTexts.get(ctx.getChild(3));
		temp += newTexts.get(ctx.getChild(6));
		if(!(ctx.type_spec(0) != null && ctx.type_spec(0).getText().equals("int"))){
			temp += whiteSpace(0)+"ret\n";
		}
		temp += whiteSpace(0)+"end\n";
		newTexts.put(ctx, temp);
		symOffset[stack.size()] = 1;
		stack.pop();
	}

	@Override public void enterParams( MiniGoParser.ParamsContext ctx) { }
	@Override public void exitParams( MiniGoParser.ParamsContext ctx) {
		String temp ="";
		for(int i = 0; i<ctx.param().size(); i++){
			temp += newTexts.get(ctx.param(i));
		}
		newTexts.put(ctx, temp);
	}
	@Override public void enterParam( MiniGoParser.ParamContext ctx) { }
	@Override public void exitParam( MiniGoParser.ParamContext ctx) { 
		Table t = stack.peek();
		String temp = "";
		String name = ctx.getChild(0).getText();
		int base = stack.size();
		int offset = symOffset[base];
		int number = 1;
		String type = (ctx.getChild(1).getText().equals("["))?ctx.getChild(3).getText():ctx.getChild(1).getText();
		
		t.v.put(name, new Variable(name,base,offset,number,true,type));
		temp += whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
		symOffset[base] = symOffset[base]+number;
		newTexts.put(ctx, temp);
	}

	@Override public void enterDecl( MiniGoParser.DeclContext ctx) { }
	@Override public void exitDecl( MiniGoParser.DeclContext ctx) {
		newTexts.put(ctx, newTexts.get(ctx.getChild(0)));
	}

	@Override public void enterExpr_stmt( MiniGoParser.Expr_stmtContext ctx) { }

	@Override public void exitExpr_stmt( MiniGoParser.Expr_stmtContext ctx) { 
		newTexts.put(ctx, newTexts.get(ctx.getChild(0)));
	}

	@Override public void enterCompound_stmt( MiniGoParser.Compound_stmtContext ctx) {
		if(!(ctx.parent instanceof MiniGoParser.Fun_declContext)){
			Table t = new Table();
			t.parent = stack.peek();
			stack.add(t);
		}
	}
	@Override public void exitCompound_stmt( MiniGoParser.Compound_stmtContext ctx) {
		String temp = "";
		for(int i = 1; i<ctx.getChildCount()-1; i++){
			temp+= newTexts.get(ctx.getChild(i));
		}
		newTexts.put(ctx,temp);
		if(!(ctx.parent instanceof MiniGoParser.Fun_declContext)){
			symOffset[stack.size()] = 1;
			stack.pop();
		}
	}

	@Override public void enterArgs( MiniGoParser.ArgsContext ctx) { }
	@Override public void exitArgs( MiniGoParser.ArgsContext ctx) { 
		String temp ="";
		for(int i = 0; i < ctx.expr().size(); i++){
			temp += newTexts.get(ctx.expr(i));
		}
		newTexts.put(ctx, temp);
	}

	@Override public void enterType_spec( MiniGoParser.Type_specContext ctx) { }

	@Override public void exitType_spec( MiniGoParser.Type_specContext ctx) { }
	@Override public void enterIf_stmt( MiniGoParser.If_stmtContext ctx) {
		if(ctx.getChildCount() == 3){
			loopStack.add("next"+next);
			next++;
		}
		else if(ctx.getChildCount() == 5){
			loopStack.add("next"+next);
			next++;
			loopStack.add("next"+next);
			next++;
		}
	}
	@Override public void exitIf_stmt( MiniGoParser.If_stmtContext ctx) {
		String temp = "";
		if(ctx.getChildCount() == 3){
			String next = loopStack.pop();
			temp += newTexts.get(ctx.getChild(1));
			temp += whiteSpace(0)+"fjp "+next+"\n";
			temp += newTexts.get(ctx.getChild(2));
			temp += next+whiteSpace(next.length())+"nop\n"; 
		}
		else if(ctx.getChildCount() == 5){
			String next1 = loopStack.pop();
			String next2 = loopStack.pop();

			temp += newTexts.get(ctx.getChild(1));
			temp += whiteSpace(0)+"fjp "+next2+"\n";
			temp += newTexts.get(ctx.getChild(2));
			temp += whiteSpace(0)+"ujp "+next1+"\n";
			temp += next2+whiteSpace(next2.length())+"nop\n";
			temp += newTexts.get(ctx.getChild(4));
			temp += next1+whiteSpace(next1.length())+"nop\n";
		}
		newTexts.put(ctx, temp);
	}
	
	@Override public void enterFor_stmt( MiniGoParser.For_stmtContext ctx) { 
		loopStack.add("next"+next);
		next++;
		loopStack.add("next"+next);
		next++;
	}
	@Override public void exitFor_stmt( MiniGoParser.For_stmtContext ctx) { 
		String temp = "";
		String next1 = loopStack.pop();
		String next2 = loopStack.pop();

		temp += next2+whiteSpace(next2.length())+"nop\n";
		temp += newTexts.get(ctx.getChild(1));
		temp += whiteSpace(0)+"fjp "+next1+"\n";
		temp += newTexts.get(ctx.getChild(2));
		temp += whiteSpace(0)+"ujp "+next2+"\n";
		temp += next1+whiteSpace(next1.length())+"nop\n";

		newTexts.put(ctx, temp);
	}

	@Override public void enterExpr( MiniGoParser.ExprContext ctx) { }
	@Override public void exitExpr( MiniGoParser.ExprContext ctx) {
		String temp = "";
		if(ctx.getChildCount() == 1){
			if(ctx.stack_expr() != null){
				temp += newTexts.get(ctx.getChild(0));
			}
			else if(ctx.IDENT() != null){
				if(ctx.IDENT().getText().equals("true")||ctx.IDENT().getText().equals("false")){
					temp += whiteSpace(0) + "ldc ";
					temp += (ctx.IDENT().getText().equals("true"))?1:0;
					temp += "\n";
					this.exprType.put(ctx,1);
				}else{
					Variable va = searchVariable(ctx.IDENT().getText(),ctx);
					this.exprType.put(ctx, va.type());
					if(va.number > 1){
						temp += whiteSpace(0) + "lda "+va.base+" "+va.offset+"\n";
					}else {
						temp += whiteSpace(0) + "lod "+va.base+" "+va.offset+"\n";
					}
				}

			}else {
				this.exprType.put(ctx,0);
				temp += whiteSpace(0) + "ldc "+ctx.getChild(0).getText()+"\n";
			}
		} 
		else if(ctx.getChild(0).getText().equals("(")){
			this.exprType.put(ctx, this.exprType.get(ctx.getChild(1)));
			temp += newTexts.get(ctx.getChild(1));
		}
		else if(ctx.getChildCount() == 4 && ctx.getChild(3).getText().equals("]")){
			if(this.exprType.get(ctx.getChild(2)) != 0){
				this.printCodeLine(ctx);
				System.out.println("배열의 인자는 int 타입이여야 합니다");
				System.exit(1);
			}
			Variable va = searchVariable(ctx.IDENT().getText(),ctx);
			this.exprType.put(ctx,va.type());
			temp += newTexts.get(ctx.expr(0));
			if(va.isParam){
				temp += whiteSpace(0)+"lod "+va.base+" "+va.offset+"\n";
			}else {
				temp += whiteSpace(0)+"lda "+va.base+" "+va.offset+"\n";
			}
			temp += whiteSpace(0)+"add\n"+whiteSpace(0)+"ldi\n";
		}
		else if(ctx.getChildCount() == 4 && ctx.getChild(3).getText().equals(")")){
			this.exprType.put(ctx,this.functionInfo.get(ctx.getChild(0).getText()).get(0));
			temp += whiteSpace(0)+"ldp\n";
			temp += newTexts.get(ctx.args());
			temp += whiteSpace(0)+"call "+ctx.IDENT().getText()+"\n";
		}
		else if(ctx.getChildCount() == 6 && ctx.getChild(0).getText().equals("fmt")){
			/*
			 * 파일 입출력인 fmt를 콘솔출력으로 설정
			 */
			temp += whiteSpace(0)+"ldp\n";
			temp += whiteSpace(0)+"ldp\n";
			temp += newTexts.get(ctx.args());
			temp += whiteSpace(0)+"call "+ctx.IDENT().getText()+"\n";
			temp += whiteSpace(0)+"call write\n";
		}
		else if(ctx.getChildCount() == 2){
			/*
			 * operator '+'는 제외
			 */
			int exprType = this.exprType.get(ctx.getChild(1));
			String operator = ctx.getChild(0).getText();
			temp += newTexts.get(ctx.expr(0));
			Variable va;
			switch(operator){
			case "-":
				temp += whiteSpace(0)+"neg\n";
				singleOperationTypeCheck(ctx,this.exprType.get(ctx.getChild(1)),0);
				this.exprType.put(ctx,0);
				break;
			case "--":
				va = searchVariable(ctx.getChild(1).getText(),ctx);
				temp += whiteSpace(0)+"dec\n";
				temp += whiteSpace(0)+"str "+va.base+" "+va.offset+"\n";
				singleOperationTypeCheck(ctx,this.exprType.get(ctx.getChild(1)),0);
				this.exprType.put(ctx,0);
				break;
			case "++":
				va = searchVariable(ctx.getChild(1).getText(),ctx);
				temp += whiteSpace(0)+"inc\n";
				temp += whiteSpace(0)+"str "+va.base+" "+va.offset+"\n";
				singleOperationTypeCheck(ctx,this.exprType.get(ctx.getChild(1)),0);
				this.exprType.put(ctx,0);
				break;
			case "!":
				temp += whiteSpace(0)+"notop\n";
				singleOperationTypeCheck(ctx,this.exprType.get(ctx.getChild(1)),1);
				this.exprType.put(ctx,1);
				break;
			default:
				break;	
			}
		}
		else if(isBinaryOperation(ctx)){
			temp += newTexts.get(ctx.getChild(0));
			temp += newTexts.get(ctx.getChild(2));
			String operator = ctx.getChild(1).getText();
			switch(operator){
			case "*":
				temp += whiteSpace(0)+"mult\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),0);
				break;
			case "/":
				temp += whiteSpace(0)+"div\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),0);
				break;
			case "%":
				temp += whiteSpace(0)+"mod\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),0);
				break;
			case "+":
				temp += whiteSpace(0)+"add\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),0);
				break;
			case "-":
				temp += whiteSpace(0)+"sub\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),0);
				break;
			case "==":
				temp += whiteSpace(0)+"eq\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case "!=":
				temp += whiteSpace(0)+"ne\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case "<=":
				temp += whiteSpace(0)+"le\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case "<":
				temp += whiteSpace(0)+"lt\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case ">=":
				temp += whiteSpace(0)+"ge\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case ">":
				temp += whiteSpace(0)+"gt\n";
				doubleOperationTypeCheck(ctx,0,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case "and":
				temp += whiteSpace(0)+"and\n";
				doubleOperationTypeCheck(ctx,1,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			case "or":
				temp += whiteSpace(0)+"or\n";
				doubleOperationTypeCheck(ctx,1,this.exprType.get(ctx.getChild(0)),this.exprType.get(ctx.getChild(2)),1);
				break;
			default:
				break;
			}
		}
		else if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals(",")){
			this.exprType.put(ctx,0);
			temp += whiteSpace(0)+"ldc "+ctx.getChild(0).getText()+"\n";
			temp += whiteSpace(0)+"ldc "+ctx.getChild(2).getText()+"\n";
		}
		else if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("=")){
			Variable va = searchVariable(ctx.getChild(0).getText(),ctx);
			doubleOperationTypeCheck(ctx,va.type(),va.type(),this.exprType.get(ctx.getChild(2)),10);
			temp += newTexts.get(ctx.getChild(2));
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";
		}
		else if(ctx.getChildCount() == 6 && ctx.getChild(4).getText().equals("=")){
			Variable va = searchVariable(ctx.getChild(0).getText(),ctx);
			doubleOperationTypeCheck(ctx,va.type(),va.type(),this.exprType.get(ctx.getChild(5)),10);
			temp += newTexts.get(ctx.expr(0));
			if(va.isParam){
				temp += whiteSpace(0)+"lod "+va.base+" "+va.offset+"\n";
			}else {
				temp += whiteSpace(0)+"lda "+va.base+" "+va.offset+"\n";
			}
			temp += whiteSpace(0)+"add\n";
			temp += newTexts.get(ctx.expr(1));
			temp += whiteSpace(0)+"sti\n";
		}

		newTexts.put(ctx, temp);
	}

	@Override public void enterStmt( MiniGoParser.StmtContext ctx) { }
	@Override public void exitStmt( MiniGoParser.StmtContext ctx) {
		newTexts.put(ctx, newTexts.get(ctx.getChild(0)));
	}

	@Override public void enterAssign_stmt( MiniGoParser.Assign_stmtContext ctx) { 
		String temp = "";
		if(ctx.getChildCount() == 5){
			Table t = stack.peek();
			String name = ctx.getChild(1).getText();
			int base = stack.size();
			int offset = symOffset[base];
			int number = 1;

			t.v.put(name, new Variable(name,base,offset,number,ctx.getChild(2).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		else if(ctx.getChildCount() == 9){
			Table t = stack.peek();
			int base = stack.size();
			int offset = symOffset[base];
			int number = 1;

			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number,ctx.getChild(4).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			offset = symOffset[base] = symOffset[base]+number;
			t.v.put(ctx.getChild(3).getText(), new Variable(ctx.getChild(3).getText(),base,offset,number,ctx.getChild(4).getText()));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		newTexts.put(ctx, temp);
	}

	@Override public void exitAssign_stmt( MiniGoParser.Assign_stmtContext ctx) { 
		String temp = newTexts.get(ctx);
		if(ctx.getChildCount() == 4){
			Variable va = searchVariable(ctx.getChild(0).getText(),ctx);
			temp += newTexts.get(ctx.getChild(3));
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";
		}
		else if(ctx.getChildCount() == 5){
			Variable va = searchVariable(ctx.getChild(1).getText(),ctx);
			temp += newTexts.get(ctx.getChild(4));
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";

		}
		else if(ctx.getChildCount() == 9){
			Variable va = searchVariable(ctx.getChild(1).getText(),ctx);
			temp += whiteSpace(0) + "ldc "+ctx.getChild(6).getText()+"\n";
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";

			va = searchVariable(ctx.getChild(3).getText(),ctx);
			temp += whiteSpace(0) + "ldc "+ctx.getChild(8).getText()+"\n";
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";
		}
		newTexts.put(ctx, temp);
	}

	@Override public void enterReturn_stmt( MiniGoParser.Return_stmtContext ctx) { }
	@Override public void exitReturn_stmt( MiniGoParser.Return_stmtContext ctx) {
		int child = ctx.getChildCount();
		String temp = "";
		if(child == 2){
			temp += newTexts.get(ctx.getChild(1));
			temp += whiteSpace(0) + "retv\n";
		}
		newTexts.put(ctx, temp);
	}

	@Override public void enterStack_expr(MiniGoParser.Stack_exprContext ctx) { }
	@Override public void exitStack_expr(MiniGoParser.Stack_exprContext ctx) {
		String temp = "";
		String method = ctx.getChild(2).getText();
		String name = ctx.getChild(0).getText();
		//int returnType = exprType.get(ctx);
		
		DataStack s = searchStack(name, ctx);
		Variable va = searchVariable(name, ctx);
		/*
		 * Type check
		 */
		//singleOperationTypeCheck(ctx,s.type,returnType);
		
		/*
		 * Methods implementation
		 */
		if(method.equals("pop")){
			int size = s.size();
			
			temp += whiteSpace(0) + "ldc " + (size-1) + "\n";
			temp += whiteSpace(0) + "lda " + va.base + " " + va.offset + "\n";
			temp += whiteSpace(0) + "add\n" + whiteSpace(0)+"ldi\n";
			
			s.pop();
			//this.exprType.put(ctx, returnType);
		}
		else if(method.equals("push")){
			int size = s.size();
		
			temp += whiteSpace(0) + "ldc " + size + "\n";
			temp += whiteSpace(0) + "lda " + va.base + " " + va.offset + "\n";
			temp += whiteSpace(0) + "add\n";
			temp += newTexts.get(ctx.getChild(4));
			temp += whiteSpace(0)+"sti\n";
			s.push(1);
			this.exprType.put(ctx, 10);
		}
		else if(method.equals("peek")){
			int size = s.size();
			
			temp += whiteSpace(0) + "ldc " + (size-1) + "\n";
			temp += whiteSpace(0) + "lda " + va.base + " " + va.offset + "\n";
			temp += whiteSpace(0) + "add\n" + whiteSpace(0)+"ldi\n";
			
			//this.exprType.put(ctx, returnType);
		}
		else if(method.equals("size")){
			int size = s.size();
			
			temp += whiteSpace(0) + "ldc " + size + "\n";			
			this.exprType.put(ctx, 0);
		}
		else if(method.equals("isEmpty")){
			int size = s.size();
			
			if(size > 0){
				temp += whiteSpace(0) + "ldc " + 1 + "\n";	
			} else {
				temp += whiteSpace(0) + "ldc " + 0 + "\n";	
			}
			
			this.exprType.put(ctx, 1);
		}
		newTexts.put(ctx, temp);
	}
	
	
	@Override public void enterEveryRule( ParserRuleContext ctx) { }

	@Override public void exitEveryRule( ParserRuleContext ctx) { }

	@Override public void visitTerminal( TerminalNode node) { }

	@Override public void visitErrorNode( ErrorNode node) { }

	/*
	 * private methods
	 */
	private String whiteSpace(int length){
		String result = "";
		for(int i = 0; i < 11-length; i++){
			result += " ";
		}
		return result;
	}

	private Variable searchVariable(String name, ParserRuleContext ctx){
		Table t = stack.peek();
		Variable var = null;

		while(t != null){
			if(t.v.get(name)!=null){
				var = t.v.get(name);
				break;
			}
			t = t.parent;
		}
		if(var == null){
				this.printCodeLine(ctx);
				System.out.println("선언하지 않은 변수를 사용했습니다.");
				System.exit(1);

		}
		return var;
	}

	private boolean isBinaryOperation(MiniGoParser.ExprContext ctx){
		String operator = ctx.getChild(1).getText();
		if(ctx.getChildCount() == 3 && (operator.equals("*")||operator.equals("/")
				||operator.equals("%")||operator.equals("+")||operator.equals("-")||operator.equals("==")
				||operator.equals("!=")||operator.equals("<=")||operator.equals("<")||operator.equals(">=")
				||operator.equals(">")||operator.equals("and")||operator.equals("or"))){
			return true;
		}
		return false;
	}

	public void singleOperationTypeCheck(ParserRuleContext ctx,int exprType , int exprTypeExpected){
		if(exprType != exprTypeExpected){
			this.printCodeLine(ctx);
			System.out.println("[error] 단일 연산자의 타입에러");
			System.exit(1);
		}
	}

	/*
	 * expect = operand의 기대되는 타입
	 * left = 왼쪽 타입
	 * right = 오른쪽 타입
	 * next = 결과타입 
	 */
	public void doubleOperationTypeCheck(ParserRuleContext ctx,int expect, int left, int right , int next){
		if((expect != left)||(expect != right)){
			this.printCodeLine(ctx);
			System.out.println("[error] 연산 타입에러");
			System.exit(1);
		}
		this.exprType.put(ctx,next);
	}

	public void printCodeLine(ParserRuleContext ctx){
		for(int i = 0 ; i < ctx.getChildCount(); i++){
			System.out.print(ctx.getChild(i).getText()+" ");
		}
	}
	
	public DataStack searchStack(String name, MiniGoParser.Stack_exprContext ctx){
		DataStack s = stackOfStack.peek();
		DataStack result = null;
		
		while(s != null){
			if(s.name.equals(name)){
				result = s;
				break;
			}
			s = s.parent;
		}
		if(result == null){
				this.printCodeLine(ctx);
				System.out.println("선언하지 않은 변수를 사용했습니다.");
				System.exit(1);

		}
		return result;
	}
}
