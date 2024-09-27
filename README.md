# Design Patterns in Java

Udmey Course: [Design Patterns in Java](https://www.udemy.com/course/design-patterns-java/?couponCode=ST18MT62524)

Instructor: [Dmitri Nesteruk](https://www.udemy.com/course/design-patterns-java/?couponCode=ST18MT62524#instructor-1)

## Solid Design Principles

### Introduction

- Design patterns are common architectural approaches
- Popularized by the Gang of Four book (1994)
  Smalltalk & C++
- Translated to many OOP languages C#, Java, C++, ...
- so Universally relevant

  - Internalized in some programming languages
  - Libraries
  - Your own code!

Reference: https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/

1. [Single Responsibility Principle - SRP](./notes/design-principles/SRP.md)
2. [Open-Closed Principle -OSP](./notes/design-principles/OCP.md.md)
3. [Linkov Substitution Principle - LSP](./notes/design-principles/LSP.md)
4. [Interface Segregation Principle - ISP](./notes/design-principles/ISP.md)
5. [Dependency Inversion Principle - DIP](./notes/design-principles/DIP.md)

# Gamma Categorization

Design Patterns are typically split into three categories
This is called Gamma Categorization after Erich Gamma, one of GoF authors

## Creational Patterns

Deal with the creation (construction) of objects
Explicit (constructor) vs. implicit (DI, reflection, etc.)
Wholesale (single statement) vs. piecewise (step-by-step)

- Builder
- Factories
  - Abstract Factory
  - Factory Method
- Prototype
- Singleton

## Structural Patterns

Concerned with the structure (e.g., class members)

Many patterns are wrappers that mimic the underlying class' interface

Stress the importance of good API design

- Adapter
- Bridge
- Composite
- Decorator
- Façade
- Flyweight
- Proxy

## Behavioral Patterns

They are all different; no central theme

- Chain of Responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Null Object
- Observer
- State
- Strategy
- Template Method
- Visitor

# Builder

when construction gets a little bit too complicated.

## Motivation

@ Some objects are simple and can be created in a single constructor call

@ Other objects require a lot of ceremony to create

@ Having an object with 10 constructor arguments is not productive

Instead, opt for piecewise construction

Builder provides an API for constructing an object step-by-step

```text
Builder: When piecewise object construction is complicated, provide an API for doing it succinctly.
```
