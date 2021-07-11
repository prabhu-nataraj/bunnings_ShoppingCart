# shoppingCartAutomation


Testing Strategy and Approach to testing in agile development environment

Scenario:  Add an item to the Cart

To test Add an item to the Cart functionality 
In order to test the add an item to the Cart functionality, we are using a product to add to the cart with quantities increased or reduced to verify whether the user can able to select the desired quantities and change in the cart as well.

Assumptions and questions about the brief

1. Selecting the first available search item (Hammer)
2. Adding to the Cart with only 1 item
3. Items for Click and Collect is selected by default

Design and document test cases for this feature as it appears on the site

Scenario: Search and Add 1 Hammer item to shopping cart
Scenario: Search and Add 2 Hammer items to shopping cart
Scenario: Search and Add 2 Hammer items and reduce 1 quantity in Review Cart page


3 Test Scenarios were created in BDD approach with Given When Then conditions with a feature file


Tools used:

Visual Studio Code with Selenium and Java with maven.


Steps to execute the Selenium Cucumber scripts

Step 1 - Download the repository and Import the POM.xml in IntelliJ Idea IDE or Visual Studio Code.

Step 2 - Do a clean mvn clean Install by typing mvn clean install in Terminal.

Step 3 - Run mvn clean test in the terminal to execute shoppingCart scenarios.

Step 4 - Open index.xml from TestResults in a browser to view the results.
