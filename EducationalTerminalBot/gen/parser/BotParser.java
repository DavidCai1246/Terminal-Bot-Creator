// Generated from C:/Qsync/UBC/yr4/CS410/Project1Group21/EducationalTerminalBot/src/parser\BotParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARE=1, USE_CUSTOM=2, EXCLAMATION_MARK=3, STORE=4, AS=5, IF=6, IS=7, 
		THEN=8, ELSE=9, INCREASE=10, DECREASE=11, SET=12, KEEP=13, UNTIL=14, PRINT=15, 
		NEXT=16, GENERATE_RANDOM_NUMBER_BETWEEN=17, AND=18, BY=19, HAS_USER_INPUT=20, 
		OPEN_BRACKET=21, CLOSE_BRACKET=22, OPEN_ROUND_BRACKET=23, CLOSE_ROUND_BRACKET=24, 
		DOUBLE_QUOTE=25, DASH=26, REFER=27, WS=28, TEXT=29, NAME=30, NUMBER=31, 
		INPUT_WS=32;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_givenFunction = 2, RULE_ifStatement = 3, 
		RULE_increase = 4, RULE_decrease = 5, RULE_setVariable = 6, RULE_loop = 7, 
		RULE_print = 8, RULE_randomNumber = 9, RULE_customOrGivenFunction = 10, 
		RULE_useCustom = 11, RULE_customFunction = 12, RULE_nestedCustomOrGivenFunction = 13, 
		RULE_variableName = 14, RULE_expression = 15, RULE_condition = 16, RULE_amount = 17, 
		RULE_msg = 18, RULE_callVar = 19, RULE_commandName = 20, RULE_functionName = 21, 
		RULE_userInput = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "givenFunction", "ifStatement", "increase", "decrease", 
			"setVariable", "loop", "print", "randomNumber", "customOrGivenFunction", 
			"useCustom", "customFunction", "nestedCustomOrGivenFunction", "variableName", 
			"expression", "condition", "amount", "msg", "callVar", "commandName", 
			"functionName", "userInput"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'declare'", "'use custom'", "'!'", "'store'", "'as'", "'if'", 
			"'is'", "'then'", "'else'", "'increase'", "'decrease'", "'set'", "'keep'", 
			"'until'", "'print \"'", "'next'", "'generate random number between'", 
			"'and'", "'by'", "'has_user_input'", "'{'", "'}'", "'('", "')'", "'\"'", 
			"'-'", "'refer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "USE_CUSTOM", "EXCLAMATION_MARK", "STORE", "AS", "IF", 
			"IS", "THEN", "ELSE", "INCREASE", "DECREASE", "SET", "KEEP", "UNTIL", 
			"PRINT", "NEXT", "GENERATE_RANDOM_NUMBER_BETWEEN", "AND", "BY", "HAS_USER_INPUT", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_ROUND_BRACKET", "CLOSE_ROUND_BRACKET", 
			"DOUBLE_QUOTE", "DASH", "REFER", "WS", "TEXT", "NAME", "NUMBER", "INPUT_WS"
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
	public String getGrammarFileName() { return "BotParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BotParser.EOF, 0); }
		public List<CustomFunctionContext> customFunction() {
			return getRuleContexts(CustomFunctionContext.class);
		}
		public CustomFunctionContext customFunction(int i) {
			return getRuleContext(CustomFunctionContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE || _la==EXCLAMATION_MARK) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECLARE:
					{
					setState(46);
					customFunction();
					}
					break;
				case EXCLAMATION_MARK:
					{
					setState(47);
					command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION_MARK() { return getToken(BotParser.EXCLAMATION_MARK, 0); }
		public CommandNameContext commandName() {
			return getRuleContext(CommandNameContext.class,0);
		}
		public CustomOrGivenFunctionContext customOrGivenFunction() {
			return getRuleContext(CustomOrGivenFunctionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(EXCLAMATION_MARK);
			setState(56);
			commandName();
			setState(57);
			customOrGivenFunction();
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

	public static class GivenFunctionContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IncreaseContext increase() {
			return getRuleContext(IncreaseContext.class,0);
		}
		public DecreaseContext decrease() {
			return getRuleContext(DecreaseContext.class,0);
		}
		public SetVariableContext setVariable() {
			return getRuleContext(SetVariableContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public RandomNumberContext randomNumber() {
			return getRuleContext(RandomNumberContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(BotParser.NEXT, 0); }
		public CustomOrGivenFunctionContext customOrGivenFunction() {
			return getRuleContext(CustomOrGivenFunctionContext.class,0);
		}
		public GivenFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givenFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterGivenFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitGivenFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitGivenFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenFunctionContext givenFunction() throws RecognitionException {
		GivenFunctionContext _localctx = new GivenFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_givenFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(59);
				ifStatement();
				}
				break;
			case INCREASE:
				{
				setState(60);
				increase();
				}
				break;
			case DECREASE:
				{
				setState(61);
				decrease();
				}
				break;
			case SET:
				{
				setState(62);
				setVariable();
				}
				break;
			case KEEP:
				{
				setState(63);
				loop();
				}
				break;
			case PRINT:
				{
				setState(64);
				print();
				}
				break;
			case GENERATE_RANDOM_NUMBER_BETWEEN:
				{
				setState(65);
				randomNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT) {
				{
				setState(68);
				match(NEXT);
				setState(69);
				customOrGivenFunction();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(BotParser.IS, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BotParser.THEN, 0); }
		public List<NestedCustomOrGivenFunctionContext> nestedCustomOrGivenFunction() {
			return getRuleContexts(NestedCustomOrGivenFunctionContext.class);
		}
		public NestedCustomOrGivenFunctionContext nestedCustomOrGivenFunction(int i) {
			return getRuleContext(NestedCustomOrGivenFunctionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BotParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IF);
			setState(73);
			variableName();
			setState(74);
			match(IS);
			setState(75);
			amount();
			setState(76);
			match(THEN);
			setState(77);
			nestedCustomOrGivenFunction();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(78);
				match(ELSE);
				setState(79);
				nestedCustomOrGivenFunction();
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

	public static class IncreaseContext extends ParserRuleContext {
		public TerminalNode INCREASE() { return getToken(BotParser.INCREASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterIncrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitIncrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitIncrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncreaseContext increase() throws RecognitionException {
		IncreaseContext _localctx = new IncreaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_increase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(INCREASE);
			setState(83);
			expression();
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

	public static class DecreaseContext extends ParserRuleContext {
		public TerminalNode DECREASE() { return getToken(BotParser.DECREASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrease; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterDecrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitDecrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitDecrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecreaseContext decrease() throws RecognitionException {
		DecreaseContext _localctx = new DecreaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decrease);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(DECREASE);
			setState(86);
			expression();
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

	public static class SetVariableContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(BotParser.SET, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(BotParser.AS, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public SetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterSetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitSetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVariableContext setVariable() throws RecognitionException {
		SetVariableContext _localctx = new SetVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SET);
			setState(89);
			variableName();
			setState(90);
			match(AS);
			setState(91);
			amount();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode KEEP() { return getToken(BotParser.KEEP, 0); }
		public NestedCustomOrGivenFunctionContext nestedCustomOrGivenFunction() {
			return getRuleContext(NestedCustomOrGivenFunctionContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(BotParser.UNTIL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(KEEP);
			setState(94);
			nestedCustomOrGivenFunction();
			setState(95);
			match(UNTIL);
			setState(96);
			condition();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BotParser.PRINT, 0); }
		public TerminalNode DOUBLE_QUOTE() { return getToken(BotParser.DOUBLE_QUOTE, 0); }
		public List<MsgContext> msg() {
			return getRuleContexts(MsgContext.class);
		}
		public MsgContext msg(int i) {
			return getRuleContext(MsgContext.class,i);
		}
		public TerminalNode HAS_USER_INPUT() { return getToken(BotParser.HAS_USER_INPUT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PRINT);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACKET || _la==TEXT) {
				{
				{
				setState(99);
				msg();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(DOUBLE_QUOTE);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAS_USER_INPUT) {
				{
				setState(106);
				match(HAS_USER_INPUT);
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

	public static class RandomNumberContext extends ParserRuleContext {
		public TerminalNode GENERATE_RANDOM_NUMBER_BETWEEN() { return getToken(BotParser.GENERATE_RANDOM_NUMBER_BETWEEN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BotParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BotParser.NUMBER, i);
		}
		public TerminalNode DASH() { return getToken(BotParser.DASH, 0); }
		public TerminalNode AND() { return getToken(BotParser.AND, 0); }
		public TerminalNode REFER() { return getToken(BotParser.REFER, 0); }
		public TerminalNode AS() { return getToken(BotParser.AS, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public RandomNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterRandomNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitRandomNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitRandomNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomNumberContext randomNumber() throws RecognitionException {
		RandomNumberContext _localctx = new RandomNumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_randomNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(GENERATE_RANDOM_NUMBER_BETWEEN);
			setState(110);
			match(NUMBER);
			setState(111);
			match(DASH);
			setState(112);
			match(NUMBER);
			setState(113);
			match(AND);
			setState(114);
			match(REFER);
			setState(115);
			match(AS);
			setState(116);
			variableName();
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

	public static class CustomOrGivenFunctionContext extends ParserRuleContext {
		public UseCustomContext useCustom() {
			return getRuleContext(UseCustomContext.class,0);
		}
		public GivenFunctionContext givenFunction() {
			return getRuleContext(GivenFunctionContext.class,0);
		}
		public CustomOrGivenFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customOrGivenFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterCustomOrGivenFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitCustomOrGivenFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitCustomOrGivenFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomOrGivenFunctionContext customOrGivenFunction() throws RecognitionException {
		CustomOrGivenFunctionContext _localctx = new CustomOrGivenFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_customOrGivenFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE_CUSTOM:
				{
				setState(118);
				useCustom();
				}
				break;
			case IF:
			case INCREASE:
			case DECREASE:
			case SET:
			case KEEP:
			case PRINT:
			case GENERATE_RANDOM_NUMBER_BETWEEN:
				{
				setState(119);
				givenFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UseCustomContext extends ParserRuleContext {
		public TerminalNode USE_CUSTOM() { return getToken(BotParser.USE_CUSTOM, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public UseCustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCustom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterUseCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitUseCustom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitUseCustom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseCustomContext useCustom() throws RecognitionException {
		UseCustomContext _localctx = new UseCustomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_useCustom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(USE_CUSTOM);
			setState(123);
			functionName();
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

	public static class CustomFunctionContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(BotParser.DECLARE, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public GivenFunctionContext givenFunction() {
			return getRuleContext(GivenFunctionContext.class,0);
		}
		public CustomFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterCustomFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitCustomFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitCustomFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomFunctionContext customFunction() throws RecognitionException {
		CustomFunctionContext _localctx = new CustomFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_customFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DECLARE);
			setState(126);
			functionName();
			{
			setState(127);
			givenFunction();
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

	public static class NestedCustomOrGivenFunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(BotParser.OPEN_ROUND_BRACKET, 0); }
		public CustomOrGivenFunctionContext customOrGivenFunction() {
			return getRuleContext(CustomOrGivenFunctionContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(BotParser.CLOSE_ROUND_BRACKET, 0); }
		public NestedCustomOrGivenFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedCustomOrGivenFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterNestedCustomOrGivenFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitNestedCustomOrGivenFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitNestedCustomOrGivenFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedCustomOrGivenFunctionContext nestedCustomOrGivenFunction() throws RecognitionException {
		NestedCustomOrGivenFunctionContext _localctx = new NestedCustomOrGivenFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nestedCustomOrGivenFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(OPEN_ROUND_BRACKET);
			setState(130);
			customOrGivenFunction();
			setState(131);
			match(CLOSE_ROUND_BRACKET);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(BotParser.NAME, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NAME);
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode BY() { return getToken(BotParser.BY, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			variableName();
			setState(136);
			match(BY);
			setState(137);
			amount();
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

	public static class ConditionContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(BotParser.IS, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			variableName();
			setState(140);
			match(IS);
			setState(141);
			amount();
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

	public static class AmountContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitAmount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_amount);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(NUMBER);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				variableName();
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

	public static class MsgContext extends ParserRuleContext {
		public CallVarContext callVar() {
			return getRuleContext(CallVarContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(BotParser.TEXT, 0); }
		public MsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgContext msg() throws RecognitionException {
		MsgContext _localctx = new MsgContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_msg);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				callVar();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(TEXT);
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

	public static class CallVarContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(BotParser.OPEN_BRACKET, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(BotParser.CLOSE_BRACKET, 0); }
		public CallVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterCallVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitCallVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitCallVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallVarContext callVar() throws RecognitionException {
		CallVarContext _localctx = new CallVarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OPEN_BRACKET);
			setState(152);
			variableName();
			setState(153);
			match(CLOSE_BRACKET);
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

	public static class CommandNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(BotParser.NAME, 0); }
		public CommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitCommandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitCommandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandNameContext commandName() throws RecognitionException {
		CommandNameContext _localctx = new CommandNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_commandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(NAME);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(BotParser.NAME, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(NAME);
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

	public static class UserInputContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(BotParser.TEXT, 0); }
		public UserInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).enterUserInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotParserListener ) ((BotParserListener)listener).exitUserInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotParserVisitor ) return ((BotParserVisitor<? extends T>)visitor).visitUserInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserInputContext userInput() throws RecognitionException {
		UserInputContext _localctx = new UserInputContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_userInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TEXT);
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
		"\u0004\u0001 \u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Q\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\be\b\b\n\b\f\bh\t\b\u0001\b\u0001\b\u0003\bl\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\ny\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0092\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0096\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0000\u0099\u00002\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"+
		"\u0004B\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bR\u0001"+
		"\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000"+
		"\u000e]\u0001\u0000\u0000\u0000\u0010b\u0001\u0000\u0000\u0000\u0012m"+
		"\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016z\u0001\u0000"+
		"\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0081\u0001\u0000\u0000"+
		"\u0000\u001c\u0085\u0001\u0000\u0000\u0000\u001e\u0087\u0001\u0000\u0000"+
		"\u0000 \u008b\u0001\u0000\u0000\u0000\"\u0091\u0001\u0000\u0000\u0000"+
		"$\u0095\u0001\u0000\u0000\u0000&\u0097\u0001\u0000\u0000\u0000(\u009b"+
		"\u0001\u0000\u0000\u0000*\u009d\u0001\u0000\u0000\u0000,\u009f\u0001\u0000"+
		"\u0000\u0000.1\u0003\u0018\f\u0000/1\u0003\u0002\u0001\u00000.\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000"+
		"\u0000\u000078\u0005\u0003\u0000\u000089\u0003(\u0014\u00009:\u0003\u0014"+
		"\n\u0000:\u0003\u0001\u0000\u0000\u0000;C\u0003\u0006\u0003\u0000<C\u0003"+
		"\b\u0004\u0000=C\u0003\n\u0005\u0000>C\u0003\f\u0006\u0000?C\u0003\u000e"+
		"\u0007\u0000@C\u0003\u0010\b\u0000AC\u0003\u0012\t\u0000B;\u0001\u0000"+
		"\u0000\u0000B<\u0001\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001"+
		"\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DE\u0005\u0010\u0000"+
		"\u0000EG\u0003\u0014\n\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000G\u0005\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0003"+
		"\u001c\u000e\u0000JK\u0005\u0007\u0000\u0000KL\u0003\"\u0011\u0000LM\u0005"+
		"\b\u0000\u0000MP\u0003\u001a\r\u0000NO\u0005\t\u0000\u0000OQ\u0003\u001a"+
		"\r\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0007\u0001"+
		"\u0000\u0000\u0000RS\u0005\n\u0000\u0000ST\u0003\u001e\u000f\u0000T\t"+
		"\u0001\u0000\u0000\u0000UV\u0005\u000b\u0000\u0000VW\u0003\u001e\u000f"+
		"\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005\f\u0000\u0000YZ\u0003\u001c"+
		"\u000e\u0000Z[\u0005\u0005\u0000\u0000[\\\u0003\"\u0011\u0000\\\r\u0001"+
		"\u0000\u0000\u0000]^\u0005\r\u0000\u0000^_\u0003\u001a\r\u0000_`\u0005"+
		"\u000e\u0000\u0000`a\u0003 \u0010\u0000a\u000f\u0001\u0000\u0000\u0000"+
		"bf\u0005\u000f\u0000\u0000ce\u0003$\u0012\u0000dc\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0005\u0019"+
		"\u0000\u0000jl\u0005\u0014\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u0011\u0000"+
		"\u0000no\u0005\u001f\u0000\u0000op\u0005\u001a\u0000\u0000pq\u0005\u001f"+
		"\u0000\u0000qr\u0005\u0012\u0000\u0000rs\u0005\u001b\u0000\u0000st\u0005"+
		"\u0005\u0000\u0000tu\u0003\u001c\u000e\u0000u\u0013\u0001\u0000\u0000"+
		"\u0000vy\u0003\u0016\u000b\u0000wy\u0003\u0004\u0002\u0000xv\u0001\u0000"+
		"\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0015\u0001\u0000\u0000\u0000"+
		"z{\u0005\u0002\u0000\u0000{|\u0003*\u0015\u0000|\u0017\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0001\u0000\u0000~\u007f\u0003*\u0015\u0000\u007f\u0080"+
		"\u0003\u0004\u0002\u0000\u0080\u0019\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0017\u0000\u0000\u0082\u0083\u0003\u0014\n\u0000\u0083\u0084\u0005"+
		"\u0018\u0000\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u001e\u0000\u0000\u0086\u001d\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"\u001c\u000e\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089\u008a\u0003"+
		"\"\u0011\u0000\u008a\u001f\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u001c"+
		"\u000e\u0000\u008c\u008d\u0005\u0007\u0000\u0000\u008d\u008e\u0003\"\u0011"+
		"\u0000\u008e!\u0001\u0000\u0000\u0000\u008f\u0092\u0005\u001f\u0000\u0000"+
		"\u0090\u0092\u0003\u001c\u000e\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092#\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0003&\u0013\u0000\u0094\u0096\u0005\u001d\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096%\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098\u0099\u0003"+
		"\u001c\u000e\u0000\u0099\u009a\u0005\u0016\u0000\u0000\u009a\'\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\u001e\u0000\u0000\u009c)\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u001e\u0000\u0000\u009e+\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u001d\u0000\u0000\u00a0-\u0001\u0000\u0000\u0000\n"+
		"02BFPfkx\u0091\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}