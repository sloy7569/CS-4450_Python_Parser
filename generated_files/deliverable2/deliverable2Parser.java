// Generated from deliverable2.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class deliverable2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, EQUALS=14, PLUS_EQUALS=15, MINUS_EQUALS=16, 
		TIMES_EQUALS=17, DIV_EQUALS=18, LBRACKET=19, RBRACKET=20, COMMA=21, COLON=22, 
		IF=23, ELIF=24, ELSE=25, AND=26, OR=27, NOT=28, BOOLEAN=29, STRING=30, 
		NUMBER=31, FLOAT=32, VAR=33, WS=34;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ifstatement = 2, RULE_block = 3, 
		RULE_condition = 4, RULE_assignment = 5, RULE_expression = 6, RULE_literal = 7, 
		RULE_array = 8, RULE_comparisonOperator = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "ifstatement", "block", "condition", "assignment", 
			"expression", "literal", "array", "comparisonOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'['", "']'", "','", "':'", "'if'", "'elif'", "'else'", "'and'", "'or'", 
			"'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "TIMES_EQUALS", 
			"DIV_EQUALS", "LBRACKET", "RBRACKET", "COMMA", "COLON", "IF", "ELIF", 
			"ELSE", "AND", "OR", "NOT", "BOOLEAN", "STRING", "NUMBER", "FLOAT", "VAR", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "deliverable2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public deliverable2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16651911194L) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				ifstatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(deliverable2Parser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(deliverable2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(deliverable2Parser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(deliverable2Parser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(deliverable2Parser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(deliverable2Parser.ELSE, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifstatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(IF);
			setState(32);
			condition(0);
			setState(33);
			match(COLON);
			setState(34);
			block();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					match(ELIF);
					setState(36);
					condition(0);
					setState(37);
					match(COLON);
					setState(38);
					block();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(45);
				match(ELSE);
				setState(46);
				match(COLON);
				setState(47);
				block();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(deliverable2Parser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(deliverable2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(deliverable2Parser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(56);
				expression(0);
				setState(57);
				comparisonOperator();
				setState(58);
				expression(0);
				}
				break;
			case 2:
				{
				setState(60);
				match(NOT);
				setState(61);
				condition(5);
				}
				break;
			case 3:
				{
				setState(62);
				match(T__0);
				setState(63);
				condition(0);
				setState(64);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(66);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70);
						match(AND);
						setState(71);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(72);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(73);
						match(OR);
						setState(74);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(deliverable2Parser.VAR, 0); }
		public TerminalNode EQUALS() { return getToken(deliverable2Parser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_EQUALS() { return getToken(deliverable2Parser.PLUS_EQUALS, 0); }
		public TerminalNode MINUS_EQUALS() { return getToken(deliverable2Parser.MINUS_EQUALS, 0); }
		public TerminalNode TIMES_EQUALS() { return getToken(deliverable2Parser.TIMES_EQUALS, 0); }
		public TerminalNode DIV_EQUALS() { return getToken(deliverable2Parser.DIV_EQUALS, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(VAR);
				setState(81);
				match(EQUALS);
				setState(82);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(VAR);
				setState(84);
				match(PLUS_EQUALS);
				setState(85);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(VAR);
				setState(87);
				match(MINUS_EQUALS);
				setState(88);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(VAR);
				setState(90);
				match(TIMES_EQUALS);
				setState(91);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(VAR);
				setState(93);
				match(DIV_EQUALS);
				setState(94);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode VAR() { return getToken(deliverable2Parser.VAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case BOOLEAN:
			case STRING:
			case NUMBER:
			case FLOAT:
				{
				setState(98);
				literal();
				}
				break;
			case VAR:
				{
				setState(99);
				match(VAR);
				}
				break;
			case T__2:
			case T__3:
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				expression(4);
				}
				break;
			case T__0:
				{
				setState(102);
				match(T__0);
				setState(103);
				expression(0);
				setState(104);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(109);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 152L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(deliverable2Parser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(deliverable2Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(deliverable2Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(deliverable2Parser.BOOLEAN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_literal);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(NUMBER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(BOOLEAN);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(deliverable2Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(deliverable2Parser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(deliverable2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(deliverable2Parser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LBRACKET);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16643522586L) != 0)) {
				{
				setState(127);
				expression(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					setState(129);
					expression(0);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(137);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable2Listener ) ((deliverable2Listener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable2Visitor ) return ((deliverable2Visitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002"+
		"\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"1\b\u0002\u0001\u0003\u0004\u00034\b\u0003\u000b\u0003\f\u00035\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004D\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004L\b\u0004\n\u0004\f\u0004O\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006k\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006s\b\u0006\n\u0006"+
		"\f\u0006v\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007}\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0083"+
		"\b\b\n\b\f\b\u0086\t\b\u0003\b\u0088\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0000\u0002\b\f\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0004\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u0006\u0002"+
		"\u0000\u0003\u0004\u0007\u0007\u0001\u0000\b\r\u009d\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004\u001f\u0001"+
		"\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000"+
		"\u0000\n_\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000e|\u0001"+
		"\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001e\u0003\n\u0005"+
		"\u0000\u001b\u001e\u0003\f\u0006\u0000\u001c\u001e\u0003\u0004\u0002\u0000"+
		"\u001d\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000"+
		"\u001f \u0005\u0017\u0000\u0000 !\u0003\b\u0004\u0000!\"\u0005\u0016\u0000"+
		"\u0000\"*\u0003\u0006\u0003\u0000#$\u0005\u0018\u0000\u0000$%\u0003\b"+
		"\u0004\u0000%&\u0005\u0016\u0000\u0000&\'\u0003\u0006\u0003\u0000\')\u0001"+
		"\u0000\u0000\u0000(#\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+0\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0019\u0000\u0000./\u0005\u0016"+
		"\u0000\u0000/1\u0003\u0006\u0003\u00000-\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000024\u0003\u0002\u0001"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u0000"+
		"78\u0006\u0004\uffff\uffff\u000089\u0003\f\u0006\u00009:\u0003\u0012\t"+
		"\u0000:;\u0003\f\u0006\u0000;D\u0001\u0000\u0000\u0000<=\u0005\u001c\u0000"+
		"\u0000=D\u0003\b\u0004\u0005>?\u0005\u0001\u0000\u0000?@\u0003\b\u0004"+
		"\u0000@A\u0005\u0002\u0000\u0000AD\u0001\u0000\u0000\u0000BD\u0003\f\u0006"+
		"\u0000C7\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000C>\u0001\u0000"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000DM\u0001\u0000\u0000\u0000EF\n\u0004"+
		"\u0000\u0000FG\u0005\u001a\u0000\u0000GL\u0003\b\u0004\u0005HI\n\u0003"+
		"\u0000\u0000IJ\u0005\u001b\u0000\u0000JL\u0003\b\u0004\u0004KE\u0001\u0000"+
		"\u0000\u0000KH\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PQ\u0005!\u0000\u0000QR\u0005\u000e\u0000\u0000"+
		"R`\u0003\f\u0006\u0000ST\u0005!\u0000\u0000TU\u0005\u000f\u0000\u0000"+
		"U`\u0003\f\u0006\u0000VW\u0005!\u0000\u0000WX\u0005\u0010\u0000\u0000"+
		"X`\u0003\f\u0006\u0000YZ\u0005!\u0000\u0000Z[\u0005\u0011\u0000\u0000"+
		"[`\u0003\f\u0006\u0000\\]\u0005!\u0000\u0000]^\u0005\u0012\u0000\u0000"+
		"^`\u0003\f\u0006\u0000_P\u0001\u0000\u0000\u0000_S\u0001\u0000\u0000\u0000"+
		"_V\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000"+
		"\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0006\u0006\uffff\uffff\u0000"+
		"bk\u0003\u000e\u0007\u0000ck\u0005!\u0000\u0000de\u0007\u0000\u0000\u0000"+
		"ek\u0003\f\u0006\u0004fg\u0005\u0001\u0000\u0000gh\u0003\f\u0006\u0000"+
		"hi\u0005\u0002\u0000\u0000ik\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000"+
		"\u0000jc\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000jf\u0001\u0000"+
		"\u0000\u0000kt\u0001\u0000\u0000\u0000lm\n\u0003\u0000\u0000mn\u0007\u0001"+
		"\u0000\u0000ns\u0003\f\u0006\u0004op\n\u0002\u0000\u0000pq\u0007\u0002"+
		"\u0000\u0000qs\u0003\f\u0006\u0003rl\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000u\r\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"w}\u0005\u001f\u0000\u0000x}\u0005 \u0000\u0000y}\u0005\u001e\u0000\u0000"+
		"z}\u0005\u001d\u0000\u0000{}\u0003\u0010\b\u0000|w\u0001\u0000\u0000\u0000"+
		"|x\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~\u0087"+
		"\u0005\u0013\u0000\u0000\u007f\u0084\u0003\f\u0006\u0000\u0080\u0081\u0005"+
		"\u0015\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u007f\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u0014\u0000\u0000\u008a\u0011\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0007\u0003\u0000\u0000\u008c\u0013\u0001\u0000"+
		"\u0000\u0000\u000f\u0017\u001d*05CKM_jrt|\u0084\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}