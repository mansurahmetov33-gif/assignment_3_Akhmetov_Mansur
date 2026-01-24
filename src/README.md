# A. Project Overview

The goal of the project is to create a car rental management system that demonstrates the principles of OOP in Java

The application allows you to manage cars, customers, and rentals using a multi-level architecture. The project uses abstraction, dependency injection and encapsulation, and separation of concerns at the repository level. JDBC and PostgreSQL are used to save data.
# B. Class Hierarchy

The Car, Customer, and Rental model classes represent the main domain entities of the system.

Repositories: I used interfaces to define how we work with data. The actual JDBC code is hidden in the implementation classes.

Services: This is where the main logic lives. Services talk to repositories to get things done, so they don't have to deal with the database directly.

Utils: Just some helper classes to manage database connections in one place.

Encapsulation: All data fields are private. I added public getters and setters to keep the state safe and follow OOP rules.


# C.  Instructions to Compile and Run

For compilation :

~~~ 
javac *.java
~~~
To run the program:
~~~
java Main
~~~


# D. Technologies Used

- Java
- PostgreSQL
- JDBC
- IntelliJ IDEA


# E.Reflection Section

My thoughts on the architecture: Using repository and service layers helped me a lot with organizing the project. It’s much better when every class has its own task. I used repository interfaces to work with abstractions, which is a good OOP rule I wanted to follow.

The service layer made the business logic easier to handle because it’s separated from the database code. The most difficult part was organizing all the packages correctly and making sure the layers work together well without making the code too complicated.
