import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
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
		boolean isParam = false;
		
		public Variable(String name, int base, int offset, int number){
			this.base = base;
			this.name = name;
			this.offset = offset;
			this.number = number;
		}
		
		public Variable(String name, int base, int offset, int number, boolean isParam){
			this.base = base;
			this.name = name;
			this.offset = offset;
			this.number = number;
			this.isParam = isParam;
		}
	}

	Stack<Table> stack = new Stack<Table>();
	Stack<String> loopStack = new Stack<String>();

	int[] symOffset = new int[100];
	ParseTreeProperty<String> newTexts = new ParseTreeProperty<String>();
	int next = 0;

	@Override public void enterProgram( MiniGoParser.ProgramContext ctx) {
		Arrays.fill(symOffset, 1);
		System.out.println();
		Table t = new Table();
		stack.add(t);
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

		if(child == 3){
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		else if(child == 6){
			number = Integer.parseInt(ctx.getChild(3).getText());
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		//System.out.print(temp);
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
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		else if(child == 5){
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
			offset = symOffset[base];
			t.v.put(ctx.getChild(3).getText(), new Variable(ctx.getChild(3).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		} 
		else if(child == 6){
			number = Integer.parseInt(ctx.getChild(3).getText());
			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		//System.out.print(temp);
		newTexts.put(ctx, temp);
	}

	@Override public void enterFun_decl( MiniGoParser.Fun_declContext ctx) {
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
		
		t.v.put(name, new Variable(name,base,offset,number,true));
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
			if(ctx.IDENT() != null){
				Variable va = searchVariable(ctx.IDENT().getText());
				if(va.number > 1){
					temp += whiteSpace(0) + "lda "+va.base+" "+va.offset+"\n";
				}else {
					temp += whiteSpace(0) + "lod "+va.base+" "+va.offset+"\n";
				}
			}else {
				temp += whiteSpace(0) + "ldc "+ctx.getChild(0).getText()+"\n";
			}
		} 
		else if(ctx.getChild(0).getText().equals("(")){
			temp += newTexts.get(ctx.getChild(1));
		}
		else if(ctx.getChildCount() == 4 && ctx.getChild(3).getText().equals("]")){
			Variable va = searchVariable(ctx.IDENT().getText());
			temp += newTexts.get(ctx.expr(0));
			if(va.isParam){
				temp += whiteSpace(0)+"lod "+va.base+" "+va.offset+"\n";
			}else {
				temp += whiteSpace(0)+"lda "+va.base+" "+va.offset+"\n";
			}
			temp += whiteSpace(0)+"add\n"+whiteSpace(0)+"ldi\n";
		}
		else if(ctx.getChildCount() == 4 && ctx.getChild(3).getText().equals(")")){
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
			String operator = ctx.getChild(0).getText();
			temp += newTexts.get(ctx.expr(0));
			Variable va = searchVariable(ctx.getChild(1).getText());
			switch(operator){
			case "-":
				temp += whiteSpace(0)+"neg\n";
				break;
			case "--":
				temp += whiteSpace(0)+"dec\n";
				temp += whiteSpace(0)+"str "+va.base+" "+va.offset+"\n";
				break;
			case "++":
				temp += whiteSpace(0)+"inc\n";
				temp += whiteSpace(0)+"str "+va.base+" "+va.offset+"\n";
				break;
			case "!":
				temp += whiteSpace(0)+"notop\n";
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
				break;
			case "/":
				temp += whiteSpace(0)+"div\n";
				break;
			case "%":
				temp += whiteSpace(0)+"mod\n";
				break;
			case "+":
				temp += whiteSpace(0)+"add\n";
				break;
			case "-":
				temp += whiteSpace(0)+"sub\n";
				break;
			case "==":
				temp += whiteSpace(0)+"eq\n";
				break;
			case "!=":
				temp += whiteSpace(0)+"ne\n";
				break;
			case "<=":
				temp += whiteSpace(0)+"le\n";
				break;
			case "<":
				temp += whiteSpace(0)+"lt\n";
				break;
			case ">=":
				temp += whiteSpace(0)+"ge\n";
				break;
			case ">":
				temp += whiteSpace(0)+"gt\n";
				break;
			case "and":
				temp += whiteSpace(0)+"and\n";
				break;
			case "or":
				temp += whiteSpace(0)+"or\n";
				break;
			default:
				break;
			}
		}
		else if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals(",")){
			temp += whiteSpace(0)+"ldc "+ctx.getChild(0).getText()+"\n";
			temp += whiteSpace(0)+"ldc "+ctx.getChild(2).getText()+"\n";
		}
		else if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals("=")){
			Variable va = searchVariable(ctx.getChild(0).getText());
			temp += newTexts.get(ctx.getChild(2));
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";
		}
		else if(ctx.getChildCount() == 6 && ctx.getChild(4).getText().equals("=")){
			Variable va = searchVariable(ctx.getChild(0).getText());
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

			t.v.put(name, new Variable(name,base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		else if(ctx.getChildCount() == 9){
			Table t = stack.peek();
			int base = stack.size();
			int offset = symOffset[base];
			int number = 1;

			t.v.put(ctx.getChild(1).getText(), new Variable(ctx.getChild(1).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			offset = symOffset[base] = symOffset[base]+number;
			t.v.put(ctx.getChild(3).getText(), new Variable(ctx.getChild(3).getText(),base,offset,number));
			temp+= whiteSpace(0)+"sym "+base+" "+offset+" "+number+"\n";
			symOffset[base] = symOffset[base]+number;
		}
		newTexts.put(ctx, temp);
	}

	@Override public void exitAssign_stmt( MiniGoParser.Assign_stmtContext ctx) { 
		String temp = newTexts.get(ctx);
		if(ctx.getChildCount() == 4){
			Variable va = searchVariable(ctx.getChild(0).getText());
			temp += newTexts.get(ctx.getChild(3));
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";
		}
		else if(ctx.getChildCount() == 5){
			Variable va = searchVariable(ctx.getChild(1).getText());
			temp += newTexts.get(ctx.getChild(4));
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";

		}
		else if(ctx.getChildCount() == 9){
			Variable va = searchVariable(ctx.getChild(1).getText());
			temp += whiteSpace(0) + "ldc "+ctx.getChild(6).getText()+"\n";
			temp += whiteSpace(0) + "str "+va.base+" "+va.offset+"\n";

			va = searchVariable(ctx.getChild(3).getText());
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
			Variable va = searchVariable(ctx.getChild(1).getText());
			temp += whiteSpace(0) + "lod "+va.base+" "+va.offset+"\n";
			temp += whiteSpace(0) + "retv\n";
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

	private Variable searchVariable(String name){
		Table t = stack.peek();
		Variable var = null;

		while(t != null){
			if(t.v.get(name)!=null){
				var = t.v.get(name);
				break;
			}
			t = t.parent;
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
}
