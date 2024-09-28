# Solid Design Princliples

Useful principles of object-oriented design.

Design principles introduced by Robert C Martin.

Reference: https://www.geeksforgeeks.org/solid-principle-in-programming-understand-with-real-life-examples/

1. [Single Responsibility Principle - SRP](/notes/design-principles/SRP.md)
2. [Open-Closed Principle -OSP](/notes/design-principles/OCP.md)
3. [Linkov Substitution Principle - LSP](/notes/design-principles/LSP.md)
4. [Interface Segregation Principle - ISP](/notes/design-principles/ISP.md)
5. [Dependency Inversion Principle - DIP](/notes/design-principles/DIP.md)

### Summary

- Single Responsibility Principle
  - A class should only have one reason to change
  - Separation of concerns - different classes handling different, independent tasks/problems
- Open-Closed Principle
  - Classes should be open for extension but closed for modification
- Liskov Substition Principle
  - You should be able to substitute a base type for a subtype
- Interface Segregation Principle
  - Don't put too much into an interface; split into separate interfaces
  - YAGNI - You Ain't Going to Need It
- Dependency Inversion Principle
  - High-level modules should not depend upon low-level ones; use abstractions
