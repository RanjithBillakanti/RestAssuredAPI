##### **Rest Assured API using Cucumber BDD**

###### BDD (Feature file / Step definition)

BDD requires a feature file to invoke the step definitions:

Create the scenarios in feature file as per the requirements, so each step in feature file has to match a step definition in class file;
Following the BDD practices for coding;
Using the special annotation like "@Before" which is the first method to run for each scenario. Moreover, this is the right place to set up the URI (endpoint) which will be called by HTTP request;

###### REST API

This project is aimed at calling Jsonplaceholder' API to validate the Users. This is written in a feature file using Cucumber.
Each line of the scenario is tied to backend code that actually executes the line (step).