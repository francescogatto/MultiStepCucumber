## Cukeulator Example Test
This is the example test-project for the Cukeulator with multi Java Steps. It uses Glues and Tags to manage wich Steps run.
This because if you put all the steps in one package, the CucumberInstrumentator when start will call every @Before in each class for every feature. In this way is impossibile to test different feauters beahviours. 
For example if we want to test a Login Feature you can simply lunch the activity and run the scenarios. But if u want to test List without pass from the Login Step, You must launch ListActivity with special Intents. 

