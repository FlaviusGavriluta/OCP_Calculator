
# OCP_calculator

## Scenario

Let's assume we have a Calculator class that has an add method to add two numbers. Now, we want to extend this class to also perform subtraction,
multiplication, and division operations without modifying the existing code.

## Initial Code

Initially, we have the Calculator class with just one add method.

## Code Extension

To adhere to the Open/Closed Principle (OCP), we will create an Operation interface and make each type of operation implement this interface.
This way, the Calculator class can perform any operation that implements the interface without being modified.

## Code Testing

We can now test the code to see if it functions properly.

## Extended Scenario

Let's add a new feature to our calculator: the power operation. We want to do this without modifying the Calculator class or other existing classes.

## Step 1: Creating a New Class for the New Operation

We will create a new class, Exponentiation, that implements the Operation interface.

## Step 2: Using the New Operation

We don't have to modify the Calculator class or other classes to add this new operation. We simply instantiate it and use it.


## In the Context of OOP and SOLID

* OCP: The Calculator class is now open for extension (we can add new types of operations) but closed for modification (we don't have to modify the class
  to add new types of operations). Here's another example of how the Calculator class remains unchanged while we add new functionality. This is the essence
  of the Open/Closed Principle.

* OOP: We use polymorphism and inheritance to allow different types of operations to be treated uniformly.In the Context of OOP and SOLID. Polymorphism and
  interfaces allow us to add new behaviors (mathematical operations, in this case) in a very organic and extendable way.

Given your interest in object-oriented programming and Java, this scenario perfectly illustrates the Open/Closed Principle, one of the SOLID principles.
It shows how to design classes that are open for extension but closed for modification, thereby ensuring that existing code doesn't have to be altered to
add new features. This is achieved through the use of interfaces and polymorphism, core concepts in OOP.