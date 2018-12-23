// Generated from MiniGo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, IMPORT=27, ARRAYLIST=28, POLLD=29, PEEKD=30, SIZED=31, 
		EMPTYD=32, PUSHD=33, PUSHS=34, POPS=35, PEEKS=36, SIZES=37, EMPTYS=38, 
		QUEUE=39, STACK=40, VOID=41, VAR=42, FUNC=43, FMT=44, INT=45, BOOL=46, 
		FOR=47, WHILE=48, SWITCH=49, CASE=50, IF=51, ELSE=52, RETURN=53, OR=54, 
		AND=55, LE=56, GE=57, EQ=58, NE=59, BREAK=60, CONTINUE=61, IDENT=62, LITERAL=63, 
		DecimalConstant=64, OctalConstant=65, HexadecimalConstant=66, WS=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'.get'", "'{'", "'}'", "'='", "'?'", "'.size'", "'.find'", 
		"'('", "'*'", "','", "'.'", "'.delete'", "':'", "'['", "'++'", "'--'", 
		"'<'", "']'", "'>'", "'.add'", "'!'", "'%'", "')'", "'+'", "'-'", "'import'", 
		"'ArrayList'", "'poll'", "'peekd'", "'sized'", "'emptyd'", "'pushd'", 
		"'pushs'", "'pop'", "'peeks'", "'sizes'", "'emptys'", "'Queue'", "'Stack'", 
		"'void'", "'var'", "'func'", "'fmt'", "'int'", "'bool'", "'for'", "'while'", 
		"'switch'", "'case'", "'if'", "'else'", "'return'", "'or'", "'and'", "'<='", 
		"'>='", "'=='", "'!='", "'break'", "'continue'", "IDENT", "LITERAL", "DecimalConstant", 
		"OctalConstant", "HexadecimalConstant", "WS"
	};
	public static final int
		RULE_program = 0, RULE_import_decl = 1, RULE_decl = 2, RULE_var_decl = 3, 
		RULE_type_spec = 4, RULE_fun_decl = 5, RULE_params = 6, RULE_param = 7, 
		RULE_stmt = 8, RULE_expr_stmt = 9, RULE_assign_stmt = 10, RULE_compound_stmt = 11, 
		RULE_if_stmt = 12, RULE_three_stmt = 13, RULE_for_stmt = 14, RULE_while_stmt = 15, 
		RULE_break_stmt = 16, RULE_continue_stmt = 17, RULE_switch_stmt = 18, 
		RULE_case_stmt = 19, RULE_return_stmt = 20, RULE_local_decl = 21, RULE_expr = 22, 
		RULE_args = 23, RULE_arrayList_expr = 24, RULE_stack_expr = 25, RULE_queue_expr = 26;
	public static final String[] ruleNames = {
		"program", "import_decl", "decl", "var_decl", "type_spec", "fun_decl", 
		"params", "param", "stmt", "expr_stmt", "assign_stmt", "compound_stmt", 
		"if_stmt", "three_stmt", "for_stmt", "while_stmt", "break_stmt", "continue_stmt", 
		"switch_stmt", "case_stmt", "return_stmt", "local_decl", "expr", "args", 
		"arrayList_expr", "stack_expr", "queue_expr"
	};

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniGoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public List<Import_declContext> import_decl() {
			return getRuleContexts(Import_declContext.class);
		}
		public Import_declContext import_decl(int i) {
			return getRuleContext(Import_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(54); import_decl();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); decl();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR || _la==FUNC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MiniGoParser.IMPORT, 0); }
		public TerminalNode ARRAYLIST() { return getToken(MiniGoParser.ARRAYLIST, 0); }
		public Import_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterImport_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitImport_decl(this);
		}
	}

	public final Import_declContext import_decl() throws RecognitionException {
		Import_declContext _localctx = new Import_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(IMPORT);
			setState(66); match(ARRAYLIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); var_decl();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); fun_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode STACK() { return getToken(MiniGoParser.STACK, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniGoParser.IDENT, i);
		}
		public TerminalNode ARRAYLIST() { return getToken(MiniGoParser.ARRAYLIST, 0); }
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MiniGoParser.IDENT); }
		public TerminalNode QUEUE() { return getToken(MiniGoParser.QUEUE, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(VAR);
				setState(73); match(IDENT);
				setState(74); type_spec();
				setState(75); match(ARRAYLIST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(VAR);
				setState(78); match(IDENT);
				setState(79); type_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); match(VAR);
				setState(81); match(IDENT);
				setState(82); match(T__15);
				setState(83); match(IDENT);
				setState(84); type_spec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); match(VAR);
				setState(86); match(IDENT);
				setState(87); match(T__11);
				setState(88); match(LITERAL);
				setState(89); match(T__7);
				setState(90); type_spec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91); match(VAR);
				setState(92); match(IDENT);
				setState(93); match(T__8);
				setState(94); type_spec();
				setState(95); match(T__6);
				setState(96); match(STACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98); match(VAR);
				setState(99); match(IDENT);
				setState(100); match(T__8);
				setState(101); type_spec();
				setState(102); match(T__6);
				setState(103); match(QUEUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(MiniGoParser.BOOL, 0); }
		public TerminalNode VOID() { return getToken(MiniGoParser.VOID, 0); }
		public TerminalNode INT() { return getToken(MiniGoParser.INT, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitType_spec(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_spec);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(VOID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); match(BOOL);
				}
				break;
			case EOF:
			case T__23:
			case T__22:
			case T__21:
			case T__17:
			case T__15:
			case T__10:
			case T__9:
			case T__6:
			case T__4:
			case T__2:
			case T__1:
			case T__0:
			case ARRAYLIST:
			case VAR:
			case FUNC:
			case FMT:
			case FOR:
			case WHILE:
			case SWITCH:
			case CASE:
			case IF:
			case RETURN:
			case BREAK:
			case CONTINUE:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public TerminalNode FUNC() { return getToken(MiniGoParser.FUNC, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitFun_decl(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun_decl);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(FUNC);
				setState(114); match(IDENT);
				setState(115); match(T__17);
				setState(116); params();
				setState(117); match(T__2);
				setState(118); type_spec();
				setState(119); compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(FUNC);
				setState(122); match(IDENT);
				setState(123); match(T__17);
				setState(124); params();
				setState(125); match(T__2);
				setState(126); match(T__17);
				setState(127); type_spec();
				setState(128); match(T__15);
				setState(129); type_spec();
				setState(130); match(T__2);
				setState(131); compound_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			setState(144);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); param();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(137); match(T__15);
					setState(138); param();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(IDENT);
				setState(147); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); match(IDENT);
				setState(149); match(T__11);
				setState(150); match(T__7);
				setState(151); type_spec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Three_stmtContext three_stmt() {
			return getRuleContext(Three_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); expr_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); compound_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); assign_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159); while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160); switch_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161); return_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162); three_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(163); break_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(164); continue_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitExpr_stmt(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(MiniGoParser.IDENT, i);
		}
		public TerminalNode LITERAL(int i) {
			return getToken(MiniGoParser.LITERAL, i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(MiniGoParser.LITERAL); }
		public List<TerminalNode> IDENT() { return getTokens(MiniGoParser.IDENT); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_stmt);
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); match(VAR);
				setState(170); match(IDENT);
				setState(171); match(T__15);
				setState(172); match(IDENT);
				setState(173); type_spec();
				setState(174); match(T__21);
				setState(175); match(LITERAL);
				setState(176); match(T__15);
				setState(177); match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179); match(VAR);
				setState(180); match(IDENT);
				setState(181); type_spec();
				setState(182); match(T__21);
				setState(183); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); match(IDENT);
				setState(186); type_spec();
				setState(187); match(T__21);
				setState(188); expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190); match(IDENT);
				setState(191); match(T__11);
				setState(192); expr(0);
				setState(193); match(T__7);
				setState(194); match(T__21);
				setState(195); expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public Case_stmtContext case_stmt(int i) {
			return getRuleContext(Case_stmtContext.class,i);
		}
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public List<Case_stmtContext> case_stmt() {
			return getRuleContexts(Case_stmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitCompound_stmt(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(T__23);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200); local_decl();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__17) | (1L << T__10) | (1L << T__9) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(206); stmt();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(212); case_stmt();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniGoParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MiniGoParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); match(IF);
				setState(221); expr(0);
				setState(222); compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(IF);
				setState(225); expr(0);
				setState(226); compound_stmt();
				setState(227); match(ELSE);
				setState(228); compound_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Three_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Three_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_three_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterThree_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitThree_stmt(this);
		}
	}

	public final Three_stmtContext three_stmt() throws RecognitionException {
		Three_stmtContext _localctx = new Three_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_three_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); expr(0);
			setState(233); match(T__20);
			{
			setState(234); stmt();
			}
			setState(235); match(T__12);
			setState(236); stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(MiniGoParser.FOR, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(FOR);
			setState(239); expr(0);
			setState(240); compound_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(MiniGoParser.WHILE, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(WHILE);
			setState(243); expr(0);
			setState(244); compound_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MiniGoParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitBreak_stmt(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MiniGoParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitContinue_stmt(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(MiniGoParser.SWITCH, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitSwitch_stmt(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(SWITCH);
			setState(251); expr(0);
			setState(252); compound_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_stmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MiniGoParser.CASE, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitCase_stmt(this);
		}
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(CASE);
			setState(255); match(LITERAL);
			setState(256); match(T__12);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__17) | (1L << T__10) | (1L << T__9) | (1L << T__4) | (1L << T__1) | (1L << T__0) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(257); stmt();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniGoParser.RETURN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return_stmt);
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); match(RETURN);
				setState(264); expr(0);
				setState(265); match(T__15);
				setState(266); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(RETURN);
				setState(269); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270); match(RETURN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniGoParser.VAR, 0); }
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode STACK() { return getToken(MiniGoParser.STACK, 0); }
		public TerminalNode ARRAYLIST() { return getToken(MiniGoParser.ARRAYLIST, 0); }
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public TerminalNode QUEUE() { return getToken(MiniGoParser.QUEUE, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitLocal_decl(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_local_decl);
		try {
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); match(VAR);
				setState(274); match(IDENT);
				setState(275); type_spec();
				setState(276); match(ARRAYLIST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); match(VAR);
				setState(279); match(IDENT);
				setState(280); type_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); match(VAR);
				setState(282); match(IDENT);
				setState(283); match(T__11);
				setState(284); match(LITERAL);
				setState(285); match(T__7);
				setState(286); type_spec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287); match(VAR);
				setState(288); match(IDENT);
				setState(289); match(T__8);
				setState(290); type_spec();
				setState(291); match(T__6);
				setState(292); match(STACK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294); match(VAR);
				setState(295); match(IDENT);
				setState(296); match(T__8);
				setState(297); type_spec();
				setState(298); match(T__6);
				setState(299); match(QUEUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public ArrayList_exprContext arrayList_expr() {
			return getRuleContext(ArrayList_exprContext.class,0);
		}
		public Stack_exprContext stack_expr() {
			return getRuleContext(Stack_exprContext.class,0);
		}
		public TerminalNode GE() { return getToken(MiniGoParser.GE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Queue_exprContext queue_expr() {
			return getRuleContext(Queue_exprContext.class,0);
		}
		public TerminalNode LITERAL(int i) {
			return getToken(MiniGoParser.LITERAL, i);
		}
		public TerminalNode LE() { return getToken(MiniGoParser.LE, 0); }
		public TerminalNode FMT() { return getToken(MiniGoParser.FMT, 0); }
		public TerminalNode OR() { return getToken(MiniGoParser.OR, 0); }
		public List<TerminalNode> LITERAL() { return getTokens(MiniGoParser.LITERAL); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode AND() { return getToken(MiniGoParser.AND, 0); }
		public TerminalNode EQ() { return getToken(MiniGoParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MiniGoParser.NE, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(304);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__9) | (1L << T__4) | (1L << T__1) | (1L << T__0))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(305); expr(8);
				}
				break;
			case 2:
				{
				setState(306); match(IDENT);
				setState(307); match(T__21);
				setState(308); expr(3);
				}
				break;
			case 3:
				{
				setState(309); match(T__17);
				setState(310); expr(0);
				setState(311); match(T__2);
				}
				break;
			case 4:
				{
				setState(313); arrayList_expr();
				}
				break;
			case 5:
				{
				setState(314); stack_expr();
				}
				break;
			case 6:
				{
				setState(315); queue_expr();
				}
				break;
			case 7:
				{
				setState(316); match(IDENT);
				setState(317); match(T__11);
				setState(318); expr(0);
				setState(319); match(T__7);
				}
				break;
			case 8:
				{
				setState(321); match(IDENT);
				setState(322); match(T__17);
				setState(323); args();
				setState(324); match(T__2);
				}
				break;
			case 9:
				{
				setState(326); match(FMT);
				setState(327); match(T__14);
				setState(328); match(IDENT);
				setState(329); match(T__17);
				setState(330); args();
				setState(331); match(T__2);
				}
				break;
			case 10:
				{
				setState(333); match(LITERAL);
				setState(334); match(T__15);
				setState(335); match(LITERAL);
				}
				break;
			case 11:
				{
				setState(336); match(IDENT);
				setState(337); match(T__11);
				setState(338); expr(0);
				setState(339); match(T__7);
				setState(340); match(T__21);
				setState(341); expr(0);
				}
				break;
			case 12:
				{
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(355);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(347);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__16) | (1L << T__3))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(348); ((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(350);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__0) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(351); ((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(353);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__6) | (1L << OR) | (1L << AND) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(354); ((ExprContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_args);
		int _la;
		try {
			setState(369);
			switch (_input.LA(1)) {
			case T__17:
			case T__10:
			case T__9:
			case T__4:
			case T__1:
			case T__0:
			case FMT:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); expr(0);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(361); match(T__15);
					setState(362); expr(0);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayList_exprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public ArrayList_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterArrayList_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitArrayList_expr(this);
		}
	}

	public final ArrayList_exprContext arrayList_expr() throws RecognitionException {
		ArrayList_exprContext _localctx = new ArrayList_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayList_expr);
		try {
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371); match(IDENT);
				setState(372); match(T__5);
				setState(373); match(T__17);
				setState(374); expr(0);
				setState(375); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377); match(IDENT);
				setState(378); match(T__18);
				setState(379); match(T__17);
				setState(380); expr(0);
				setState(381); match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383); match(IDENT);
				setState(384); match(T__19);
				setState(385); match(T__17);
				setState(386); match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387); match(IDENT);
				setState(388); match(T__24);
				setState(389); match(T__17);
				setState(390); expr(0);
				setState(391); match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393); match(IDENT);
				setState(394); match(T__24);
				setState(395); match(T__17);
				setState(396); expr(0);
				setState(397); match(T__2);
				setState(398); match(T__21);
				setState(399); expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(401); match(IDENT);
				setState(402); match(T__13);
				setState(403); match(T__17);
				setState(404); expr(0);
				setState(405); match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stack_exprContext extends ParserRuleContext {
		public TerminalNode POPS() { return getToken(MiniGoParser.POPS, 0); }
		public TerminalNode SIZES() { return getToken(MiniGoParser.SIZES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PEEKS() { return getToken(MiniGoParser.PEEKS, 0); }
		public TerminalNode PUSHS() { return getToken(MiniGoParser.PUSHS, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public TerminalNode EMPTYS() { return getToken(MiniGoParser.EMPTYS, 0); }
		public Stack_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterStack_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitStack_expr(this);
		}
	}

	public final Stack_exprContext stack_expr() throws RecognitionException {
		Stack_exprContext _localctx = new Stack_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stack_expr);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); match(IDENT);
				setState(410); match(T__14);
				setState(411); match(POPS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412); match(IDENT);
				setState(413); match(T__14);
				setState(414); match(PEEKS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415); match(IDENT);
				setState(416); match(T__14);
				setState(417); match(SIZES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418); match(IDENT);
				setState(419); match(T__14);
				setState(420); match(EMPTYS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421); match(IDENT);
				setState(422); match(T__14);
				setState(423); match(PUSHS);
				setState(424); match(T__17);
				setState(425); expr(0);
				setState(426); match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Queue_exprContext extends ParserRuleContext {
		public TerminalNode SIZED() { return getToken(MiniGoParser.SIZED, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PEEKD() { return getToken(MiniGoParser.PEEKD, 0); }
		public TerminalNode POLLD() { return getToken(MiniGoParser.POLLD, 0); }
		public TerminalNode PUSHD() { return getToken(MiniGoParser.PUSHD, 0); }
		public TerminalNode EMPTYD() { return getToken(MiniGoParser.EMPTYD, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
		public Queue_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queue_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).enterQueue_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniGoListener ) ((MiniGoListener)listener).exitQueue_expr(this);
		}
	}

	public final Queue_exprContext queue_expr() throws RecognitionException {
		Queue_exprContext _localctx = new Queue_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_queue_expr);
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); match(IDENT);
				setState(431); match(T__14);
				setState(432); match(POLLD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433); match(IDENT);
				setState(434); match(T__14);
				setState(435); match(PEEKD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436); match(IDENT);
				setState(437); match(T__14);
				setState(438); match(SIZED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439); match(IDENT);
				setState(440); match(T__14);
				setState(441); match(EMPTYD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(442); match(IDENT);
				setState(443); match(T__14);
				setState(444); match(PUSHD);
				setState(445); match(T__17);
				setState(446); expr(0);
				setState(447); match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u01c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\3\3\3\3\3\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\5\6r\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0088\n\7\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13"+
		"\b\5\b\u0093\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f\3\r\3\r\7\r\u00cc\n\r\f\r\16\r"+
		"\u00cf\13\r\3\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3\r\7\r\u00d8\n\r\f"+
		"\r\16\r\u00db\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00e9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\7\25\u0105\n\25\f\25\16\25\u0108\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0130\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u015b\n\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0166\n\30\f\30\16\30\u0169\13"+
		"\30\3\31\3\31\3\31\7\31\u016e\n\31\f\31\16\31\u0171\13\31\3\31\5\31\u0174"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019a\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01af\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01c4\n\34"+
		"\3\34\2\3.\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\7\5\2\22\23\30\30\33\34\3\2@A\5\2\3\3\f\f\31\31\3\2\33\34\5\2\24"+
		"\24\26\268=\u01ee\2;\3\2\2\2\4C\3\2\2\2\6H\3\2\2\2\bk\3\2\2\2\nq\3\2\2"+
		"\2\f\u0087\3\2\2\2\16\u0092\3\2\2\2\20\u009a\3\2\2\2\22\u00a7\3\2\2\2"+
		"\24\u00a9\3\2\2\2\26\u00c7\3\2\2\2\30\u00c9\3\2\2\2\32\u00e8\3\2\2\2\34"+
		"\u00ea\3\2\2\2\36\u00f0\3\2\2\2 \u00f4\3\2\2\2\"\u00f8\3\2\2\2$\u00fa"+
		"\3\2\2\2&\u00fc\3\2\2\2(\u0100\3\2\2\2*\u0111\3\2\2\2,\u012f\3\2\2\2."+
		"\u015a\3\2\2\2\60\u0173\3\2\2\2\62\u0199\3\2\2\2\64\u01ae\3\2\2\2\66\u01c3"+
		"\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2="+
		";\3\2\2\2>@\5\6\4\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2"+
		"CD\7\35\2\2DE\7\36\2\2E\5\3\2\2\2FI\5\b\5\2GI\5\f\7\2HF\3\2\2\2HG\3\2"+
		"\2\2I\7\3\2\2\2JK\7,\2\2KL\7@\2\2LM\5\n\6\2MN\7\36\2\2Nl\3\2\2\2OP\7,"+
		"\2\2PQ\7@\2\2Ql\5\n\6\2RS\7,\2\2ST\7@\2\2TU\7\r\2\2UV\7@\2\2Vl\5\n\6\2"+
		"WX\7,\2\2XY\7@\2\2YZ\7\21\2\2Z[\7A\2\2[\\\7\25\2\2\\l\5\n\6\2]^\7,\2\2"+
		"^_\7@\2\2_`\7\24\2\2`a\5\n\6\2ab\7\26\2\2bc\7*\2\2cl\3\2\2\2de\7,\2\2"+
		"ef\7@\2\2fg\7\24\2\2gh\5\n\6\2hi\7\26\2\2ij\7)\2\2jl\3\2\2\2kJ\3\2\2\2"+
		"kO\3\2\2\2kR\3\2\2\2kW\3\2\2\2k]\3\2\2\2kd\3\2\2\2l\t\3\2\2\2mr\7/\2\2"+
		"nr\7+\2\2or\7\60\2\2pr\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2"+
		"r\13\3\2\2\2st\7-\2\2tu\7@\2\2uv\7\13\2\2vw\5\16\b\2wx\7\32\2\2xy\5\n"+
		"\6\2yz\5\30\r\2z\u0088\3\2\2\2{|\7-\2\2|}\7@\2\2}~\7\13\2\2~\177\5\16"+
		"\b\2\177\u0080\7\32\2\2\u0080\u0081\7\13\2\2\u0081\u0082\5\n\6\2\u0082"+
		"\u0083\7\r\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7\32\2\2\u0085\u0086\5"+
		"\30\r\2\u0086\u0088\3\2\2\2\u0087s\3\2\2\2\u0087{\3\2\2\2\u0088\r\3\2"+
		"\2\2\u0089\u0093\3\2\2\2\u008a\u008f\5\20\t\2\u008b\u008c\7\r\2\2\u008c"+
		"\u008e\5\20\t\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0093\17\3\2\2\2\u0094\u0095\7@\2\2"+
		"\u0095\u009b\5\n\6\2\u0096\u0097\7@\2\2\u0097\u0098\7\21\2\2\u0098\u0099"+
		"\7\25\2\2\u0099\u009b\5\n\6\2\u009a\u0094\3\2\2\2\u009a\u0096\3\2\2\2"+
		"\u009b\21\3\2\2\2\u009c\u00a8\5\24\13\2\u009d\u00a8\5\30\r\2\u009e\u00a8"+
		"\5\26\f\2\u009f\u00a8\5\32\16\2\u00a0\u00a8\5\36\20\2\u00a1\u00a8\5 \21"+
		"\2\u00a2\u00a8\5&\24\2\u00a3\u00a8\5*\26\2\u00a4\u00a8\5\34\17\2\u00a5"+
		"\u00a8\5\"\22\2\u00a6\u00a8\5$\23\2\u00a7\u009c\3\2\2\2\u00a7\u009d\3"+
		"\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7"+
		"\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00aa"+
		"\5.\30\2\u00aa\25\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\7@\2\2\u00ad"+
		"\u00ae\7\r\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7\7"+
		"\2\2\u00b1\u00b2\7A\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7A\2\2\u00b4\u00c8"+
		"\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8\5\n\6\2\u00b8"+
		"\u00b9\7\7\2\2\u00b9\u00ba\5.\30\2\u00ba\u00c8\3\2\2\2\u00bb\u00bc\7@"+
		"\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\7\2\2\u00be\u00bf\5.\30\2\u00bf"+
		"\u00c8\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\5."+
		"\30\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5.\30\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00ab\3\2\2\2\u00c7\u00b5\3\2\2\2\u00c7\u00bb\3\2"+
		"\2\2\u00c7\u00c0\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00cd\7\5\2\2\u00ca\u00cc"+
		"\5,\27\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d3\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5\22"+
		"\n\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5("+
		"\25\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\6"+
		"\2\2\u00dd\31\3\2\2\2\u00de\u00df\7\65\2\2\u00df\u00e0\5.\30\2\u00e0\u00e1"+
		"\5\30\r\2\u00e1\u00e9\3\2\2\2\u00e2\u00e3\7\65\2\2\u00e3\u00e4\5.\30\2"+
		"\u00e4\u00e5\5\30\r\2\u00e5\u00e6\7\66\2\2\u00e6\u00e7\5\30\r\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e9\33\3\2\2"+
		"\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5\22\n\2\u00ed"+
		"\u00ee\7\20\2\2\u00ee\u00ef\5\22\n\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\61"+
		"\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f3\5\30\r\2\u00f3\37\3\2\2\2\u00f4\u00f5"+
		"\7\62\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\5\30\r\2\u00f7!\3\2\2\2\u00f8"+
		"\u00f9\7>\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb%\3\2\2\2\u00fc\u00fd"+
		"\7\63\2\2\u00fd\u00fe\5.\30\2\u00fe\u00ff\5\30\r\2\u00ff\'\3\2\2\2\u0100"+
		"\u0101\7\64\2\2\u0101\u0102\7A\2\2\u0102\u0106\7\20\2\2\u0103\u0105\5"+
		"\22\n\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107)\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\67\2\2"+
		"\u010a\u010b\5.\30\2\u010b\u010c\7\r\2\2\u010c\u010d\5.\30\2\u010d\u0112"+
		"\3\2\2\2\u010e\u010f\7\67\2\2\u010f\u0112\5.\30\2\u0110\u0112\7\67\2\2"+
		"\u0111\u0109\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112+\3"+
		"\2\2\2\u0113\u0114\7,\2\2\u0114\u0115\7@\2\2\u0115\u0116\5\n\6\2\u0116"+
		"\u0117\7\36\2\2\u0117\u0130\3\2\2\2\u0118\u0119\7,\2\2\u0119\u011a\7@"+
		"\2\2\u011a\u0130\5\n\6\2\u011b\u011c\7,\2\2\u011c\u011d\7@\2\2\u011d\u011e"+
		"\7\21\2\2\u011e\u011f\7A\2\2\u011f\u0120\7\25\2\2\u0120\u0130\5\n\6\2"+
		"\u0121\u0122\7,\2\2\u0122\u0123\7@\2\2\u0123\u0124\7\24\2\2\u0124\u0125"+
		"\5\n\6\2\u0125\u0126\7\26\2\2\u0126\u0127\7*\2\2\u0127\u0130\3\2\2\2\u0128"+
		"\u0129\7,\2\2\u0129\u012a\7@\2\2\u012a\u012b\7\24\2\2\u012b\u012c\5\n"+
		"\6\2\u012c\u012d\7\26\2\2\u012d\u012e\7)\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u0113\3\2\2\2\u012f\u0118\3\2\2\2\u012f\u011b\3\2\2\2\u012f\u0121\3\2"+
		"\2\2\u012f\u0128\3\2\2\2\u0130-\3\2\2\2\u0131\u0132\b\30\1\2\u0132\u0133"+
		"\t\2\2\2\u0133\u015b\5.\30\n\u0134\u0135\7@\2\2\u0135\u0136\7\7\2\2\u0136"+
		"\u015b\5.\30\5\u0137\u0138\7\13\2\2\u0138\u0139\5.\30\2\u0139\u013a\7"+
		"\32\2\2\u013a\u015b\3\2\2\2\u013b\u015b\5\62\32\2\u013c\u015b\5\64\33"+
		"\2\u013d\u015b\5\66\34\2\u013e\u013f\7@\2\2\u013f\u0140\7\21\2\2\u0140"+
		"\u0141\5.\30\2\u0141\u0142\7\25\2\2\u0142\u015b\3\2\2\2\u0143\u0144\7"+
		"@\2\2\u0144\u0145\7\13\2\2\u0145\u0146\5\60\31\2\u0146\u0147\7\32\2\2"+
		"\u0147\u015b\3\2\2\2\u0148\u0149\7.\2\2\u0149\u014a\7\16\2\2\u014a\u014b"+
		"\7@\2\2\u014b\u014c\7\13\2\2\u014c\u014d\5\60\31\2\u014d\u014e\7\32\2"+
		"\2\u014e\u015b\3\2\2\2\u014f\u0150\7A\2\2\u0150\u0151\7\r\2\2\u0151\u015b"+
		"\7A\2\2\u0152\u0153\7@\2\2\u0153\u0154\7\21\2\2\u0154\u0155\5.\30\2\u0155"+
		"\u0156\7\25\2\2\u0156\u0157\7\7\2\2\u0157\u0158\5.\30\2\u0158\u015b\3"+
		"\2\2\2\u0159\u015b\t\3\2\2\u015a\u0131\3\2\2\2\u015a\u0134\3\2\2\2\u015a"+
		"\u0137\3\2\2\2\u015a\u013b\3\2\2\2\u015a\u013c\3\2\2\2\u015a\u013d\3\2"+
		"\2\2\u015a\u013e\3\2\2\2\u015a\u0143\3\2\2\2\u015a\u0148\3\2\2\2\u015a"+
		"\u014f\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u0167\3\2"+
		"\2\2\u015c\u015d\f\t\2\2\u015d\u015e\t\4\2\2\u015e\u0166\5.\30\n\u015f"+
		"\u0160\f\b\2\2\u0160\u0161\t\5\2\2\u0161\u0166\5.\30\t\u0162\u0163\f\7"+
		"\2\2\u0163\u0164\t\6\2\2\u0164\u0166\5.\30\b\u0165\u015c\3\2\2\2\u0165"+
		"\u015f\3\2\2\2\u0165\u0162\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168/\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016f"+
		"\5.\30\2\u016b\u016c\7\r\2\2\u016c\u016e\5.\30\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u016a\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\61\3\2\2\2\u0175\u0176\7@\2\2\u0176\u0177\7\27\2"+
		"\2\u0177\u0178\7\13\2\2\u0178\u0179\5.\30\2\u0179\u017a\7\32\2\2\u017a"+
		"\u019a\3\2\2\2\u017b\u017c\7@\2\2\u017c\u017d\7\n\2\2\u017d\u017e\7\13"+
		"\2\2\u017e\u017f\5.\30\2\u017f\u0180\7\32\2\2\u0180\u019a\3\2\2\2\u0181"+
		"\u0182\7@\2\2\u0182\u0183\7\t\2\2\u0183\u0184\7\13\2\2\u0184\u019a\7\32"+
		"\2\2\u0185\u0186\7@\2\2\u0186\u0187\7\4\2\2\u0187\u0188\7\13\2\2\u0188"+
		"\u0189\5.\30\2\u0189\u018a\7\32\2\2\u018a\u019a\3\2\2\2\u018b\u018c\7"+
		"@\2\2\u018c\u018d\7\4\2\2\u018d\u018e\7\13\2\2\u018e\u018f\5.\30\2\u018f"+
		"\u0190\7\32\2\2\u0190\u0191\7\7\2\2\u0191\u0192\5.\30\2\u0192\u019a\3"+
		"\2\2\2\u0193\u0194\7@\2\2\u0194\u0195\7\17\2\2\u0195\u0196\7\13\2\2\u0196"+
		"\u0197\5.\30\2\u0197\u0198\7\32\2\2\u0198\u019a\3\2\2\2\u0199\u0175\3"+
		"\2\2\2\u0199\u017b\3\2\2\2\u0199\u0181\3\2\2\2\u0199\u0185\3\2\2\2\u0199"+
		"\u018b\3\2\2\2\u0199\u0193\3\2\2\2\u019a\63\3\2\2\2\u019b\u019c\7@\2\2"+
		"\u019c\u019d\7\16\2\2\u019d\u01af\7%\2\2\u019e\u019f\7@\2\2\u019f\u01a0"+
		"\7\16\2\2\u01a0\u01af\7&\2\2\u01a1\u01a2\7@\2\2\u01a2\u01a3\7\16\2\2\u01a3"+
		"\u01af\7\'\2\2\u01a4\u01a5\7@\2\2\u01a5\u01a6\7\16\2\2\u01a6\u01af\7("+
		"\2\2\u01a7\u01a8\7@\2\2\u01a8\u01a9\7\16\2\2\u01a9\u01aa\7$\2\2\u01aa"+
		"\u01ab\7\13\2\2\u01ab\u01ac\5.\30\2\u01ac\u01ad\7\32\2\2\u01ad\u01af\3"+
		"\2\2\2\u01ae\u019b\3\2\2\2\u01ae\u019e\3\2\2\2\u01ae\u01a1\3\2\2\2\u01ae"+
		"\u01a4\3\2\2\2\u01ae\u01a7\3\2\2\2\u01af\65\3\2\2\2\u01b0\u01b1\7@\2\2"+
		"\u01b1\u01b2\7\16\2\2\u01b2\u01c4\7\37\2\2\u01b3\u01b4\7@\2\2\u01b4\u01b5"+
		"\7\16\2\2\u01b5\u01c4\7 \2\2\u01b6\u01b7\7@\2\2\u01b7\u01b8\7\16\2\2\u01b8"+
		"\u01c4\7!\2\2\u01b9\u01ba\7@\2\2\u01ba\u01bb\7\16\2\2\u01bb\u01c4\7\""+
		"\2\2\u01bc\u01bd\7@\2\2\u01bd\u01be\7\16\2\2\u01be\u01bf\7#\2\2\u01bf"+
		"\u01c0\7\13\2\2\u01c0\u01c1\5.\30\2\u01c1\u01c2\7\32\2\2\u01c2\u01c4\3"+
		"\2\2\2\u01c3\u01b0\3\2\2\2\u01c3\u01b3\3\2\2\2\u01c3\u01b6\3\2\2\2\u01c3"+
		"\u01b9\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c4\67\3\2\2\2\34;AHkq\u0087\u008f"+
		"\u0092\u009a\u00a7\u00c7\u00cd\u00d3\u00d9\u00e8\u0106\u0111\u012f\u015a"+
		"\u0165\u0167\u016f\u0173\u0199\u01ae\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}