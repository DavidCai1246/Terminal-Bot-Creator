// Generated from C:/Qsync/UBC/yr4/CS410/Project1Group21/EducationalTerminalBot/src/parser\BotParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(BotParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(BotParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#givenFunction}.
	 * @param ctx the parse tree
	 */
	void enterGivenFunction(BotParser.GivenFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#givenFunction}.
	 * @param ctx the parse tree
	 */
	void exitGivenFunction(BotParser.GivenFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BotParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BotParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#increase}.
	 * @param ctx the parse tree
	 */
	void enterIncrease(BotParser.IncreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#increase}.
	 * @param ctx the parse tree
	 */
	void exitIncrease(BotParser.IncreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#decrease}.
	 * @param ctx the parse tree
	 */
	void enterDecrease(BotParser.DecreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#decrease}.
	 * @param ctx the parse tree
	 */
	void exitDecrease(BotParser.DecreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(BotParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(BotParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BotParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BotParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BotParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BotParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#randomNumber}.
	 * @param ctx the parse tree
	 */
	void enterRandomNumber(BotParser.RandomNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#randomNumber}.
	 * @param ctx the parse tree
	 */
	void exitRandomNumber(BotParser.RandomNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#customOrGivenFunction}.
	 * @param ctx the parse tree
	 */
	void enterCustomOrGivenFunction(BotParser.CustomOrGivenFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#customOrGivenFunction}.
	 * @param ctx the parse tree
	 */
	void exitCustomOrGivenFunction(BotParser.CustomOrGivenFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#useCustom}.
	 * @param ctx the parse tree
	 */
	void enterUseCustom(BotParser.UseCustomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#useCustom}.
	 * @param ctx the parse tree
	 */
	void exitUseCustom(BotParser.UseCustomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#customFunction}.
	 * @param ctx the parse tree
	 */
	void enterCustomFunction(BotParser.CustomFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#customFunction}.
	 * @param ctx the parse tree
	 */
	void exitCustomFunction(BotParser.CustomFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#nestedCustomOrGivenFunction}.
	 * @param ctx the parse tree
	 */
	void enterNestedCustomOrGivenFunction(BotParser.NestedCustomOrGivenFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#nestedCustomOrGivenFunction}.
	 * @param ctx the parse tree
	 */
	void exitNestedCustomOrGivenFunction(BotParser.NestedCustomOrGivenFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(BotParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(BotParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BotParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BotParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#amount}.
	 * @param ctx the parse tree
	 */
	void enterAmount(BotParser.AmountContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#amount}.
	 * @param ctx the parse tree
	 */
	void exitAmount(BotParser.AmountContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsg(BotParser.MsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsg(BotParser.MsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#callVar}.
	 * @param ctx the parse tree
	 */
	void enterCallVar(BotParser.CallVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#callVar}.
	 * @param ctx the parse tree
	 */
	void exitCallVar(BotParser.CallVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#commandName}.
	 * @param ctx the parse tree
	 */
	void enterCommandName(BotParser.CommandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#commandName}.
	 * @param ctx the parse tree
	 */
	void exitCommandName(BotParser.CommandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(BotParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(BotParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#userInput}.
	 * @param ctx the parse tree
	 */
	void enterUserInput(BotParser.UserInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#userInput}.
	 * @param ctx the parse tree
	 */
	void exitUserInput(BotParser.UserInputContext ctx);
}