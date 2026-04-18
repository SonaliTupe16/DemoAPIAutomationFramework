# REST API Automation Framework – Java + TestNG

## Project Overview

This project is a layered REST API automation testing framework developed using Java, TestNG, and a reusable service-based architecture to validate end-to-end user workflows including authentication, account creation, profile retrieval, and profile updates.

The framework demonstrates scalable automation design principles commonly used in enterprise QA environments, including request/response modelling, reusable services, logging filters, and TestNG listeners.

This project reflects practical API automation framework development aligned with modern QA engineering practices.

---

## Technology Stack

* Java
* TestNG
* REST API Automation
* Maven
* JSON Request/Response Models
* Service Layer Architecture
* Logging Filters
* TestNG Listeners
* Suite-based Execution

---

## Framework Architecture

The framework follows a maintainable layered automation structure:

src
├── main
│   └── java
│       ├── services
│       ├── models
│       ├── filters
│       └── listeners
│
└── test
└── java
└── tests

---

## Architecture Highlights

Service Layer
Encapsulates reusable API request logic and authentication handling.

Request Models
Used to structure API payloads using strongly typed Java classes.

Response Models
Maps API responses into Java objects for validation and assertions.

Logging Filters
Captures request/response details for debugging and traceability.

TestNG Listener
Tracks execution lifecycle and improves reporting visibility.

Suite Execution
Supports grouped execution via TestNG suite configuration.

---

## Automated API Test Coverage

The framework validates key user lifecycle workflows:

Login API – Authentication validation
Signup API – User registration workflow
Profile API – Retrieve user details
Update Profile API – Modify user information
Forgot Password API – Password recovery flow

---

## How to Run the Tests

Run using TestNG Suite:

Right Click → suite.xml
Run As → TestNG Suite

OR

Run individual test class:

Right Click → LoginAPITest.java
Run As → TestNG Test

---

## Example Execution Output

Tests run: 5
Failures: 0
Skipped: 0

---

## Key Automation Capabilities Demonstrated

Layered automation framework structure

Reusable service-based API request handling

Strong request/response model mapping

Logging filter integration for debugging support

TestNG listener implementation for execution tracking

Suite-based execution support

Multiple API workflow automation coverage

Maintainable and scalable framework structure

---

## Future Enhancements

CI/CD integration using GitHub Actions or Jenkins

Environment configuration support (dev / qa / staging)

Extent Report integration

Data-driven API testing

Docker-based execution setup

---

## Author

Sonali Tupe

Software Test Engineer
QA Automation | API Testing | Selenium | TestNG | REST API Validation

GitHub:
https://github.com/SonaliTupe16

LinkedIn:
https://www.linkedin.com/in/sonalitupe
