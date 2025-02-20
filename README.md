Simple Spring Boot Calculator

A simple web-based calculator application built with Spring Boot. It allows users to perform basic arithmetic operations like addition, subtraction, multiplication, division, and modulus. The result is displayed dynamically after submitting the form.
Features

    Basic Arithmetic Operations:
        Addition
        Subtraction
        Multiplication
        Division
        Remainder (Modulus)

    Responsive User Interface:
        Simple, easy-to-use interface.
        Styled with CSS for a sleek, modern look.

Requirements

    Java 11+
    Maven (for building and running the application)
    Spring Boot (for the web framework)

Setup Instructions
Clone the repository - git clone https://github.com/SamikshaB-14/simple-spring-boot-calculator.git
cd simple-spring-boot-calculator

Project Structure - 

src
│
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── demo
│   │               ├── CalciController.java       # Controller to handle routes and user input
│   │               └── CalciService.java          # Service to perform calculations
│   └── resources
│       ├── templates
│       │   ├── home.html                         # The main page with calculator formHow to Use

    On the Home Page:
        Enter two numbers (Num1 and Num2).
        Select an operation (Addition, Subtraction, Multiplication, Division, Remainder).
        Click on the corresponding button to perform the operation.

    On the Result Page:
        After the calculation, the result will be displayed on the page.
        You can perform another operation by entering new numbers and selecting a new operation.

Troubleshooting

    Division by Zero: If you try to divide by zero, the application will throw an ArithmeticException.


│       │   └── result.html                       # The result page displaying the calculation result
│       └── application.properties                # Application properties (for server port, etc.)
└── pom.xml                                      # Maven build file with dependencies
