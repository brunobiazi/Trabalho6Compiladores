// Generated from br\u005Cufscar\dc\compiladores\birl\Birl.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.birl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BirlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PERIODO_DIA=11, NOME=12, MODO=13, NUMINT=14, NUMINTPOS=15, DATA=16, 
		TIPO=17, NOME_ATV=18, COMENTARIO=19, WS=20;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_info = 2, RULE_bloco_daily = 3, 
		RULE_daily = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "info", "bloco_daily", "daily"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nome: '", "'dia da semana: '", "'estilo: '", "'data: '", "'ROTINA'", 
			"'periodo: '", "'END_ROTINA'", "':'", "'horas e '", "' minutos'", null, 
			null, null, null, null, null, "'periodo:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PERIODO_DIA", 
			"NOME", "MODO", "NUMINT", "NUMINTPOS", "DATA", "TIPO", "NOME_ATV", "COMENTARIO", 
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
	public String getGrammarFileName() { return "Birl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BirlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BirlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BirlVisitor ) return ((BirlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			body();
			setState(11);
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

	public static class BodyContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<Bloco_dailyContext> bloco_daily() {
			return getRuleContexts(Bloco_dailyContext.class);
		}
		public Bloco_dailyContext bloco_daily(int i) {
			return getRuleContext(Bloco_dailyContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BirlVisitor ) return ((BirlVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			info();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(14);
				bloco_daily();
				}
				}
				setState(19);
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

	public static class InfoContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(BirlParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(BirlParser.NOME, i);
		}
		public TerminalNode MODO() { return getToken(BirlParser.MODO, 0); }
		public TerminalNode DATA() { return getToken(BirlParser.DATA, 0); }
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BirlVisitor ) return ((BirlVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(NOME);
			setState(22);
			match(T__1);
			setState(23);
			match(NOME);
			setState(24);
			match(T__2);
			setState(25);
			match(MODO);
			setState(26);
			match(T__3);
			setState(27);
			match(DATA);
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

	public static class Bloco_dailyContext extends ParserRuleContext {
		public TerminalNode PERIODO_DIA() { return getToken(BirlParser.PERIODO_DIA, 0); }
		public List<DailyContext> daily() {
			return getRuleContexts(DailyContext.class);
		}
		public DailyContext daily(int i) {
			return getRuleContext(DailyContext.class,i);
		}
		public Bloco_dailyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_daily; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).enterBloco_daily(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).exitBloco_daily(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BirlVisitor ) return ((BirlVisitor<? extends T>)visitor).visitBloco_daily(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_dailyContext bloco_daily() throws RecognitionException {
		Bloco_dailyContext _localctx = new Bloco_dailyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco_daily);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__4);
			setState(30);
			match(T__5);
			setState(31);
			match(PERIODO_DIA);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				daily();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOME_ATV );
			setState(37);
			match(T__6);
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

	public static class DailyContext extends ParserRuleContext {
		public TerminalNode NOME_ATV() { return getToken(BirlParser.NOME_ATV, 0); }
		public List<TerminalNode> NUMINT() { return getTokens(BirlParser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(BirlParser.NUMINT, i);
		}
		public DailyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daily; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).enterDaily(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BirlListener ) ((BirlListener)listener).exitDaily(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BirlVisitor ) return ((BirlVisitor<? extends T>)visitor).visitDaily(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DailyContext daily() throws RecognitionException {
		DailyContext _localctx = new DailyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_daily);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(NOME_ATV);
			setState(40);
			match(T__7);
			setState(41);
			match(NUMINT);
			setState(42);
			match(T__8);
			setState(43);
			match(NUMINT);
			setState(44);
			match(T__9);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5$\n\5\r\5"+
		"\16\5%\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2-"+
		"\2\f\3\2\2\2\4\17\3\2\2\2\6\26\3\2\2\2\b\37\3\2\2\2\n)\3\2\2\2\f\r\5\4"+
		"\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17\23\5\6\4\2\20\22\5\b\5\2\21\20\3\2\2"+
		"\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\23\3\2\2"+
		"\2\26\27\7\3\2\2\27\30\7\16\2\2\30\31\7\4\2\2\31\32\7\16\2\2\32\33\7\5"+
		"\2\2\33\34\7\17\2\2\34\35\7\6\2\2\35\36\7\22\2\2\36\7\3\2\2\2\37 \7\7"+
		"\2\2 !\7\b\2\2!#\7\r\2\2\"$\5\n\6\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&\'\3\2\2\2\'(\7\t\2\2(\t\3\2\2\2)*\7\24\2\2*+\7\n\2\2+,\7\20\2"+
		"\2,-\7\13\2\2-.\7\20\2\2./\7\f\2\2/\13\3\2\2\2\4\23%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}