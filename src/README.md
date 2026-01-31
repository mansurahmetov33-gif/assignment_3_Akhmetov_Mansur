# A. Project Overview

The goal of the project is to create a car rental management system that demonstrates the principles of OOP in Java

The application is built using a layered architecture that separates responsibilities between models, repositories, services, and utility classes. The project emphasizes the use of interfaces, abstraction, encapsulation, generics, lambdas, streams, and reflection.

The system uses JDBC and PostgreSQL for data persistence. Repository interfaces are used to abstract database access, while implementation classes contain the actual SQL logic.

# B. Class Hierarchy & Architecture

The Car, Customer, Rental and Engine model classes represent the main domain entities of the system.

Interfaces are used to define common behavior:

* Priced - provides a unified way to access pricing information
* Valid - generic interface for entity validation

Repositories: I used interfaces to define how we work with data. The actual JDBC code is hidden in the implementation classes.

Services: This is where the main logic lives. Services talk to repositories to get things done, so they don't have to deal with the database directly.

Utils used to support functionality:
* DatabaseConnection - manages JDBS connection
* ReflectionUtils - demonstrates usage of Java Reflection API
* SortingUtils - performs sorting using streams and lambdas.

# C. Functional Programming Features

The project uses lambda expressions and streams to process collections, for example, to sort cars by price in a simple and functional way.

# D. Reflection section

ReflectionUtils retrieves information about:
* fields
* class names
* methods

This demonstrates how Java can analyze program structure dynamically without knowing class details at compile time.

# E.  Instructions to Compile and Run

For compilation :

~~~ 
javac *.java
~~~
To run the program:
~~~
java Main
~~~


# F. Technologies Used

- Java
- PostgreSQL
- JDBC
- IntelliJ IDEA


# G.Reflection Section

My thoughts on the architecture: Using repository and service layers helped me a lot with organizing the project. It’s much better when every class has its own task. I used repository interfaces to work with abstractions, which is a good OOP rule I wanted to follow.

The service layer made the business logic easier to handle because it’s separated from the database code. The most difficult part was organizing all the packages correctly and making sure the layers work together well without making the code too complicated.

While working on assignment 4, I better understood how to structure a Java project using a layered architecture. Dividing the project into models, repositories, services, and utility classes has made the code much cleaner and clearer.


Overall, this assignment reinforced my understanding of advanced OOP concepts and showed me how different Java functions can work together in a single project.
