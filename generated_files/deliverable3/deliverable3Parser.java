// Generated from deliverable3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class deliverable3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, EQUALS=12, PLUS_EQUALS=13, MINUS_EQUALS=14, TIMES_EQUALS=15, 
		DIV_EQUALS=16, LBRACKET=17, RBRACKET=18, COMMA=19, COLON=20, LPAREN=21, 
		RPAREN=22, IF=23, ELIF=24, ELSE=25, WHILE=26, FOR=27, IN=28, RANGE=29, 
		AND=30, OR=31, NOT=32, BOOLEAN=33, STRING=34, FLOAT=35, NUMBER=36, VAR=37, 
		LINECOMMENT=38, BLOCKCOMMENT=39, NEWLINE=40, WS=41, INDENT=42, DEDENT=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ifstatement = 2, RULE_whilestatement = 3, 
		RULE_forstatement = 4, RULE_rangeexpr = 5, RULE_block = 6, RULE_condition = 7, 
		RULE_assignment = 8, RULE_expression = 9, RULE_literal = 10, RULE_array = 11, 
		RULE_comparisonOperator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "ifstatement", "whilestatement", "forstatement", 
			"rangeexpr", "block", "condition", "assignment", "expression", "literal", 
			"array", "comparisonOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", "'['", "']'", 
			"','", "':'", "'('", "')'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
			"'in'", "'range'", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"EQUALS", "PLUS_EQUALS", "MINUS_EQUALS", "TIMES_EQUALS", "DIV_EQUALS", 
			"LBRACKET", "RBRACKET", "COMMA", "COLON", "LPAREN", "RPAREN", "IF", "ELIF", 
			"ELSE", "WHILE", "FOR", "IN", "RANGE", "AND", "OR", "NOT", "BOOLEAN", 
			"STRING", "FLOAT", "NUMBER", "VAR", "LINECOMMENT", "BLOCKCOMMENT", "NEWLINE", 
			"WS", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "deliverable3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public deliverable3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(deliverable3Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(deliverable3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(deliverable3Parser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137648668672L) != 0)) {
				{
				{
				setState(26);
				statement();
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(27);
					match(NEWLINE);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(EOF);
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
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				ifstatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				whilestatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				forstatement();
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
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(deliverable3Parser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(deliverable3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(deliverable3Parser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(deliverable3Parser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(deliverable3Parser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(deliverable3Parser.ELSE, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(IF);
			setState(47);
			condition(0);
			setState(48);
			match(COLON);
			setState(49);
			block();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(50);
				match(ELIF);
				setState(51);
				condition(0);
				setState(52);
				match(COLON);
				setState(53);
				block();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(60);
				match(ELSE);
				setState(61);
				match(COLON);
				setState(62);
				block();
				}
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
	public static class WhilestatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(deliverable3Parser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(deliverable3Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(WHILE);
			setState(66);
			condition(0);
			setState(67);
			match(COLON);
			setState(68);
			block();
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
	public static class ForstatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(deliverable3Parser.FOR, 0); }
		public List<TerminalNode> VAR() { return getTokens(deliverable3Parser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(deliverable3Parser.VAR, i);
		}
		public TerminalNode IN() { return getToken(deliverable3Parser.IN, 0); }
		public TerminalNode COLON() { return getToken(deliverable3Parser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RangeexprContext rangeexpr() {
			return getRuleContext(RangeexprContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FOR);
			setState(71);
			match(VAR);
			setState(72);
			match(IN);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(73);
				match(VAR);
				}
				break;
			case RANGE:
				{
				setState(74);
				rangeexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			match(COLON);
			setState(78);
			block();
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
	public static class RangeexprContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(deliverable3Parser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(deliverable3Parser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(deliverable3Parser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(deliverable3Parser.RPAREN, 0); }
		public RangeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterRangeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitRangeexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitRangeexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeexprContext rangeexpr() throws RecognitionException {
		RangeexprContext _localctx = new RangeexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rangeexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(RANGE);
			setState(81);
			match(LPAREN);
			setState(82);
			expression(0);
			setState(83);
			match(COMMA);
			setState(84);
			expression(0);
			setState(85);
			match(RPAREN);
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
		public List<TerminalNode> NEWLINE() { return getTokens(deliverable3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(deliverable3Parser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(deliverable3Parser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(deliverable3Parser.DEDENT, 0); }
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
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(NEWLINE);
			setState(88);
			match(INDENT);
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				statement();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(90);
					match(NEWLINE);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 137648668672L) != 0) );
			setState(100);
			match(DEDENT);
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
		public TerminalNode NOT() { return getToken(deliverable3Parser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(deliverable3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(deliverable3Parser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(deliverable3Parser.AND, 0); }
		public TerminalNode OR() { return getToken(deliverable3Parser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitCondition(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(103);
				expression(0);
				setState(104);
				comparisonOperator();
				setState(105);
				expression(0);
				}
				break;
			case 2:
				{
				setState(107);
				match(NOT);
				setState(108);
				condition(5);
				}
				break;
			case 3:
				{
				setState(109);
				match(LPAREN);
				setState(110);
				condition(0);
				setState(111);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(113);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(AND);
						setState(118);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(OR);
						setState(121);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode VAR() { return getToken(deliverable3Parser.VAR, 0); }
		public TerminalNode EQUALS() { return getToken(deliverable3Parser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_EQUALS() { return getToken(deliverable3Parser.PLUS_EQUALS, 0); }
		public TerminalNode MINUS_EQUALS() { return getToken(deliverable3Parser.MINUS_EQUALS, 0); }
		public TerminalNode TIMES_EQUALS() { return getToken(deliverable3Parser.TIMES_EQUALS, 0); }
		public TerminalNode DIV_EQUALS() { return getToken(deliverable3Parser.DIV_EQUALS, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(VAR);
				setState(128);
				match(EQUALS);
				setState(129);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(VAR);
				setState(131);
				match(PLUS_EQUALS);
				setState(132);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(VAR);
				setState(134);
				match(MINUS_EQUALS);
				setState(135);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(VAR);
				setState(137);
				match(TIMES_EQUALS);
				setState(138);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(VAR);
				setState(140);
				match(DIV_EQUALS);
				setState(141);
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
		public TerminalNode VAR() { return getToken(deliverable3Parser.VAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(deliverable3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(deliverable3Parser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case BOOLEAN:
			case STRING:
			case FLOAT:
			case NUMBER:
				{
				setState(145);
				literal();
				}
				break;
			case VAR:
				{
				setState(146);
				match(VAR);
				}
				break;
			case T__0:
			case T__1:
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				expression(4);
				}
				break;
			case LPAREN:
				{
				setState(149);
				match(LPAREN);
				setState(150);
				expression(0);
				setState(151);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 38L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode NUMBER() { return getToken(deliverable3Parser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(deliverable3Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(deliverable3Parser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(deliverable3Parser.BOOLEAN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(NUMBER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(BOOLEAN);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
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
		public TerminalNode LBRACKET() { return getToken(deliverable3Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(deliverable3Parser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(deliverable3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(deliverable3Parser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LBRACKET);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 266290200582L) != 0)) {
				{
				setState(174);
				expression(0);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(175);
					match(COMMA);
					setState(176);
					expression(0);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184);
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
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof deliverable3Listener ) ((deliverable3Listener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof deliverable3Visitor ) return ((deliverable3Visitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
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
		case 7:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 9:
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
		"\u0004\u0001+\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000\f"+
		"\u0000 \t\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b\u0002"+
		"\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"L\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\\\b\u0006\n\u0006\f\u0006"+
		"_\t\u0006\u0004\u0006a\b\u0006\u000b\u0006\f\u0006b\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007s\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008f"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u009a\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00a2\b\t\n\t\f\t\u00a5\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00ac\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00b2\b\u000b\n\u000b\f\u000b\u00b5\t\u000b\u0003\u000b\u00b7\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0002\u000e"+
		"\u0012\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u0000\u0004\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0002\u0000"+
		"\u0001\u0002\u0005\u0005\u0001\u0000\u0006\u000b\u00cd\u0000#\u0001\u0000"+
		"\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000"+
		"\u0006A\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nP\u0001\u0000"+
		"\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000"+
		"\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000"+
		"\u0014\u00ab\u0001\u0000\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000"+
		"\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u001e\u0003\u0002\u0001\u0000"+
		"\u001b\u001d\u0005(\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d"+
		" \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000!\u001a\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0000\u0000\u0001\'\u0001"+
		"\u0001\u0000\u0000\u0000(-\u0003\u0010\b\u0000)-\u0003\u0004\u0002\u0000"+
		"*-\u0003\u0006\u0003\u0000+-\u0003\b\u0004\u0000,(\u0001\u0000\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000"+
		"\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005\u0017\u0000\u0000/0\u0003"+
		"\u000e\u0007\u000001\u0005\u0014\u0000\u000019\u0003\f\u0006\u000023\u0005"+
		"\u0018\u0000\u000034\u0003\u000e\u0007\u000045\u0005\u0014\u0000\u0000"+
		"56\u0003\f\u0006\u000068\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:?\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0019"+
		"\u0000\u0000=>\u0005\u0014\u0000\u0000>@\u0003\f\u0006\u0000?<\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"AB\u0005\u001a\u0000\u0000BC\u0003\u000e\u0007\u0000CD\u0005\u0014\u0000"+
		"\u0000DE\u0003\f\u0006\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005\u001b"+
		"\u0000\u0000GH\u0005%\u0000\u0000HK\u0005\u001c\u0000\u0000IL\u0005%\u0000"+
		"\u0000JL\u0003\n\u0005\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0005\u0014\u0000\u0000NO\u0003\f\u0006"+
		"\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005\u001d\u0000\u0000QR\u0005\u0015"+
		"\u0000\u0000RS\u0003\u0012\t\u0000ST\u0005\u0013\u0000\u0000TU\u0003\u0012"+
		"\t\u0000UV\u0005\u0016\u0000\u0000V\u000b\u0001\u0000\u0000\u0000WX\u0005"+
		"(\u0000\u0000X`\u0005*\u0000\u0000Y]\u0003\u0002\u0001\u0000Z\\\u0005"+
		"(\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`Y\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000de\u0005+\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0006\u0007"+
		"\uffff\uffff\u0000gh\u0003\u0012\t\u0000hi\u0003\u0018\f\u0000ij\u0003"+
		"\u0012\t\u0000js\u0001\u0000\u0000\u0000kl\u0005 \u0000\u0000ls\u0003"+
		"\u000e\u0007\u0005mn\u0005\u0015\u0000\u0000no\u0003\u000e\u0007\u0000"+
		"op\u0005\u0016\u0000\u0000ps\u0001\u0000\u0000\u0000qs\u0003\u0012\t\u0000"+
		"rf\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000s|\u0001\u0000\u0000\u0000tu\n\u0004\u0000"+
		"\u0000uv\u0005\u001e\u0000\u0000v{\u0003\u000e\u0007\u0005wx\n\u0003\u0000"+
		"\u0000xy\u0005\u001f\u0000\u0000y{\u0003\u000e\u0007\u0004zt\u0001\u0000"+
		"\u0000\u0000zw\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u000f\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005%\u0000\u0000\u0080"+
		"\u0081\u0005\f\u0000\u0000\u0081\u008f\u0003\u0012\t\u0000\u0082\u0083"+
		"\u0005%\u0000\u0000\u0083\u0084\u0005\r\u0000\u0000\u0084\u008f\u0003"+
		"\u0012\t\u0000\u0085\u0086\u0005%\u0000\u0000\u0086\u0087\u0005\u000e"+
		"\u0000\u0000\u0087\u008f\u0003\u0012\t\u0000\u0088\u0089\u0005%\u0000"+
		"\u0000\u0089\u008a\u0005\u000f\u0000\u0000\u008a\u008f\u0003\u0012\t\u0000"+
		"\u008b\u008c\u0005%\u0000\u0000\u008c\u008d\u0005\u0010\u0000\u0000\u008d"+
		"\u008f\u0003\u0012\t\u0000\u008e\u007f\u0001\u0000\u0000\u0000\u008e\u0082"+
		"\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u0088"+
		"\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008f\u0011"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0006\t\uffff\uffff\u0000\u0091\u009a"+
		"\u0003\u0014\n\u0000\u0092\u009a\u0005%\u0000\u0000\u0093\u0094\u0007"+
		"\u0000\u0000\u0000\u0094\u009a\u0003\u0012\t\u0004\u0095\u0096\u0005\u0015"+
		"\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u0098\u0005\u0016\u0000"+
		"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000\u0000"+
		"\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u009a\u00a3\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\n\u0003\u0000\u0000\u009c\u009d\u0007\u0001\u0000\u0000"+
		"\u009d\u00a2\u0003\u0012\t\u0004\u009e\u009f\n\u0002\u0000\u0000\u009f"+
		"\u00a0\u0007\u0002\u0000\u0000\u00a0\u00a2\u0003\u0012\t\u0003\u00a1\u009b"+
		"\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00ac\u0005$\u0000\u0000\u00a7\u00ac\u0005"+
		"#\u0000\u0000\u00a8\u00ac\u0005\"\u0000\u0000\u00a9\u00ac\u0005!\u0000"+
		"\u0000\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad\u00b6\u0005\u0011\u0000"+
		"\u0000\u00ae\u00b3\u0003\u0012\t\u0000\u00af\u00b0\u0005\u0013\u0000\u0000"+
		"\u00b0\u00b2\u0003\u0012\t\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0012\u0000\u0000\u00b9\u0017\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0007\u0003\u0000\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u0012"+
		"\u001e#,9?K]brz|\u008e\u0099\u00a1\u00a3\u00ab\u00b3\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}