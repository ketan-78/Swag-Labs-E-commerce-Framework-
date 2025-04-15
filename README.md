
# Swag Labs Automation Testing Suite

This repository contains automation scripts for testing the Swag Labs e-commerce website.
The automation covers key functionalities like user login, adding items to the cart, reviewing cart contents, entering shipping details, processing payments, and logging out.


## Tech Stack

-	Java
-	Selenium WebDriver
-	TestNG
-	Maven
-	Jenkins
-	CI/CD
-   Ngrok


## Features

-	User Login Testing
-	Add to Cart Functionality
-	Cart Review & Checkout Process
-	Shipping Details Validation
-	Payment Simulation
-	Logout Functionality
-	UI Element Validations



## Installation

1.	Install Eclipse IDE (or any preferred IDE).
2.	Install Java JDK (ensure JAVA_HOME is set).
3.	Clone this repository:
```bash
git clone https://github.com/your-username/your-repository-name.git
```
4.	Open the project in Eclipse.
5.	Make sure Maven is installed and configured.
6.	Update Maven dependencies (Right-click on project > Maven > Update Project).

    
## Running Tests
-	Run the testng.xml file to execute the complete suite.
-	Alternatively, right-click on any individual test class and select Run As > TestNG Test.
-	Test execution reports will be generated automatically.
-   The test can also be run using mvn from the command prompt by running the below code: 
```bash
run test
```


## Folder Structure
```
├───.settings
├───reports
├───src
│   ├───main
│   │   └───java
│   │       ├───StandardFramework
│   │       │   ├───Resources
│   │       │   └───ReusableComponents
│   │       └───StandaredFramework
│   │           └───PageObject
│   └───test
│       └───java
│           └───StandardFramework
│               ├───Data
│               ├───TestComponents
│               └───Tests
├───target
│   ├───classes
│   │   ├───META-INF
│   │   │   └───maven
│   │   │       └───StandardFramework
│   │   │           └───Framework
│   │   ├───StandardFramework
│   │   │   ├───Resources
│   │   │   └───ReusableComponents
│   │   └───StandaredFramework
│   │       └───PageObject
│   ├───generated-sources
│   │   └───annotations
│   ├───generated-test-sources
│   │   └───test-annotations
│   ├───maven-status
│   │   └───maven-compiler-plugin
│   │       ├───compile
│   │       │   └───default-compile
│   │       └───testCompile
│   │           └───default-testCompile
│   ├───surefire-reports
│   │   ├───junitreports
│   │   ├───Suite
│   │   └───Surefire suite
│   └───test-classes
│       └───StandardFramework
│           ├───Data
│           ├───TestComponents
│           └───Tests
└───test-output
    ├───Default suite
    ├───junitreports
    ├───old
    │   ├───Default suite
    │   └───Suite
    └───Suite
```
## Screenshots

![Extent Report Screenshot](https://github.com/user-attachments/assets/08d34a28-2f7b-4d53-a684-c5a297e12ee6)
![Jenkins](https://github.com/user-attachments/assets/1b2a3c3f-c38f-4c2f-87cd-0f95d1decb00)
