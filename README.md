## Cukeulator Example Test
This is the example test-project for the Cukeulator with multi Java Steps. It uses Glues and Tags to manage wich Steps run.
This because if you put all the steps in one package, the CucumberInstrumentator when start will call every @Before in each class for every feature.  In this way I can write different Before methods for different Features. 

