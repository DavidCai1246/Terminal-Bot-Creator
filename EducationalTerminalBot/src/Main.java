import ast.Command;
import ast.Evaluator;
import ast.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.BotLexer;
import parser.BotParser;
import parser.ParseFromAST;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BotLexer lexer = new BotLexer(CharStreams.fromFileName("input"));
        lexer.reset();

        TokenStream tokens = new CommonTokenStream(lexer);

        BotParser parser = new BotParser(tokens);
        ParseFromAST visitor = new ParseFromAST();

        Program program = visitor.visitProgram(parser.program());

        System.out.println("Bot setup successfully");

        while (true) {
            System.out.println("hello please type in your command, use !commands to view list of commands");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
//            String s = "!testCommand";
            if (s.equals("!quit")){
                break;
            }
            if (!s.startsWith("!")) {
                System.out.print("Not a valid command!\n");
            } else {
                List<Command> commands = program.getCommands();
                String command = s.substring(s.indexOf("!") + 1);
                if (s.equals("!commands")) {
                    System.out.print("Commands: \n");
                    for (Command value : commands) {
                        System.out.print("!" + value.getName() + "\n");
                    }
                } else {
                    boolean commandFound = false;
                    for (Command value : commands) {
                        if (value.getName().equals(command)) {
                            commandFound = true;
                            break;
                        }
                    }
                    if (!commandFound) {
                        System.out.print("Command not found!\n");
                    }
                }
                new Evaluator().visit(new StringBuilder(), program, command, scanner);
            }
        }
    }
}