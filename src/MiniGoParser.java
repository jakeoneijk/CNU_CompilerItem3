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
		FMT=25, INT=26, BOOL=27, FOR=28, WHILE=29, SWITCH=30, CASE=31, IF=32, 
		ELSE=33, RETURN=34, OR=35, AND=36, LE=37, GE=38, EQ=39, NE=40, BREAK=41, 
		CONTINUE=42, IDENT=43, LITERAL=44, DecimalConstant=45, OctalConstant=46, 
		HexadecimalConstant=47, WS=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "':'", "'{'", "'['", "'<'", "'++'", "'--'", "'}'", 
		"'='", "']'", "'>'", "'?'", "'!'", "'%'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'void'", "'var'", "'func'", "'fmt'", "'int'", "'bool'", 
		"'for'", "'while'", "'switch'", "'case'", "'if'", "'else'", "'return'", 
		"'or'", "'and'", "'<='", "'>='", "'=='", "'!='", "'break'", "'continue'", 
		"IDENT", "LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 

		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, POLLD=20, PEEKD=21, SIZED=22, EMPTYD=23, PUSHD=24, 
		PUSHS=25, POPS=26, PEEKS=27, SIZES=28, EMPTYS=29, QUEUE=30, STACK=31, 
		VOID=32, VAR=33, FUNC=34, FMT=35, INT=36, BOOL=37, FOR=38, IF=39, ELSE=40, 
		RETURN=41, OR=42, AND=43, LE=44, GE=45, EQ=46, NE=47, IDENT=48, LITERAL=49, 
		DecimalConstant=50, OctalConstant=51, HexadecimalConstant=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'{'", "'['", "'++'", "'--'", "'<'", "'}'", "'='", 
		"']'", "'>'", "'!'", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "'poll'", "'peekd'", "'sized'", "'emptyd'", "'pushd'", "'pushs'", 
		"'pop'", "'peeks'", "'sizes'", "'emptys'", "'Queue'", "'Stack'", "'void'", 
		"'var'", "'func'", "'fmt'", "'int'", "'bool'", "'for'", "'if'", "'else'", 
		"'return'", "'or'", "'and'", "'<='", "'>='", "'=='", "'!='", "IDENT", 
		"LITERAL", "DecimalConstant", "OctalConstant", "HexadecimalConstant", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_fun_decl = 4, RULE_params = 5, RULE_param = 6, RULE_stmt = 7, RULE_expr_stmt = 8, 

		RULE_assign_stmt = 9, RULE_compound_stmt = 10, RULE_if_stmt = 11, RULE_three_stmt = 12, 
		RULE_for_stmt = 13, RULE_while_stmt = 14, RULE_break_stmt = 15, RULE_continue_stmt = 16, 
		RULE_switch_stmt = 17, RULE_case_stmt = 18, RULE_return_stmt = 19, RULE_local_decl = 20, 
		RULE_expr = 21, RULE_args = 22;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
		"stmt", "expr_stmt", "assign_stmt", "compound_stmt", "if_stmt", "three_stmt", 
		"for_stmt", "while_stmt", "break_stmt", "continue_stmt", "switch_stmt", 
		"case_stmt", "return_stmt", "local_decl", "expr", "args"
	};

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

	@Override

		RULE_assign_stmt = 9, RULE_compound_stmt = 10, RULE_if_stmt = 11, RULE_for_stmt = 12, 
		RULE_return_stmt = 13, RULE_local_decl = 14, RULE_expr = 15, RULE_args = 16, 
		RULE_stack_expr = 17, RULE_queue_expr = 18;
	public static final String[] ruleNames = {
		"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
		"stmt", "expr_stmt", "assign_stmt", "compound_stmt", "if_stmt", "for_stmt", 
		"return_stmt", "local_decl", "expr", "args", "stack_expr", "queue_expr"
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

			setState(47); 

			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{

				setState(46); decl();
				}
				}
				setState(49); 

				setState(38); decl();
				}
				}
				setState(41); 
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

			setState(53);

			setState(45);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{

				setState(51); var_decl();

				setState(43); var_decl();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{

				setState(52); fun_decl();

				setState(44); fun_decl();
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
		enterRule(_localctx, 4, RULE_var_decl);
		try {

			setState(69);

			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

				setState(55); match(VAR);
				setState(56); match(IDENT);
				setState(57); type_spec();

				setState(47); match(VAR);
				setState(48); match(IDENT);
				setState(49); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(58); match(VAR);
				setState(59); match(IDENT);
				setState(60); match(T__2);
				setState(61); match(IDENT);
				setState(62); type_spec();

				setState(50); match(VAR);
				setState(51); match(IDENT);
				setState(52); match(T__2);
				setState(53); match(IDENT);
				setState(54); type_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{

				setState(63); match(VAR);
				setState(64); match(IDENT);
				setState(65); match(T__17);
				setState(66); match(LITERAL);
				setState(67); match(T__11);
				setState(68); type_spec();

				setState(55); match(VAR);
				setState(56); match(IDENT);
				setState(57); match(T__16);
				setState(58); match(LITERAL);
				setState(59); match(T__10);
				setState(60); type_spec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); match(VAR);
				setState(62); match(IDENT);
				setState(63); match(T__13);
				setState(64); type_spec();
				setState(65); match(T__9);
				setState(66); match(STACK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); match(VAR);
				setState(69); match(IDENT);
				setState(70); match(T__13);
				setState(71); type_spec();
				setState(72); match(T__9);
				setState(73); match(QUEUE);
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

			setState(75);

			setState(81);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{

				setState(71); match(INT);

				setState(77); match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{

				setState(72); match(VOID);

				setState(78); match(VOID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{

				setState(73); match(BOOL);
				}
				break;
			case EOF:
			case T__18:
			case T__15:
			case T__14:
			case T__13:
			case T__12:

				setState(79); match(BOOL);
				}
				break;
			case EOF:
			case T__17:
			case T__15:
			case T__14:
			case T__12:
			case T__11:
			case T__9:
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
		enterRule(_localctx, 8, RULE_fun_decl);
		try {

			setState(97);

			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

				setState(77); match(FUNC);
				setState(78); match(IDENT);
				setState(79); match(T__6);
				setState(80); params();
				setState(81); match(T__5);
				setState(82); type_spec();
				setState(83); compound_stmt();

				setState(83); match(FUNC);
				setState(84); match(IDENT);
				setState(85); match(T__6);
				setState(86); params();
				setState(87); match(T__5);
				setState(88); type_spec();
				setState(89); compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(85); match(FUNC);
				setState(86); match(IDENT);
				setState(87); match(T__6);
				setState(88); params();
				setState(89); match(T__5);
				setState(90); match(T__6);
				setState(91); type_spec();
				setState(92); match(T__2);
				setState(93); type_spec();
				setState(94); match(T__5);
				setState(95); compound_stmt();

				setState(91); match(FUNC);
				setState(92); match(IDENT);
				setState(93); match(T__6);
				setState(94); params();
				setState(95); match(T__5);
				setState(96); match(T__6);
				setState(97); type_spec();
				setState(98); match(T__2);
				setState(99); type_spec();
				setState(100); match(T__5);
				setState(101); compound_stmt();
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

			setState(108);

			setState(114);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{

				setState(100); param();
				setState(105);

				setState(106); param();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{

					setState(101); match(T__2);
					setState(102); param();
					}
					}
					setState(107);

					setState(107); match(T__2);
					setState(108); param();
					}
					}
					setState(113);
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

			setState(116);

			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

				setState(110); match(IDENT);
				setState(111); type_spec();

				setState(116); match(IDENT);
				setState(117); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(112); match(IDENT);
				setState(113); match(T__17);
				setState(114); match(T__11);
				setState(115); type_spec();

				setState(118); match(IDENT);
				setState(119); match(T__16);
				setState(120); match(T__10);
				setState(121); type_spec();
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

		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
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

			setState(129);

			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

				setState(118); expr_stmt();

				setState(124); expr_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(119); compound_stmt();

				setState(125); compound_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{

				setState(120); assign_stmt();

				setState(126); assign_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{

				setState(121); if_stmt();

				setState(127); if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{

				setState(122); for_stmt();

				setState(128); for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{

				setState(123); while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124); switch_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125); return_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126); three_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(127); break_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(128); continue_stmt();

				setState(129); return_stmt();
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

			setState(131); expr(0);

			setState(132); expr(0);
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

			setState(161);

			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

				setState(133); match(VAR);
				setState(134); match(IDENT);
				setState(135); match(T__2);
				setState(136); match(IDENT);
				setState(137); type_spec();
				setState(138); match(T__12);
				setState(139); match(LITERAL);
				setState(140); match(T__2);
				setState(141); match(LITERAL);

				setState(134); match(VAR);
				setState(135); match(IDENT);
				setState(136); match(T__2);
				setState(137); match(IDENT);
				setState(138); type_spec();
				setState(139); match(T__11);
				setState(140); match(LITERAL);
				setState(141); match(T__2);
				setState(142); match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(143); match(VAR);
				setState(144); match(IDENT);
				setState(145); type_spec();
				setState(146); match(T__12);
				setState(147); expr(0);

				setState(144); match(VAR);
				setState(145); match(IDENT);
				setState(146); type_spec();
				setState(147); match(T__11);
				setState(148); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{

				setState(149); match(IDENT);
				setState(150); type_spec();
				setState(151); match(T__12);
				setState(152); expr(0);

				setState(150); match(IDENT);
				setState(151); type_spec();
				setState(152); match(T__11);
				setState(153); expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{

				setState(154); match(IDENT);
				setState(155); match(T__17);
				setState(156); expr(0);
				setState(157); match(T__11);
				setState(158); match(T__12);
				setState(159); expr(0);

				setState(155); match(IDENT);
				setState(156); match(T__16);
				setState(157); expr(0);
				setState(158); match(T__10);
				setState(159); match(T__11);
				setState(160); expr(0);
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

			setState(163); match(T__18);
			setState(167);

			setState(164); match(T__17);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{

					setState(164); local_decl();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(170); stmt();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(176); case_stmt();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182); match(T__13);

					setState(165); local_decl();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(171); stmt();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(T__12);
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

			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(IF);
				setState(185); expr(0);
				setState(186); compound_stmt();

			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(IF);
				setState(180); expr(0);
				setState(181); compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(188); match(IF);
				setState(189); expr(0);
				setState(190); compound_stmt();
				setState(191); match(ELSE);
				setState(192); compound_stmt();

				setState(183); match(IF);
				setState(184); expr(0);
				setState(185); compound_stmt();
				setState(186); match(ELSE);
				setState(187); compound_stmt();
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
			setState(196); expr(0);
			setState(197); match(T__9);
			{
			setState(198); stmt();
			}
			setState(199); match(T__19);
			setState(200); stmt();
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

			setState(202); match(FOR);
			setState(203); expr(0);
			setState(204); compound_stmt();
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
		enterRule(_localctx, 28, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(WHILE);
			setState(207); expr(0);
			setState(208); compound_stmt();
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
		enterRule(_localctx, 30, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(BREAK);
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
		enterRule(_localctx, 32, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(CONTINUE);
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
		enterRule(_localctx, 34, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(SWITCH);
			setState(215); expr(0);
			setState(216); compound_stmt();
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
		enterRule(_localctx, 36, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(CASE);
			setState(219); match(LITERAL);
			setState(220); match(T__19);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << VAR) | (1L << FMT) | (1L << FOR) | (1L << WHILE) | (1L << SWITCH) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(221); stmt();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			setState(191); match(FOR);
			setState(192); expr(0);
			setState(193); compound_stmt();
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
		enterRule(_localctx, 38, RULE_return_stmt);
		try {

			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); match(RETURN);
				setState(228); expr(0);
				setState(229); match(T__2);
				setState(230); expr(0);

			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); match(RETURN);
				setState(196); expr(0);
				setState(197); match(T__2);
				setState(198); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(232); match(RETURN);
				setState(233); expr(0);

				setState(200); match(RETURN);
				setState(201); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{

				setState(234); match(RETURN);

				setState(202); match(RETURN);
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
		enterRule(_localctx, 40, RULE_local_decl);
		try {

			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); match(VAR);
				setState(238); match(IDENT);
				setState(239); type_spec();

			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(VAR);
				setState(206); match(IDENT);
				setState(207); type_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				setState(240); match(VAR);
				setState(241); match(IDENT);
				setState(242); match(T__17);
				setState(243); match(LITERAL);
				setState(244); match(T__11);
				setState(245); type_spec();

				setState(208); match(VAR);
				setState(209); match(IDENT);
				setState(210); match(T__16);
				setState(211); match(LITERAL);
				setState(212); match(T__10);
				setState(213); type_spec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214); match(VAR);
				setState(215); match(IDENT);
				setState(216); match(T__13);
				setState(217); type_spec();
				setState(218); match(T__9);
				setState(219); match(STACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221); match(VAR);
				setState(222); match(IDENT);
				setState(223); match(T__13);
				setState(224); type_spec();
				setState(225); match(T__9);
				setState(226); match(QUEUE);
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


		public Stack_exprContext stack_expr() {
			return getRuleContext(Stack_exprContext.class,0);
		}
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(249);

			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(231);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__8) | (1L << T__3) | (1L << T__1))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();

				setState(250); expr(8);

				setState(232); expr(8);
				}
				break;
			case 2:
				{

				setState(251); match(IDENT);
				setState(252); match(T__12);
				setState(253); expr(3);

				setState(233); match(IDENT);
				setState(234); match(T__11);
				setState(235); expr(3);
				}
				break;
			case 3:
				{

				setState(254); match(T__6);
				setState(255); expr(0);
				setState(256); match(T__5);

				setState(236); match(T__6);
				setState(237); expr(0);
				setState(238); match(T__5);
				}
				break;
			case 4:
				{

				setState(258); match(IDENT);
				setState(259); match(T__17);
				setState(260); expr(0);
				setState(261); match(T__11);

				setState(240); stack_expr();
				}
				break;
			case 5:
				{

				setState(263); match(IDENT);
				setState(264); match(T__6);
				setState(265); args();
				setState(266); match(T__5);

				setState(241); queue_expr();
				}
				break;
			case 6:
				{

				setState(268); match(FMT);
				setState(269); match(T__0);
				setState(270); match(IDENT);
				setState(271); match(T__6);
				setState(272); args();
				setState(273); match(T__5);

				setState(242); match(IDENT);
				setState(243); match(T__16);
				setState(244); expr(0);
				setState(245); match(T__10);
				}
				break;
			case 7:
				{

				setState(275); match(LITERAL);
				setState(276); match(T__2);
				setState(277); match(LITERAL);

				setState(247); match(IDENT);
				setState(248); match(T__6);
				setState(249); args();
				setState(250); match(T__5);
				}
				break;
			case 8:
				{

				setState(278); match(IDENT);
				setState(279); match(T__17);
				setState(280); expr(0);
				setState(281); match(T__11);
				setState(282); match(T__12);
				setState(283); expr(0);

				setState(252); match(FMT);
				setState(253); match(T__0);
				setState(254); match(IDENT);
				setState(255); match(T__6);
				setState(256); args();
				setState(257); match(T__5);
				}
				break;
			case 9:
				{

				setState(285);

				setState(259); match(LITERAL);
				setState(260); match(T__2);
				setState(261); match(LITERAL);
				}
				break;
			case 10:
				{
				setState(262); match(IDENT);
				setState(263); match(T__16);
				setState(264); expr(0);
				setState(265); match(T__10);
				setState(266); match(T__11);
				setState(267); expr(0);
				}
				break;
			case 11:
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);

			setState(299);

			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{

					setState(297);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {

					setState(281);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);

						setState(288);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(289);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__7) | (1L << T__4))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(290); ((ExprContext)_localctx).right = expr(8);

						setState(272);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(273);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__7) | (1L << T__4))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(274); ((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);

						setState(291);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(292);

						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(276);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__1) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();

						setState(293); ((ExprContext)_localctx).right = expr(7);

						setState(277); ((ExprContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);

						setState(294);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(295);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__10) | (1L << OR) | (1L << AND) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(296); ((ExprContext)_localctx).right = expr(6);

						setState(278);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(279);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__9) | (1L << OR) | (1L << AND) | (1L << LE) | (1L << GE) | (1L << EQ) | (1L << NE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(280); ((ExprContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}

				setState(301);

				setState(285);
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
		enterRule(_localctx, 44, RULE_args);
		int _la;
		try {

			setState(311);

			setState(295);
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

				setState(302); expr(0);
				setState(307);

				setState(286); expr(0);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{

					setState(303); match(T__2);
					setState(304); expr(0);
					}
					}
					setState(309);

					setState(287); match(T__2);
					setState(288); expr(0);
					}
					}
					setState(293);
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
		enterRule(_localctx, 34, RULE_stack_expr);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); match(IDENT);
				setState(298); match(T__0);
				setState(299); match(POPS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(IDENT);
				setState(301); match(T__0);
				setState(302); match(PEEKS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); match(IDENT);
				setState(304); match(T__0);
				setState(305); match(SIZES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306); match(IDENT);
				setState(307); match(T__0);
				setState(308); match(EMPTYS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309); match(IDENT);
				setState(310); match(T__0);
				setState(311); match(PUSHS);
				setState(312); match(T__6);
				setState(313); expr(0);
				setState(314); match(T__5);
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
		enterRule(_localctx, 36, RULE_queue_expr);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(IDENT);
				setState(319); match(T__0);
				setState(320); match(POLLD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); match(IDENT);
				setState(322); match(T__0);
				setState(323); match(PEEKD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); match(IDENT);
				setState(325); match(T__0);
				setState(326); match(SIZED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327); match(IDENT);
				setState(328); match(T__0);
				setState(329); match(EMPTYD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330); match(IDENT);
				setState(331); match(T__0);
				setState(332); match(PUSHD);
				setState(333); match(T__6);
				setState(334); expr(0);
				setState(335); match(T__5);
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

		case 21: return expr_sempred((ExprContext)_localctx, predIndex);

		case 15: return expr_sempred((ExprContext)_localctx, predIndex);
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

		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u013c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d"+
		"\n\6\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\5\7o\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00a4\n\13\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13"+
		"\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c5\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00e1"+
		"\n\24\f\24\16\24\u00e4\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00ee\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f9"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0121\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u012c\n\27\f\27\16"+
		"\27\u012f\13\27\3\30\3\30\3\30\7\30\u0134\n\30\f\30\16\30\u0137\13\30"+
		"\3\30\5\30\u013a\n\30\3\30\2\3,\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\7\6\2\b\t\17\17\24\24\26\26\3\2-.\5\2\3\3\20\20\23\23\4"+
		"\2\24\24\26\26\5\2\7\7\r\r%*\u0151\2\61\3\2\2\2\4\67\3\2\2\2\6G\3\2\2"+
		"\2\bM\3\2\2\2\nc\3\2\2\2\fn\3\2\2\2\16v\3\2\2\2\20\u0083\3\2\2\2\22\u0085"+
		"\3\2\2\2\24\u00a3\3\2\2\2\26\u00a5\3\2\2\2\30\u00c4\3\2\2\2\32\u00c6\3"+
		"\2\2\2\34\u00cc\3\2\2\2\36\u00d0\3\2\2\2 \u00d4\3\2\2\2\"\u00d6\3\2\2"+
		"\2$\u00d8\3\2\2\2&\u00dc\3\2\2\2(\u00ed\3\2\2\2*\u00f8\3\2\2\2,\u0120"+
		"\3\2\2\2.\u0139\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\658\5\6\4\2\668\5\n\6\2\67\65\3\2"+
		"\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\31\2\2:;\7-\2\2;H\5\b\5\2<=\7\31\2\2"+
		"=>\7-\2\2>?\7\25\2\2?@\7-\2\2@H\5\b\5\2AB\7\31\2\2BC\7-\2\2CD\7\6\2\2"+
		"DE\7.\2\2EF\7\f\2\2FH\5\b\5\2G9\3\2\2\2G<\3\2\2\2GA\3\2\2\2H\7\3\2\2\2"+
		"IN\7\34\2\2JN\7\30\2\2KN\7\35\2\2LN\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2"+
		"\2\2ML\3\2\2\2N\t\3\2\2\2OP\7\32\2\2PQ\7-\2\2QR\7\21\2\2RS\5\f\7\2ST\7"+
		"\22\2\2TU\5\b\5\2UV\5\26\f\2Vd\3\2\2\2WX\7\32\2\2XY\7-\2\2YZ\7\21\2\2"+
		"Z[\5\f\7\2[\\\7\22\2\2\\]\7\21\2\2]^\5\b\5\2^_\7\25\2\2_`\5\b\5\2`a\7"+
		"\22\2\2ab\5\26\f\2bd\3\2\2\2cO\3\2\2\2cW\3\2\2\2d\13\3\2\2\2eo\3\2\2\2"+
		"fk\5\16\b\2gh\7\25\2\2hj\5\16\b\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2ne\3\2\2\2nf\3\2\2\2o\r\3\2\2\2pq\7-\2\2qw\5\b"+
		"\5\2rs\7-\2\2st\7\6\2\2tu\7\f\2\2uw\5\b\5\2vp\3\2\2\2vr\3\2\2\2w\17\3"+
		"\2\2\2x\u0084\5\22\n\2y\u0084\5\26\f\2z\u0084\5\24\13\2{\u0084\5\30\r"+
		"\2|\u0084\5\34\17\2}\u0084\5\36\20\2~\u0084\5$\23\2\177\u0084\5(\25\2"+
		"\u0080\u0084\5\32\16\2\u0081\u0084\5 \21\2\u0082\u0084\5\"\22\2\u0083"+
		"x\3\2\2\2\u0083y\3\2\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2"+
		"\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\5,\27"+
		"\2\u0086\23\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u0089\7-\2\2\u0089\u008a"+
		"\7\25\2\2\u008a\u008b\7-\2\2\u008b\u008c\5\b\5\2\u008c\u008d\7\13\2\2"+
		"\u008d\u008e\7.\2\2\u008e\u008f\7\25\2\2\u008f\u0090\7.\2\2\u0090\u00a4"+
		"\3\2\2\2\u0091\u0092\7\31\2\2\u0092\u0093\7-\2\2\u0093\u0094\5\b\5\2\u0094"+
		"\u0095\7\13\2\2\u0095\u0096\5,\27\2\u0096\u00a4\3\2\2\2\u0097\u0098\7"+
		"-\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\13\2\2\u009a\u009b\5,\27\2\u009b"+
		"\u00a4\3\2\2\2\u009c\u009d\7-\2\2\u009d\u009e\7\6\2\2\u009e\u009f\5,\27"+
		"\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5,\27\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u0087\3\2\2\2\u00a3\u0091\3\2\2\2\u00a3\u0097\3\2"+
		"\2\2\u00a3\u009c\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a9\7\5\2\2\u00a6\u00a8"+
		"\5*\26\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5\20"+
		"\t\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b5\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5&"+
		"\24\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\n"+
		"\2\2\u00b9\27\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\5,\27\2\u00bc\u00bd"+
		"\5\26\f\2\u00bd\u00c5\3\2\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\5,\27\2"+
		"\u00c0\u00c1\5\26\f\2\u00c1\u00c2\7#\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\31\3\2\2\2\u00c6"+
		"\u00c7\5,\27\2\u00c7\u00c8\7\16\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7"+
		"\4\2\2\u00ca\u00cb\5\20\t\2\u00cb\33\3\2\2\2\u00cc\u00cd\7\36\2\2\u00cd"+
		"\u00ce\5,\27\2\u00ce\u00cf\5\26\f\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\37"+
		"\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\5\26\f\2\u00d3\37\3\2\2\2\u00d4\u00d5"+
		"\7+\2\2\u00d5!\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7#\3\2\2\2\u00d8\u00d9\7"+
		" \2\2\u00d9\u00da\5,\27\2\u00da\u00db\5\26\f\2\u00db%\3\2\2\2\u00dc\u00dd"+
		"\7!\2\2\u00dd\u00de\7.\2\2\u00de\u00e2\7\4\2\2\u00df\u00e1\5\20\t\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\'\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6\u00e7"+
		"\5,\27\2\u00e7\u00e8\7\25\2\2\u00e8\u00e9\5,\27\2\u00e9\u00ee\3\2\2\2"+
		"\u00ea\u00eb\7$\2\2\u00eb\u00ee\5,\27\2\u00ec\u00ee\7$\2\2\u00ed\u00e5"+
		"\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee)\3\2\2\2\u00ef"+
		"\u00f0\7\31\2\2\u00f0\u00f1\7-\2\2\u00f1\u00f9\5\b\5\2\u00f2\u00f3\7\31"+
		"\2\2\u00f3\u00f4\7-\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\7.\2\2\u00f6\u00f7"+
		"\7\f\2\2\u00f7\u00f9\5\b\5\2\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f9"+
		"+\3\2\2\2\u00fa\u00fb\b\27\1\2\u00fb\u00fc\t\2\2\2\u00fc\u0121\5,\27\n"+
		"\u00fd\u00fe\7-\2\2\u00fe\u00ff\7\13\2\2\u00ff\u0121\5,\27\5\u0100\u0101"+
		"\7\21\2\2\u0101\u0102\5,\27\2\u0102\u0103\7\22\2\2\u0103\u0121\3\2\2\2"+
		"\u0104\u0105\7-\2\2\u0105\u0106\7\6\2\2\u0106\u0107\5,\27\2\u0107\u0108"+
		"\7\f\2\2\u0108\u0121\3\2\2\2\u0109\u010a\7-\2\2\u010a\u010b\7\21\2\2\u010b"+
		"\u010c\5.\30\2\u010c\u010d\7\22\2\2\u010d\u0121\3\2\2\2\u010e\u010f\7"+
		"\33\2\2\u010f\u0110\7\27\2\2\u0110\u0111\7-\2\2\u0111\u0112\7\21\2\2\u0112"+
		"\u0113\5.\30\2\u0113\u0114\7\22\2\2\u0114\u0121\3\2\2\2\u0115\u0116\7"+
		".\2\2\u0116\u0117\7\25\2\2\u0117\u0121\7.\2\2\u0118\u0119\7-\2\2\u0119"+
		"\u011a\7\6\2\2\u011a\u011b\5,\27\2\u011b\u011c\7\f\2\2\u011c\u011d\7\13"+
		"\2\2\u011d\u011e\5,\27\2\u011e\u0121\3\2\2\2\u011f\u0121\t\3\2\2\u0120"+
		"\u00fa\3\2\2\2\u0120\u00fd\3\2\2\2\u0120\u0100\3\2\2\2\u0120\u0104\3\2"+
		"\2\2\u0120\u0109\3\2\2\2\u0120\u010e\3\2\2\2\u0120\u0115\3\2\2\2\u0120"+
		"\u0118\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u012d\3\2\2\2\u0122\u0123\f\t"+
		"\2\2\u0123\u0124\t\4\2\2\u0124\u012c\5,\27\n\u0125\u0126\f\b\2\2\u0126"+
		"\u0127\t\5\2\2\u0127\u012c\5,\27\t\u0128\u0129\f\7\2\2\u0129\u012a\t\6"+
		"\2\2\u012a\u012c\5,\27\b\u012b\u0122\3\2\2\2\u012b\u0125\3\2\2\2\u012b"+
		"\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e-\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0135\5,\27\2\u0131\u0132"+
		"\7\25\2\2\u0132\u0134\5,\27\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0130\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"/\3\2\2\2\30\63\67GMcknv\u0083\u00a3\u00a9\u00af\u00b5\u00c4\u00e2\u00ed"+
		"\u00f8\u0120\u012b\u012d\u0135\u0139";

		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\5\3\60\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\5\5T\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\5\7u\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a5\n\13\3\f\3\f\7\f\u00a9\n\f\f\f\16\f\u00ac\13\f\3\f\7"+
		"\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00c0\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00ce\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0111\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u011c\n\21\f\21\16\21\u011f\13\21\3\22\3\22\3\22\7\22\u0124\n\22"+
		"\f\22\16\22\u0127\13\22\3\22\5\22\u012a\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u013f\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0154\n\24\3\24\2\3 \25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\6\2\6\7\r\r\22\22\24"+
		"\24\3\2\62\63\5\2\3\3\16\16\21\21\4\2\22\22\24\24\5\2\b\b\f\f,\61\u0176"+
		"\2)\3\2\2\2\4/\3\2\2\2\6M\3\2\2\2\bS\3\2\2\2\ni\3\2\2\2\ft\3\2\2\2\16"+
		"|\3\2\2\2\20\u0084\3\2\2\2\22\u0086\3\2\2\2\24\u00a4\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00bf\3\2\2\2\32\u00c1\3\2\2\2\34\u00cd\3\2\2\2\36\u00e6\3"+
		"\2\2\2 \u0110\3\2\2\2\"\u0129\3\2\2\2$\u013e\3\2\2\2&\u0153\3\2\2\2(*"+
		"\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\60\5\6\4"+
		"\2.\60\5\n\6\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\62\7#\2\2\62\63\7\62"+
		"\2\2\63N\5\b\5\2\64\65\7#\2\2\65\66\7\62\2\2\66\67\7\23\2\2\678\7\62\2"+
		"\28N\5\b\5\29:\7#\2\2:;\7\62\2\2;<\7\5\2\2<=\7\63\2\2=>\7\13\2\2>N\5\b"+
		"\5\2?@\7#\2\2@A\7\62\2\2AB\7\b\2\2BC\5\b\5\2CD\7\f\2\2DE\7!\2\2EN\3\2"+
		"\2\2FG\7#\2\2GH\7\62\2\2HI\7\b\2\2IJ\5\b\5\2JK\7\f\2\2KL\7 \2\2LN\3\2"+
		"\2\2M\61\3\2\2\2M\64\3\2\2\2M9\3\2\2\2M?\3\2\2\2MF\3\2\2\2N\7\3\2\2\2"+
		"OT\7&\2\2PT\7\"\2\2QT\7\'\2\2RT\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2"+
		"SR\3\2\2\2T\t\3\2\2\2UV\7$\2\2VW\7\62\2\2WX\7\17\2\2XY\5\f\7\2YZ\7\20"+
		"\2\2Z[\5\b\5\2[\\\5\26\f\2\\j\3\2\2\2]^\7$\2\2^_\7\62\2\2_`\7\17\2\2`"+
		"a\5\f\7\2ab\7\20\2\2bc\7\17\2\2cd\5\b\5\2de\7\23\2\2ef\5\b\5\2fg\7\20"+
		"\2\2gh\5\26\f\2hj\3\2\2\2iU\3\2\2\2i]\3\2\2\2j\13\3\2\2\2ku\3\2\2\2lq"+
		"\5\16\b\2mn\7\23\2\2np\5\16\b\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2tk\3\2\2\2tl\3\2\2\2u\r\3\2\2\2vw\7\62\2\2w}\5\b"+
		"\5\2xy\7\62\2\2yz\7\5\2\2z{\7\13\2\2{}\5\b\5\2|v\3\2\2\2|x\3\2\2\2}\17"+
		"\3\2\2\2~\u0085\5\22\n\2\177\u0085\5\26\f\2\u0080\u0085\5\24\13\2\u0081"+
		"\u0085\5\30\r\2\u0082\u0085\5\32\16\2\u0083\u0085\5\34\17\2\u0084~\3\2"+
		"\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\5 \21\2\u0087"+
		"\23\3\2\2\2\u0088\u0089\7#\2\2\u0089\u008a\7\62\2\2\u008a\u008b\7\23\2"+
		"\2\u008b\u008c\7\62\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7\n\2\2\u008e"+
		"\u008f\7\63\2\2\u008f\u0090\7\23\2\2\u0090\u0091\7\63\2\2\u0091\u00a5"+
		"\3\2\2\2\u0092\u0093\7#\2\2\u0093\u0094\7\62\2\2\u0094\u0095\5\b\5\2\u0095"+
		"\u0096\7\n\2\2\u0096\u0097\5 \21\2\u0097\u00a5\3\2\2\2\u0098\u0099\7\62"+
		"\2\2\u0099\u009a\5\b\5\2\u009a\u009b\7\n\2\2\u009b\u009c\5 \21\2\u009c"+
		"\u00a5\3\2\2\2\u009d\u009e\7\62\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\5"+
		" \21\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\5 \21\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u0088\3\2\2\2\u00a4\u0092\3\2\2\2\u00a4\u0098\3\2"+
		"\2\2\u00a4\u009d\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00aa\7\4\2\2\u00a7\u00a9"+
		"\5\36\20\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af"+
		"\5\20\t\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4"+
		"\7\t\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7)\2\2\u00b6\u00b7\5 \21\2\u00b7"+
		"\u00b8\5\26\f\2\u00b8\u00c0\3\2\2\2\u00b9\u00ba\7)\2\2\u00ba\u00bb\5 "+
		"\21\2\u00bb\u00bc\5\26\f\2\u00bc\u00bd\7*\2\2\u00bd\u00be\5\26\f\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b9\3\2\2\2\u00c0\31\3\2\2"+
		"\2\u00c1\u00c2\7(\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\5\26\f\2\u00c4\33"+
		"\3\2\2\2\u00c5\u00c6\7+\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7\23\2\2\u00c8"+
		"\u00c9\5 \21\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb\u00ce\5 \21"+
		"\2\u00cc\u00ce\7+\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7\62\2\2\u00d1"+
		"\u00e7\5\b\5\2\u00d2\u00d3\7#\2\2\u00d3\u00d4\7\62\2\2\u00d4\u00d5\7\5"+
		"\2\2\u00d5\u00d6\7\63\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00e7\5\b\5\2\u00d8"+
		"\u00d9\7#\2\2\u00d9\u00da\7\62\2\2\u00da\u00db\7\b\2\2\u00db\u00dc\5\b"+
		"\5\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\7!\2\2\u00de\u00e7\3\2\2\2\u00df"+
		"\u00e0\7#\2\2\u00e0\u00e1\7\62\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\5\b"+
		"\5\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5\7 \2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00cf\3\2\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00df\3\2"+
		"\2\2\u00e7\37\3\2\2\2\u00e8\u00e9\b\21\1\2\u00e9\u00ea\t\2\2\2\u00ea\u0111"+
		"\5 \21\n\u00eb\u00ec\7\62\2\2\u00ec\u00ed\7\n\2\2\u00ed\u0111\5 \21\5"+
		"\u00ee\u00ef\7\17\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\7\20\2\2\u00f1\u0111"+
		"\3\2\2\2\u00f2\u0111\5$\23\2\u00f3\u0111\5&\24\2\u00f4\u00f5\7\62\2\2"+
		"\u00f5\u00f6\7\5\2\2\u00f6\u00f7\5 \21\2\u00f7\u00f8\7\13\2\2\u00f8\u0111"+
		"\3\2\2\2\u00f9\u00fa\7\62\2\2\u00fa\u00fb\7\17\2\2\u00fb\u00fc\5\"\22"+
		"\2\u00fc\u00fd\7\20\2\2\u00fd\u0111\3\2\2\2\u00fe\u00ff\7%\2\2\u00ff\u0100"+
		"\7\25\2\2\u0100\u0101\7\62\2\2\u0101\u0102\7\17\2\2\u0102\u0103\5\"\22"+
		"\2\u0103\u0104\7\20\2\2\u0104\u0111\3\2\2\2\u0105\u0106\7\63\2\2\u0106"+
		"\u0107\7\23\2\2\u0107\u0111\7\63\2\2\u0108\u0109\7\62\2\2\u0109\u010a"+
		"\7\5\2\2\u010a\u010b\5 \21\2\u010b\u010c\7\13\2\2\u010c\u010d\7\n\2\2"+
		"\u010d\u010e\5 \21\2\u010e\u0111\3\2\2\2\u010f\u0111\t\3\2\2\u0110\u00e8"+
		"\3\2\2\2\u0110\u00eb\3\2\2\2\u0110\u00ee\3\2\2\2\u0110\u00f2\3\2\2\2\u0110"+
		"\u00f3\3\2\2\2\u0110\u00f4\3\2\2\2\u0110\u00f9\3\2\2\2\u0110\u00fe\3\2"+
		"\2\2\u0110\u0105\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u011d\3\2\2\2\u0112\u0113\f\t\2\2\u0113\u0114\t\4\2\2\u0114\u011c\5 "+
		"\21\n\u0115\u0116\f\b\2\2\u0116\u0117\t\5\2\2\u0117\u011c\5 \21\t\u0118"+
		"\u0119\f\7\2\2\u0119\u011a\t\6\2\2\u011a\u011c\5 \21\b\u011b\u0112\3\2"+
		"\2\2\u011b\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e!\3\2\2\2\u011f\u011d\3\2\2\2"+
		"\u0120\u0125\5 \21\2\u0121\u0122\7\23\2\2\u0122\u0124\5 \21\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u012a\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0120\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a#\3\2\2\2\u012b\u012c\7\62\2\2\u012c\u012d"+
		"\7\25\2\2\u012d\u013f\7\34\2\2\u012e\u012f\7\62\2\2\u012f\u0130\7\25\2"+
		"\2\u0130\u013f\7\35\2\2\u0131\u0132\7\62\2\2\u0132\u0133\7\25\2\2\u0133"+
		"\u013f\7\36\2\2\u0134\u0135\7\62\2\2\u0135\u0136\7\25\2\2\u0136\u013f"+
		"\7\37\2\2\u0137\u0138\7\62\2\2\u0138\u0139\7\25\2\2\u0139\u013a\7\33\2"+
		"\2\u013a\u013b\7\17\2\2\u013b\u013c\5 \21\2\u013c\u013d\7\20\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u012b\3\2\2\2\u013e\u012e\3\2\2\2\u013e\u0131\3\2"+
		"\2\2\u013e\u0134\3\2\2\2\u013e\u0137\3\2\2\2\u013f%\3\2\2\2\u0140\u0141"+
		"\7\62\2\2\u0141\u0142\7\25\2\2\u0142\u0154\7\26\2\2\u0143\u0144\7\62\2"+
		"\2\u0144\u0145\7\25\2\2\u0145\u0154\7\27\2\2\u0146\u0147\7\62\2\2\u0147"+
		"\u0148\7\25\2\2\u0148\u0154\7\30\2\2\u0149\u014a\7\62\2\2\u014a\u014b"+
		"\7\25\2\2\u014b\u0154\7\31\2\2\u014c\u014d\7\62\2\2\u014d\u014e\7\25\2"+
		"\2\u014e\u014f\7\32\2\2\u014f\u0150\7\17\2\2\u0150\u0151\5 \21\2\u0151"+
		"\u0152\7\20\2\2\u0152\u0154\3\2\2\2\u0153\u0140\3\2\2\2\u0153\u0143\3"+
		"\2\2\2\u0153\u0146\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014c\3\2\2\2\u0154"+
		"\'\3\2\2\2\30+/MSiqt|\u0084\u00a4\u00aa\u00b0\u00bf\u00cd\u00e6\u0110"+
		"\u011b\u011d\u0125\u0129\u013e\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}