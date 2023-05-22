lexer grammar BotLexer;

// (DEFAULT_MODE)
DECLARE: 'declare' -> mode(INPUT_MODE);
USE_CUSTOM: 'use custom' -> mode(INPUT_MODE);
EXCLAMATION_MARK: '!' -> mode(INPUT_MODE);
STORE: 'store' -> mode(INPUT_MODE);
AS: 'as' -> mode(INPUT_MODE);
IF: 'if' -> mode(INPUT_MODE);
IS: 'is' -> mode(INPUT_MODE);
THEN: 'then';
ELSE: 'else';
INCREASE: 'increase' -> mode(INPUT_MODE);
DECREASE: 'decrease' -> mode(INPUT_MODE);
SET: 'set' -> mode(INPUT_MODE);
KEEP: 'keep';
UNTIL: 'until' -> mode(INPUT_MODE);
PRINT: 'print "' -> mode(TEXT_MODE);
NEXT: 'next';
GENERATE_RANDOM_NUMBER_BETWEEN: 'generate random number between' -> mode(INPUT_MODE);
AND: 'and';
BY: 'by' -> mode(INPUT_MODE);
HAS_USER_INPUT: 'has_user_input';
OPEN_BRACKET: '{' -> mode(INPUT_MODE);
CLOSE_BRACKET: '}'-> mode(TEXT_MODE);
OPEN_ROUND_BRACKET: '(';
CLOSE_ROUND_BRACKET: ')';
DOUBLE_QUOTE: '"';
DASH: '-' -> mode(INPUT_MODE);
REFER: 'refer';

WS: [ \r\n\t;]+ ->  channel(HIDDEN);


// Mode specifically for tokenizing the arbitrary text inside the title and in table cells
mode TEXT_MODE;
TEXT: ~[{\r\n;"]* -> mode(DEFAULT_MODE);


mode INPUT_MODE;
NAME: [A-Za-z][A-Za-z0-9]* -> mode(DEFAULT_MODE);
NUMBER: [0-9]+ -> mode(DEFAULT_MODE);
INPUT_WS: [ \r\n\t]+ -> channel(HIDDEN);


