# Project1Group21 - Terminal Bot Creator
## Usage

In order to use the language to create terminal programs, designers can define their bot specification in a file named `input` and place it into the root of the project (`EducationaalTerminalBot/input`).

The terminal program defined in input can be started by running the `Main` function in `EducationalTerminalBot/src/Main`.

Due to time constraints, only basic static checking and error handling were able to be implemented. Please ensure that syntax is correct and in-line with the grammar.

## Grammar

### Program Creation
`program: (customFunction | command)* EOF;`
- Starting point where you can either define a new function or use an existing declared function.
Example: `declare guessNumber` or `!testCommand`

### Defining a Command
`command: EXCLAMATION_MARK commandName customOrGivenFunction;`
- Command declaration where you assign functions to a `commandName` based on existing functions or custom functions (`customOrGivenFunction`).

Example: 

`!testCommand
use custom guessNumber`

or

`!testCommand2
set testVar as 10
next keep (print "hello {testVar}" next increase testVar by 1) until testVar is 20`

### Existing Functionality

`givenFunction: (ifStatement | increase | decrease | setVariable | loop | print | randomNumber) (NEXT customOrGivenFunction)?;`
- Allows for the use of predefined functions that can be chained and used in combination with more givenFunctions or custom functions.

`ifStatement: IF variableName IS amount THEN nestedCustomOrGivenFunction (ELSE nestedCustomOrGivenFunction)?;`
- Checks if a predefined variable is equal to a defined amount. If so, the first `nestedCustomOrGivenFunction` is triggered. If the value is not equal to the defined `nestedCustomOrGivenFunction`, the function within the brackets is invoked.
- Example: `if userInput is randomVar then (print "Congratulations, you have guessed it right") else (print "you are wrong, the number is {randomVar}")`

`increase: INCREASE expression;`
`decrease: DECREASE expression;`
- Increases / decreases a variable by a given amount.
- Example: `increase testVar by 1`

`setVariable: SET variableName AS amount;`
- Declares a variable with the name `variableName` and assigns it with the value `amount`.
- Example: `set testVar as 10`

`loop: KEEP nestedCustomOrGivenFunction UNTIL condition;`
- Allows for the continous execution of a `nestedCustomOrGivenFunction`. The provided function will continue running until a `condition is reached`.
- Example: `keep (print "hello {testVar}" next increase testVar by 1) until testVar is 20`

`print: PRINT msg* DOUBLE_QUOTE HAS_USER_INPUT?;`
- Prints a message to the terminal where `msg` can be a combination of text and the value of the assigned variable.
- Example: `print "you have typed: {userInput}"`

`randomNumber: GENERATE_RANDOM_NUMBER_BETWEEN NUMBER DASH NUMBER AND REFER AS variableName;`
- Allows for the generation of a random number and assigns the following value to a `variableName`.
- Example: `next generate random number between 1-5 and refer as randomVar`

### Function Usage

`customOrGivenFunction: (useCustom | givenFunction);`
- A token which encompasses both custom and given functions.

`useCustom: USE_CUSTOM functionName;`
- A token used by `customOrGivenFunction` which allows for the usage of predefined custom functions.

`customFunction: DECLARE functionName (givenFunction);`
- Allows for the declaration of custom functions which use a combination of `givenFunctions`
- Example: `declare guessNumber print "Hello" next print "World"`

`nestedCustomOrGivenFunction: OPEN_ROUND_BRACKET customOrGivenFunction CLOSE_ROUND_BRACKET;`
- A token that allows for the usage of `customOrGivenFunction` within other custom or predefined functions.

### Additional Syntax

`variableName: NAME;`
- The name of variables you create.

`expression: variableName BY amount;`
- Specifies how much to increase a variable by.

`condition: variableName IS amount;`
- Specifies the amount `variableName` must be in order to stop a looped execution.

`amount: NUMBER | variableName;`
- A value defined by a number or the current value of a already defined variable.

`msg: callVar | TEXT;`
- Either defined TEXT or the value within a variable.

`callVar: OPEN_BRACKET variableName CLOSE_BRACKET;`
- Token that allows for the usage of variables values within `msg`.

`commandName: NAME;`
- The name of a command.

`functionName: NAME;`
- The name of a function.

`userInput: TEXT;`
- User specified text input.

## Symbols

`*`: 0 or more tokens

`?`: An optional token

`EXCLAMATION_MARK`: !

`OPEN_BRACKET`: {

`CLOSE_BRACKET`: }

`OPEN_ROUND_BRACKET`: (

`CLOSE_ROUND_BRACKET`: )

`DASH`: -

