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
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, VOID=22, VAR=23, FUNC=24, 
		FMT=25, INT=26, BOOL=27, FOR=28, SWITCH=29, CASE=30, IF=31, ELSE=32, RETURN=33, 
		OR=34, AND=35, LE=36, GE=37, EQ=38, NE=39, BREAK=40, CONTINUE=41, IDENT=42, 
		LITERAL=43, DecimalConstant=44, OctalConstant=45, HexadecimalConstant=46, 
		WS=47;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "':'", "'{'", "'['", "'<'", "'++'", "'--'", "'}'", 
		"'='", "']'", "'>'", "'?'", "'!'", "'%'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'void'", "'var'", "'func'", "'fmt'", "'int'", "'bool'", 
		"'for'", "'switch'", "'case'", "'if'", "'else'", "'return'", "'or'", "'and'", 
		"'<='", "'>='", "'=='", "'!='", "'break'", "'continue'", "IDENT", "LITERAL", 
		"DecimalConstant", "OctalConstant", "HexadecimalConstant", "WS"
	};
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_fun_decl = 4, RULE_params = 5, RULE_param = 6, RULE_stmt = 7, RULE_expr_stmt = 8, 
		RULE_assign_stmt = 9, RULE_compound_stmt = 10, RULE_if_stmt = 11, RULE_three_stmt = 12, 
		RULE_for_stmt = 13, RULE_break_stmt = 14, RULE_continue_stmt = 15, RULE_switch_stmt = 16, 
		RULE_case_stmt = 17, RULE_return_stmt = 18, RULE_local_decl = 19, RULE_expr = 20, 
		RULE_args = 21;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
		"stmt", "expr_stmt", "assign_stmt", "compound_stmt", "if_stmt", "three_stmt", 
		"for_stmt", "break_stmt", "continue_stmt", "switch_stmt", "case_stmt", 
		"return_stmt", "local_decl", "expr", "args"
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); decl();
				}
				}
				setState(47); 
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
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); var_decl();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); fun_decl();
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
		public TerminalNode IDENT(int i) {
			return getToken(MiniGoParser.IDENT, i);
		}
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MiniGoParser.IDENT); }
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
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(VAR);
				setState(54); match(IDENT);
				setState(55); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(VAR);
				setState(57); match(IDENT);
				setState(58); match(T__2);
				setState(59); match(IDENT);
				setState(60); type_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(VAR);
				setState(62); match(IDENT);
				setState(63); match(T__17);
				setState(64); match(LITERAL);
				setState(65); match(T__11);
				setState(66); type_spec();
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
		enterRule(_localctx, 6, RULE_type_spec);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(VOID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); match(BOOL);
				}
				break;
			case EOF:
			case T__18:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__8:
			case T__6:
			case T__5:
			case T__3:
			case T__2:
			case T__1:
			case VAR:
			case FUNC:
			case FMT:
			case FOR:
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
		enterRule(_localctx, 8, RULE_fun_decl);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(FUNC);
				setState(76); match(IDENT);
				setState(77); match(T__6);
				setState(78); params();
				setState(79); match(T__5);
				setState(80); type_spec();
				setState(81); compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(FUNC);
				setState(84); match(IDENT);
				setState(85); match(T__6);
				setState(86); params();
				setState(87); match(T__5);
				setState(88); match(T__6);
				setState(89); type_spec();
				setState(90); match(T__2);
				setState(91); type_spec();
				setState(92); match(T__5);
				setState(93); compound_stmt();
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
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(106);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); param();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(99); match(T__2);
					setState(100); param();
					}
					}
					setState(105);
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
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(IDENT);
				setState(109); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(IDENT);
				setState(111); match(T__17);
				setState(112); match(T__11);
				setState(113); type_spec();
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
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); expr_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); compound_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); assign_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); switch_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122); return_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123); three_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124); break_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(125); continue_stmt();
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
		enterRule(_localctx, 16, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); expr(0);
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
		enterRule(_localctx, 18, RULE_assign_stmt);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(VAR);
				setState(131); match(IDENT);
				setState(132); match(T__2);
				setState(133); match(IDENT);
				setState(134); type_spec();
				setState(135); match(T__12);
				setState(136); match(LITERAL);
				setState(137); match(T__2);
				setState(138); match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(VAR);
				setState(141); match(IDENT);
				setState(142); type_spec();
				setState(143); match(T__12);
				setState(144); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(IDENT);
				setState(147); type_spec();
				setState(148); match(T__12);
				setState(149); expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151); match(IDENT);
				setState(152); match(T__17);
				setState(153); expr(0);
				setState(154); match(T__11);
				setState(155); match(T__12);
				setState(156); expr(0);
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
		enterRule(_localctx, 20, RULE_compound_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(T__18);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161); local_decl();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << SWITCH) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(167); stmt();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(173); case_stmt();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179); match(T__13);
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
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(IF);
				setState(182); expr(0);
				setState(183); compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(IF);
				setState(186); expr(0);
				setState(187); compound_stmt();
				setState(188); match(ELSE);
				setState(189); compound_stmt();
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
		enterRule(_localctx, 24, RULE_three_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); expr(0);
			setState(194); match(T__9);
			{
			setState(195); stmt();
			}
			setState(196); match(T__19);
			setState(197); stmt();
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
		enterRule(_localctx, 26, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(FOR);
			setState(200); expr(0);
			setState(201); compound_stmt();
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
		enterRule(_localctx, 28, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(BREAK);
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
		enterRule(_localctx, 30, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(CONTINUE);
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
		enterRule(_localctx, 32, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(SWITCH);
			setState(208); expr(0);
			setState(209); compound_stmt();
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
		enterRule(_localctx, 34, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(CASE);
			setState(212); match(LITERAL);
			setState(213); match(T__19);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << SWITCH) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(214); stmt();
				}
				}
				setState(219);
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
		enterRule(_localctx, 36, RULE_return_stmt);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); match(RETURN);
				setState(221); expr(0);
				setState(222); match(T__2);
				setState(223); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); match(RETURN);
				setState(226); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227); match(RETURN);
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
		public TerminalNode LITERAL() { return getToken(MiniGoParser.LITERAL, 0); }
		public TerminalNode IDENT() { return getToken(MiniGoParser.IDENT, 0); }
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
		enterRule(_localctx, 38, RULE_local_decl);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); match(VAR);
				setState(231); match(IDENT);
				setState(232); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(VAR);
				setState(234); match(IDENT);
				setState(235); match(T__17);
				setState(236); match(LITERAL);
				setState(237); match(T__11);
				setState(238); type_spec();
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
		public TerminalNode GE() { return getToken(MiniGoParser.GE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(242);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__3) | (1L << T__1))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(243); expr(8);
				}
				break;
			case 2:
				{
				setState(244); match(IDENT);
				setState(245); match(T__12);
				setState(246); expr(3);
				}
				break;
			case 3:
				{
				setState(247); match(T__6);
				setState(248); expr(0);
				setState(249); match(T__5);
				}
				break;
			case 4:
				{
				setState(251); match(IDENT);
				setState(252); match(T__17);
				setState(253); expr(0);
				setState(254); match(T__11);
				}
				break;
			case 5:
				{
				setState(256); match(IDENT);
				setState(257); match(T__6);
				setState(258); args();
				setState(259); match(T__5);
				}
				break;
			case 6:
				{
				setState(261); match(FMT);
				setState(262); match(T__0);
				setState(263); match(IDENT);
				setState(264); match(T__6);
				setState(265); args();
				setState(266); match(T__5);
				}
				break;
			case 7:
				{
				setState(268); match(LITERAL);
				setState(269); match(T__2);
				setState(270); match(LITERAL);
				}
				break;
			case 8:
				{
				setState(271); match(IDENT);
				setState(272); match(T__17);
				setState(273); expr(0);
				setState(274); match(T__11);
				setState(275); match(T__12);
				setState(276); expr(0);
				}
				break;
			case 9:
				{
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(282);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__7) | (1L << T__4))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(283); ((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(284);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(285);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__1) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(286); ((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(288);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__10) | (1L << OR) | (1L << AND) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(289); ((ExprContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 42, RULE_args);
		int _la;
		try {
			setState(304);
			switch (_input.LA(1)) {
			case T__15:
			case T__14:
			case T__8:
			case T__6:
			case T__3:
			case T__1:
			case FMT:
			case IDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(295); expr(0);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(296); match(T__2);
					setState(297); expr(0);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0135\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3"+
		"\7\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bu\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a1\n\13\3\f\3\f\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\f\7"+
		"\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\f\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00da\n\23\f\23\16\23\u00dd\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e7\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f2\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u0125\n\26\f\26\16\26\u0128\13\26\3\27\3\27"+
		"\3\27\7\27\u012d\n\27\f\27\16\27\u0130\13\27\3\27\5\27\u0133\n\27\3\27"+
		"\2\3*\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\6\2\b\t\17"+
		"\17\24\24\26\26\3\2,-\5\2\3\3\20\20\23\23\4\2\24\24\26\26\5\2\7\7\r\r"+
		"$)\u014a\2/\3\2\2\2\4\65\3\2\2\2\6E\3\2\2\2\bK\3\2\2\2\na\3\2\2\2\fl\3"+
		"\2\2\2\16t\3\2\2\2\20\u0080\3\2\2\2\22\u0082\3\2\2\2\24\u00a0\3\2\2\2"+
		"\26\u00a2\3\2\2\2\30\u00c1\3\2\2\2\32\u00c3\3\2\2\2\34\u00c9\3\2\2\2\36"+
		"\u00cd\3\2\2\2 \u00cf\3\2\2\2\"\u00d1\3\2\2\2$\u00d5\3\2\2\2&\u00e6\3"+
		"\2\2\2(\u00f1\3\2\2\2*\u0119\3\2\2\2,\u0132\3\2\2\2.\60\5\4\3\2/.\3\2"+
		"\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\66\5\6\4"+
		"\2\64\66\5\n\6\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\31\2\2"+
		"89\7,\2\29F\5\b\5\2:;\7\31\2\2;<\7,\2\2<=\7\25\2\2=>\7,\2\2>F\5\b\5\2"+
		"?@\7\31\2\2@A\7,\2\2AB\7\6\2\2BC\7-\2\2CD\7\f\2\2DF\5\b\5\2E\67\3\2\2"+
		"\2E:\3\2\2\2E?\3\2\2\2F\7\3\2\2\2GL\7\34\2\2HL\7\30\2\2IL\7\35\2\2JL\3"+
		"\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\7\32\2\2N"+
		"O\7,\2\2OP\7\21\2\2PQ\5\f\7\2QR\7\22\2\2RS\5\b\5\2ST\5\26\f\2Tb\3\2\2"+
		"\2UV\7\32\2\2VW\7,\2\2WX\7\21\2\2XY\5\f\7\2YZ\7\22\2\2Z[\7\21\2\2[\\\5"+
		"\b\5\2\\]\7\25\2\2]^\5\b\5\2^_\7\22\2\2_`\5\26\f\2`b\3\2\2\2aM\3\2\2\2"+
		"aU\3\2\2\2b\13\3\2\2\2cm\3\2\2\2di\5\16\b\2ef\7\25\2\2fh\5\16\b\2ge\3"+
		"\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2lc\3\2\2\2ld\3"+
		"\2\2\2m\r\3\2\2\2no\7,\2\2ou\5\b\5\2pq\7,\2\2qr\7\6\2\2rs\7\f\2\2su\5"+
		"\b\5\2tn\3\2\2\2tp\3\2\2\2u\17\3\2\2\2v\u0081\5\22\n\2w\u0081\5\26\f\2"+
		"x\u0081\5\24\13\2y\u0081\5\30\r\2z\u0081\5\34\17\2{\u0081\5\"\22\2|\u0081"+
		"\5&\24\2}\u0081\5\32\16\2~\u0081\5\36\20\2\177\u0081\5 \21\2\u0080v\3"+
		"\2\2\2\u0080w\3\2\2\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2"+
		"\2\u0081\21\3\2\2\2\u0082\u0083\5*\26\2\u0083\23\3\2\2\2\u0084\u0085\7"+
		"\31\2\2\u0085\u0086\7,\2\2\u0086\u0087\7\25\2\2\u0087\u0088\7,\2\2\u0088"+
		"\u0089\5\b\5\2\u0089\u008a\7\13\2\2\u008a\u008b\7-\2\2\u008b\u008c\7\25"+
		"\2\2\u008c\u008d\7-\2\2\u008d\u00a1\3\2\2\2\u008e\u008f\7\31\2\2\u008f"+
		"\u0090\7,\2\2\u0090\u0091\5\b\5\2\u0091\u0092\7\13\2\2\u0092\u0093\5*"+
		"\26\2\u0093\u00a1\3\2\2\2\u0094\u0095\7,\2\2\u0095\u0096\5\b\5\2\u0096"+
		"\u0097\7\13\2\2\u0097\u0098\5*\26\2\u0098\u00a1\3\2\2\2\u0099\u009a\7"+
		",\2\2\u009a\u009b\7\6\2\2\u009b\u009c\5*\26\2\u009c\u009d\7\f\2\2\u009d"+
		"\u009e\7\13\2\2\u009e\u009f\5*\26\2\u009f\u00a1\3\2\2\2\u00a0\u0084\3"+
		"\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u0099\3\2\2\2\u00a1"+
		"\25\3\2\2\2\u00a2\u00a6\7\5\2\2\u00a3\u00a5\5(\25\2\u00a4\u00a3\3\2\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ac"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5\20\t\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b2"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\5$\23\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\n\2\2\u00b6\27\3\2\2\2\u00b7\u00b8"+
		"\7!\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\5\26\f\2\u00ba\u00c2\3\2\2\2\u00bb"+
		"\u00bc\7!\2\2\u00bc\u00bd\5*\26\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\""+
		"\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1"+
		"\u00bb\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7\16\2"+
		"\2\u00c5\u00c6\5\20\t\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\5\20\t\2\u00c8"+
		"\33\3\2\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00cb\5*\26\2\u00cb\u00cc\5\26"+
		"\f\2\u00cc\35\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce\37\3\2\2\2\u00cf\u00d0"+
		"\7+\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7\37\2\2\u00d2\u00d3\5*\26\2\u00d3"+
		"\u00d4\5\26\f\2\u00d4#\3\2\2\2\u00d5\u00d6\7 \2\2\u00d6\u00d7\7-\2\2\u00d7"+
		"\u00db\7\4\2\2\u00d8\u00da\5\20\t\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc%\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00de\u00df\7#\2\2\u00df\u00e0\5*\26\2\u00e0\u00e1\7\25\2\2\u00e1"+
		"\u00e2\5*\26\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e7\5*\26"+
		"\2\u00e5\u00e7\7#\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\'\3\2\2\2\u00e8\u00e9\7\31\2\2\u00e9\u00ea\7,\2\2\u00ea"+
		"\u00f2\5\b\5\2\u00eb\u00ec\7\31\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7\6"+
		"\2\2\u00ee\u00ef\7-\2\2\u00ef\u00f0\7\f\2\2\u00f0\u00f2\5\b\5\2\u00f1"+
		"\u00e8\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f4\b\26\1\2"+
		"\u00f4\u00f5\t\2\2\2\u00f5\u011a\5*\26\n\u00f6\u00f7\7,\2\2\u00f7\u00f8"+
		"\7\13\2\2\u00f8\u011a\5*\26\5\u00f9\u00fa\7\21\2\2\u00fa\u00fb\5*\26\2"+
		"\u00fb\u00fc\7\22\2\2\u00fc\u011a\3\2\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff"+
		"\7\6\2\2\u00ff\u0100\5*\26\2\u0100\u0101\7\f\2\2\u0101\u011a\3\2\2\2\u0102"+
		"\u0103\7,\2\2\u0103\u0104\7\21\2\2\u0104\u0105\5,\27\2\u0105\u0106\7\22"+
		"\2\2\u0106\u011a\3\2\2\2\u0107\u0108\7\33\2\2\u0108\u0109\7\27\2\2\u0109"+
		"\u010a\7,\2\2\u010a\u010b\7\21\2\2\u010b\u010c\5,\27\2\u010c\u010d\7\22"+
		"\2\2\u010d\u011a\3\2\2\2\u010e\u010f\7-\2\2\u010f\u0110\7\25\2\2\u0110"+
		"\u011a\7-\2\2\u0111\u0112\7,\2\2\u0112\u0113\7\6\2\2\u0113\u0114\5*\26"+
		"\2\u0114\u0115\7\f\2\2\u0115\u0116\7\13\2\2\u0116\u0117\5*\26\2\u0117"+
		"\u011a\3\2\2\2\u0118\u011a\t\3\2\2\u0119\u00f3\3\2\2\2\u0119\u00f6\3\2"+
		"\2\2\u0119\u00f9\3\2\2\2\u0119\u00fd\3\2\2\2\u0119\u0102\3\2\2\2\u0119"+
		"\u0107\3\2\2\2\u0119\u010e\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\u0126\3\2\2\2\u011b\u011c\f\t\2\2\u011c\u011d\t\4\2\2\u011d"+
		"\u0125\5*\26\n\u011e\u011f\f\b\2\2\u011f\u0120\t\5\2\2\u0120\u0125\5*"+
		"\26\t\u0121\u0122\f\7\2\2\u0122\u0123\t\6\2\2\u0123\u0125\5*\26\b\u0124"+
		"\u011b\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127+\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012e\5*\26\2\u012a\u012b\7\25\2\2\u012b\u012d\5*\26\2"+
		"\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0133\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0129\3\2\2\2\u0132\u0131\3\2\2\2\u0133-\3\2\2\2\30\61\65EKailt\u0080"+
		"\u00a0\u00a6\u00ac\u00b2\u00c1\u00db\u00e6\u00f1\u0119\u0124\u0126\u012e"+
		"\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}