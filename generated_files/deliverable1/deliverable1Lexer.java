// Generated from deliverable1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class deliverable1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, EQUALS=8, PLUS_EQUALS=9, 
		MINUS_EQUALS=10, TIMES_EQUALS=11, DIV_EQUALS=12, LBRACKET=13, RBRACKET=14, 
		COMMA=15, BOOLEAN=16, STRING=17, NUMBER=18, FLOAT=19, VAR=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "EQUALS", "PLUS_EQUALS", 
			"MINUS_EQUALS", "TIMES_EQUALS", "DIV_EQUALS", "LBRACKET", "RBRACKET", 
			"COMMA", "BOOLEAN", "STRING", "NUMBER", "FLOAT", "VAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "EQUALS", "PLUS_EQUALS", 
			"MINUS_EQUALS", "TIMES_EQUALS", "DIV_EQUALS", "LBRACKET", "RBRACKET", 
			"COMMA", "BOOLEAN", "STRING", "NUMBER", "FLOAT", "VAR", "WS"
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


	public deliverable1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "deliverable1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000fW\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010[\b\u0010\n\u0010\f\u0010^\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010c\b\u0010\n\u0010\f\u0010f\t\u0010\u0001"+
		"\u0010\u0003\u0010i\b\u0010\u0001\u0011\u0004\u0011l\b\u0011\u000b\u0011"+
		"\f\u0011m\u0001\u0012\u0004\u0012q\b\u0012\u000b\u0012\f\u0012r\u0001"+
		"\u0012\u0001\u0012\u0004\u0012w\b\u0012\u000b\u0012\f\u0012x\u0001\u0013"+
		"\u0001\u0013\u0005\u0013}\b\u0013\n\u0013\f\u0013\u0080\t\u0013\u0001"+
		"\u0014\u0004\u0014\u0083\b\u0014\u000b\u0014\f\u0014\u0084\u0001\u0014"+
		"\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015\u0001\u0000\u0006\u0004\u0000\n\n\r\r\"\"\\\\\u0004\u0000"+
		"\n\n\r\r\'\'\\\\\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  \u0090\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001"+
		"\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000"+
		"\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r7\u0001"+
		"\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000"+
		"\u0000\u0013>\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017"+
		"D\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bI\u0001"+
		"\u0000\u0000\u0000\u001dK\u0001\u0000\u0000\u0000\u001fV\u0001\u0000\u0000"+
		"\u0000!h\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000%p\u0001\u0000"+
		"\u0000\u0000\'z\u0001\u0000\u0000\u0000)\u0082\u0001\u0000\u0000\u0000"+
		"+,\u0005*\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005/\u0000\u0000"+
		".\u0004\u0001\u0000\u0000\u0000/0\u0005+\u0000\u00000\u0006\u0001\u0000"+
		"\u0000\u000012\u0005-\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005%"+
		"\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005(\u0000\u00006\f\u0001"+
		"\u0000\u0000\u000078\u0005)\u0000\u00008\u000e\u0001\u0000\u0000\u0000"+
		"9:\u0005=\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;<\u0005+\u0000\u0000"+
		"<=\u0005=\u0000\u0000=\u0012\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000"+
		"?@\u0005=\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AB\u0005*\u0000\u0000"+
		"BC\u0005=\u0000\u0000C\u0016\u0001\u0000\u0000\u0000DE\u0005/\u0000\u0000"+
		"EF\u0005=\u0000\u0000F\u0018\u0001\u0000\u0000\u0000GH\u0005[\u0000\u0000"+
		"H\u001a\u0001\u0000\u0000\u0000IJ\u0005]\u0000\u0000J\u001c\u0001\u0000"+
		"\u0000\u0000KL\u0005,\u0000\u0000L\u001e\u0001\u0000\u0000\u0000MN\u0005"+
		"T\u0000\u0000NO\u0005r\u0000\u0000OP\u0005u\u0000\u0000PW\u0005e\u0000"+
		"\u0000QR\u0005F\u0000\u0000RS\u0005a\u0000\u0000ST\u0005l\u0000\u0000"+
		"TU\u0005s\u0000\u0000UW\u0005e\u0000\u0000VM\u0001\u0000\u0000\u0000V"+
		"Q\u0001\u0000\u0000\u0000W \u0001\u0000\u0000\u0000X\\\u0005\"\u0000\u0000"+
		"Y[\b\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_i\u0005\"\u0000\u0000`d\u0005\'\u0000"+
		"\u0000ac\b\u0001\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0005\'\u0000\u0000hX\u0001\u0000"+
		"\u0000\u0000h`\u0001\u0000\u0000\u0000i\"\u0001\u0000\u0000\u0000jl\u0007"+
		"\u0002\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n$\u0001\u0000\u0000"+
		"\u0000oq\u0007\u0002\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tv\u0005.\u0000\u0000uw\u0007\u0002\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y&\u0001\u0000\u0000\u0000z~\u0007\u0003\u0000"+
		"\u0000{}\u0007\u0004\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f(\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0007\u0005\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0006\u0014\u0000\u0000\u0087*\u0001\u0000\u0000\u0000\n\u0000"+
		"V\\dhmrx~\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}