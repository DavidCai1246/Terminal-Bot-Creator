// Generated from C:/Qsync/UBC/yr4/CS410/Project1Group21/EducationalTerminalBot/src/parser\BotParser.g4 by ANTLR 4.10.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BotParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(BotParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#givenFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivenFunction(BotParser.GivenFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BotParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#increase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrease(BotParser.IncreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#decrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrease(BotParser.DecreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(BotParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BotParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BotParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#randomNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomNumber(BotParser.RandomNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#customOrGivenFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomOrGivenFunction(BotParser.CustomOrGivenFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#useCustom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseCustom(BotParser.UseCustomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#customFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomFunction(BotParser.CustomFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#nestedCustomOrGivenFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedCustomOrGivenFunction(BotParser.NestedCustomOrGivenFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(BotParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(BotParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#amount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmount(BotParser.AmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#msg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg(BotParser.MsgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#callVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallVar(BotParser.CallVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#commandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandName(BotParser.CommandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(BotParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#userInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserInput(BotParser.UserInputContext ctx);
}