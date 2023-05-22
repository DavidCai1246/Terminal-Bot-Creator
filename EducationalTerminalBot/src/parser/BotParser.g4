parser grammar BotParser;
options { tokenVocab=BotLexer; }

program: (customFunction | command)* EOF;
command: EXCLAMATION_MARK commandName customOrGivenFunction;
givenFunction: (ifStatement | increase | decrease | setVariable | loop | print | randomNumber) (NEXT customOrGivenFunction)?;

//not sure what this is for or why is needed since we have set variable already
//storeToken: STORE TEXT AS variableName;
ifStatement: IF variableName IS amount THEN nestedCustomOrGivenFunction (ELSE nestedCustomOrGivenFunction)?;
increase: INCREASE expression;
decrease: DECREASE expression;
setVariable: SET variableName AS amount;
loop: KEEP nestedCustomOrGivenFunction UNTIL condition;
print: PRINT msg* DOUBLE_QUOTE HAS_USER_INPUT?;
randomNumber: GENERATE_RANDOM_NUMBER_BETWEEN NUMBER DASH NUMBER AND REFER AS variableName;


customOrGivenFunction: (useCustom | givenFunction);
useCustom: USE_CUSTOM functionName;
customFunction: DECLARE functionName (givenFunction);
nestedCustomOrGivenFunction: OPEN_ROUND_BRACKET customOrGivenFunction CLOSE_ROUND_BRACKET;

variableName: NAME;
expression: variableName BY amount;
condition: variableName IS amount;
amount: NUMBER | variableName;
msg: callVar | TEXT;
callVar: OPEN_BRACKET variableName CLOSE_BRACKET;
commandName: NAME;

functionName: NAME;
userInput: TEXT;

