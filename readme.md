Student's CashMate

Students’ CashMate is a console-based allowance tracking system designed to help students manage their daily finances more efficiently. The program allows users to input their allowance, record expenses, update transactions, and automatically compute their remaining balance, giving them a clear picture of their spending habits. Its main features include organized transaction recording, balance calculation, and easy modification of financial entries. By providing a simple and structured way to track money, CashMate solves the common problem of students losing track of their allowance and overspending, helping them build better budgeting habits and financial responsibility.

OOP Concepts Applied

1. Encapsulation

Encapsulation is used to protect sensitive data such as the student’s allowance, expenses, amounts, and dates. These values are stored in private fields inside classes like Students, Transaction, Allowance, and Expense, and can only be accessed or modified through public getter and setter methods. This prevents accidental changes, maintains data integrity, and ensures that the program controls how information is updated. 

2. Inheritance

Inheritance is applied by creating a base class (e.g., Transaction) that holds common attributes shared by all financial records—such as id, date, amount, and description. The Allowance and Expense classes inherit from this base class, reusing these shared properties. This avoids code duplication and allows the project to extend functionalities easily by adding more transaction types in the future.

3. Polymorphism

Polymorphism is used to handle different transaction types dynamically. By referencing objects through the base class Transaction, the program can store Allowance and Expense objects in the same list and process them using overridden methods. For example, methods like displayDetails() can behave differently depending on whether the object is an allowance entry or an expense entry, allowing flexible and uniform handling of varied operations

4. Abstraction

Abstraction is implemented by defining general financial operations at a high level in the Transaction abstract class. The details of how each transaction type works are hidden and handled in the subclasses. This allows the program to provide a clean and simple interface for actions like calculating balances or updating entries while keeping the underlying logic organized and easy to maintain.

Program Structure

The Students’ CashMate application is organized into several classes that work together to manage allowance and expense tracking efficiently. Each class has a specific responsibility, following clean OOP design to maintain readability, maintainability, and modularity.

1. Main Class

Role:

- Serves as the entry point of the application.

- Handles the menu system, user inputs, and interaction flow.

- Manages the ArrayList<Transaction> which stores all allowance and expense records.

- Calls methods from other classes to perform actions like adding transactions, displaying records, and computing balances.

2. Transaction 

Role:

- Acts as the parent class for all financial record types.

- Contains common fields such as id, date, amount, and description.

- Provides shared validation and behaviors.

- Declares abstract or overridable methods that child classes implement, such as displaying transaction information.

3. Allowance Class 

Role:

- Represents money received by the student (daily allowance, extra funds, etc.).

- Extends the Transaction class and may override methods to display details specific to allowance entries.

- Contributes positive amounts to the student’s balance.

4. Expense Class 

Role:

- Represents money spent.

- Overrides displayDetails() to show expense information.

- Implements getSignedAmount() to return a negative value, reducing the balance.

Authors

- Abante, Mike Kenley A. 
- Amping, Cedric Jules M. 
- Arabe, Dave Marion S. 
- Asis, Rhovic William M. 

How to Run
- Copy or download the repository
- Open an IDE
- Run Main.java
- Follow console prompts

