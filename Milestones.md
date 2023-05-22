<H3>MILESTONE 1:</H3>
Brief description: Our tentitive idea is for a discord bot
Ideas so far: 
  - We are still in the process of discussing this further, but obviously we need to be able to make a dsl that can make a bot with responses to certain commands
  - Maybe have the dsl be able to create a function that tells the bot what to do in cases of multiple specific inputs in a row (like after 3 of the same message say something)

That's all we had before the TA discussion, this was the info we got from the discussion: 
- dsl is creating the bot, we are making the dsl, not a specific bot (in reference the specific 3 message example)
- we should think about if we wanted to impelment the 3 sepcific message example, what do we need to implement:
    - bot should have a dictionary with vocab: data structure
    - need to count number of specific messages
    - loop could be used to search vocab 
    - can introduce functions or macros for repetitive stuff (not sure what this really means but we can ask later)
- examples of what we can do with dsl
    create a basic function bot: weather command gets api 
    to make it more complex: we can get weather of different cities
    
We will meet this weekend or early next week to solidify our DSL ideas 

<H3>MILESTONE 2:</H3>
We came together before the TA meeting and came up with some basic functionality of our bot:

Temporary Grammar Structure:<br />
	Program: Conversation*	<br />
	Conversation: [Question] [Answer]+[Followup]+;<br />
	Question: [text]<br />
	Answer: [text]<br />
	Followup: [Question] [FollowupAnswer]+[Followup]+<br />
	FollowupAnswer: [Keyword][text]<br />
	Keyword: [text]<br />


Example of one conversation:

- Q: What is weather<br />
- A: Sunny  | Rainy | Cloudy<br />
	- Followup:<br />
	- Question: What should I wear <br />
	- FollowupAnswer: <br />
		- Sunny: shorts<br />
		- Rainy: Jacket<br />
		- Cloudy: Boots <br />

		- Followup:<br />
		- Question: How much is it<br />
		- FollowupAnswer:<br />
			- Shorts: $2<br />
			- Jacket: $3<br />
	- Followup:<br />
	- Question: where should I go<br />
	- FollowupAnswer: <br />
	- Sunny: beach<br />
	- Rainy: movie <br />


However, during the meeting we were told we needed to add more complexity. We want to be able to give the designer of the bot more freedom. An example would be allowing them to handle inputs that don't match a question, sort of like an if else case. 
We also want to focus our use case a bit more, so that we can begin our user studies. We will meet this weekend and organize that. Currently we do not have a planned division of responsibilites, but after clearing up what that was with the TA, we can split those up in our meeting this weekend as well. We are hoping to get our idea's sorted out with a more concrete grammar structure, as well as our user studies done by the end of next weekend. 



<H3>MILESTONE 3:</H3>

After our milestone 2 meeting, we got together and reimagined our language. By taking a bit of the answer format, we created functions in our new DSL that the user could call with commands. Our idea was for the user to be able to create a twitch bot, and could create a gambling minigame or some other features for it. It looked like this: <br />
Program: Command*<br />
Command: “!”[Name] [Function]<br />
Function:  <br />
(STORE userInput as [variable] |  <br />
If answer is [msg | RandomNumber] then [Function] (or else [Function])?  | <br />
Use [variable] to [function] | <br />
INCREASE [amount] | <br />
DECREASE [amount] |<br />
MULTIPLY [amount]|<br />
PRINT [msg] | <br />
QUESTION [question] |<br />
 ) UserInput? (THEN [Function])?<br />
RandomNumber: Generate random number between [num] and [num] <br />

We setup a meeting with our TA on Monday to see if we were on the right track with the example above. He informed us it was better and more focused, but he was still looking for the ability to loop a function, or use a previously declared function in another function. We put a bit more thought into it, and came up with the following: <br />
<br />
Note: all variable is global scope, square bracket is grouping things together for grammar, round bracket is nested function <br />
Program: (Function | Command)*<br />
Command: “!”[CommandName] [FunctionName | GivenFunction]+<br />
GivenFunction:  <br />
[ STORE USER_INPUT AS VariableName |  <br />
IF VariableName IS [Amount | RandomNumber] THEN (FunctionName | GivenFunction) (ELSE ([FunctionName | GivenFunction]))?  | <br />
INCREASE Expression | <br />
DECREASE Expression |<br />
SET VariableName AS Amount |<br />
KEEP [FunctionName | GivenFunction] UNTIL Condition<br />
PRINT msg ] UserInput? (NEXT [FunctionName | GivenFunction])?<br />

Function: [FunctionName][GivenFunction]<br />
RandomNumber: Generate random number between [num] and [num] <br />
Expression: [VariableName] BY Amount   <br />
Condtion: [VariableName] IS [Amount]<br />
Amount: [NUMBER | [VariableName]] <br />
Msg: TEXT*|VariableName?<br />
VariableName: TEXT<br />
FunctionName: TEXT<br />
<br />
This was approved by our TA as fufulling the language complexity requirements in our most recent milestone meeting. Due to the multiple rounds of feedback for our grammar, we were unable to get started on the user studies for this week. However, an issue came up when we decided we didn't want to export it to twitch through an api, rather we were planning on similuating the behavior through the terminal. The reason we didn't want to export it was due to a difference in our teams understanding of how to approach the project. Instead of looking at the existing twitch api functionality, and writing our DSL to it, we started at the DSL and tried to work our way up. Our TA informed us since our final product was different than what we were proposing the use case to be, we either had to connect the twitch api, or change our use case. We had a quick team discussion after the meeting and decided slightly modifying the use case was the most logical way forward, as we didn't have experience with the twitch api and were slightly behind. We came up with a good split of work this weekend: Wilson and Anson are to do the user studies for the most recent grammar set above, and Kevin, David and Ewan are to complete the lexer and parser on Antler. After that we will see what work still has to be done to continue splitting more work. 

<H3>MILESTONE 4:</H3>

After our meeting last week, our group decided to slightly modify the use case for our bot. We decided to make the use case for someone who is a novice at coding, but wants to learn. Our DSL contains basic coding functions like: variables, if statements, functions, and loops while also being easy to understand. We allow the user to create a bot using this simplified coding language. With this use case in mind, we were able to conduct our user studies. Our feedback was good (we have a quite a long document containing all the information that I don't want to copy in here), the users were able to understand how to use our language with some quick instructions. We used some of the feedback to increase the clarity of our language, for example instead of declaring a function with just "function", we would use "declare function". 
<br />
<br />
On the coding side, we finished the lexer and parser in Antlr. After meeting with our TA and updating him with our progress, we met as a group to come up with a timeline and a way to split the remaining work. We came up with this: <br />
<br />
this weekend - Create tree node classes to be used by visitor classes (Wilson)  <br />
this weekend - Visitor Class 1: Parser to AST conversion (1 person) (Wilson) <br />
next week - Visitor Class 2: Evaluation and UI ( 2-3 person) (David, Kevin, Ewan) <br />
next week - Final user study (0.5 person) (Anson) <br />
final weekend - Video (group effort person) <br />

Overall we are feeling pretty good about our progress

<H3>MILESTONE 5:</H3>

We are feeling less good now. We did do most of the things on our end. Wilson did the tree node classes and Parser to AST conversion. Kevin, David and Ewan started working on the Evaluator class, and almost finished it, we haven't started on the UI portion yet. Anson has to wait for us to have a working bot before starting the final user study. <br /><br />
We changed a bit on our langauge to make it more readable and to fix some bugs we found while testing. <br /><br />
We assigned a few more tasks after our TA meeting. We assigned Anson to write some documentation on how to use our bot, and to come up with examples, while Wilson was to begin a script for our video. Kevin, David and Ewan are to continue working on the evaluator and ui portion to get our bot up and running. <br />
A pain point was how to get our bot to take in user input during our function execution, so we are working on that right now. Currently we are a little crunched for time, but we think we can get everything done by the date. 
