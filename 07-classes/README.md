# Classes

## Theory

### Class Organization

A class should begin with a list of variables ( private mostly ).

Public static constants should come first, followed by __private__ instance variables.

#### Encapsulation

Keep your variables and utility functions private or protected.
 
### Classes should be small !

The first rule of classes is that they should be small. 
The second rule of classes is that they should be smaller than that!

The name of a class should describe what responsibilities it fulfills. 
In fact, naming is probably the first way of helping determine class size. 

If we cannot derive a concise name for a class, then it’s likely too large. 
The more ambiguous the class name, the more likely it has too many responsibilities

#### Single Responsibility Principle (SRP)

Classes should have one responsibility—one reason to change.

#### Cohesion

Classes that are used and changed together are packaged together.   

### Organization

Prefer a functional packaging instead of a technical packaging.


__Example__

Prefer

```text
geometry
--- model
--- controller
--- repository

```

instead of 


```text
--- model
---- geometry
--- controller
---- geometry
--- repository
---- geometry

```

## Katas

Review all the classes which are in the package [``...bad``](src/main/java/info/touret/workshop/cleancode/classchapter/bad) .
Copy them into the [``...good``](src/main/java/info/touret/workshop/cleancode/classchapter/good) one and fix them regarding the advices given in this chapter.


__[Next Chapter : Unit Tests](../08-unit-tests/README.md)__
