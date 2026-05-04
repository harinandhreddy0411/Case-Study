# Railway Reservation System

## Project Title

Railway Reservation System

## Team Members

* Harinandh Reddy – UML design and code implementation
* Ch. Sai Nitesh Reddy – Helped with documentation and formatting
* Innamuri Ganesh – Assisted in testing the program output
* Thummalapalli Vardhan – Helped in preparing diagrams
* P.V.V. Charan Raj – Helped in organizing repository files


## Problem Description

This project is a simple Railway Reservation System that allows passengers to search for trains, book tickets, and cancel them. It also includes an admin module where trains can be added, updated, or deleted.

The main goal of this project is to understand object-oriented concepts and apply them using a real-world example.

## How to Run the Code

1. Open the project in any Java IDE (Eclipse, IntelliJ, or VS Code)
2. Go to:
   src/railway/Main.java
3. Run the Main class
4. The output will be shown in the console

## Sample Input / Output

Input:
No user input is required. The program runs with predefined data.

Output:

* Passenger registration and login
* Train search results (based on source, destination, and seat availability)
* Ticket booking and display
* Seat update after booking
* Ticket cancellation

Refer to the output folder for screenshots.

## Tools and Technologies Used

* Java (JDK 8 or above)
* Java Collections Framework (ArrayList)
* Object-Oriented Programming concepts:

  * Inheritance
  * Abstraction
  * Composition
  * Aggregation
* UML Diagrams:

  * Class Diagram
  * Sequence Diagram
  * Use Case Diagram
* IDE Used: Eclipse / IntelliJ / VS Code

## Repository Structure

/Phase1 – Problem analysis
/Phase2 – UML diagrams
/src – Source code files
/output – Output screenshots
README.md – Project details

## Key Features

Passenger:

* Register and login
* Search trains
* Book tickets
* Cancel tickets

Admin:

* Add train
* Update train details
* Delete train
* Update schedule

## Design Notes

* An abstract class Person is used as a base for Passenger and Admin to avoid duplication.
* Composition is implemented between Train and Ticket.
* Passenger maintains references to tickets (aggregation).
* The program flow follows the sequence diagram designed in Phase 2.

---

## Conclusion

This project demonstrates how a basic reservation system can be designed using UML and implemented using Java. It shows the use of object-oriented principles and clear mapping between design and implementation.
