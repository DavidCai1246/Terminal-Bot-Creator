package ast;

import ast.givenfunctions.*;

import java.util.Scanner;

public interface EducationalTerminalBotVisitor<C,T> {
    T visit(C context, Program p, String command, Scanner scanner);

    T visit(C context, Amount amount);
    T visit(C context, Command command);
    T visit(C context, CustomFunction customFunction);
    T visit(C context, CustomOrGivenFunction customOrGivenFunction);
    T visit(C context, GivenFunction givenFunction);
//    T visit(C context, RandomNumber randomNumber);
    T visit(C context, UseCustom useCustom);


    // Given functions
    T visit(C context, Decrease decrease);
    T visit(C context, GenerateRandomNumber generateRandomNumber);
    T visit(C context, IfStatement ifStatement);
    T visit(C context, Increase increase);
    T visit(C context, Loop loop);
    T visit(C context, Print print);
    T visit(C context, SetVariable setVariable);
//    T visit(C context, StoreToken storeToken);
    T visit(C context, Name name);
}