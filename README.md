# SeleniumBDD_JavaFramework
Automation Framework (Selenium webdriver, BDD, cucumber, Java, Maven, Junit)

**Author:** Ganesh Satras
**Date:** 25-04-2023

## Automation Framework Folder Structure:

Folder Name: BuggyTest
Content: 
#### - src\test\resources\functionalTests:
      This package contains feature file we create.  
      -> BuggyTest.feature:
              i. BuggyTest feature file has multiple scenarios to be tested on Buggy Software portal.
              ii. It has all the steps in cucumber gherkin (Given, When Then) format.
#### - src\test\java: 
       This folder containes multiple packages
       i. **pageObjects**:  This package has class files containing page objects xpaths and events to be performed.
       ii. **runners**: This package contains TestRunner class in which we specify feature file and step definitions path and tests to be performed
       iii. **stepDefinitions**: This package contains class for the step definitions of the steps written in feature file.
       
#### - POM.xml: (Maven)
       This file is used as framework is built in maven project. This file helps download dependencies for the required libraries.
       This file helps build and run the solution.

#### - Run.bat:
       This file helps run the code and shows the REPORT URL, which shows the final result of our test execution.
       

**Pre-requisites:**
- Maven should be installed
- JDK/JVM should be installed
- Browser to view the report.
- IDE in case of review and edit the code.

**Execution Guide:**
- Download framework (BuggyTest and Run.bat) from the repository and store it in one folder in your system.
- Double click on Run.bat file, execution will start automatically.
- Report URL will be printed on the running screen after execution copy the same and paste in the browser to view the final exection report.
- To run separate scenarios (Do change the tag in .feature file which is like @smoketest, put it in the TestRunner.java file)
