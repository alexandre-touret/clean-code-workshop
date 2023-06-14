# Smells and Heuristics

## Theory

Some of the topics described in this README are not fully described in this chapter.
You can refer to each topic in the book by using the references.    


### Environment
#### E1: Build Requires More Than One Step                                                          
Building a project should be a single trivial operation

For example:  

```java
mvn clean install
```

#### E2: Tests Require More Than One Step

So the tests must be as trivial

For example :

```java
mvn test
```

### Functions

#### F1: Too Many Arguments

If you have more than three arguments to your method, consider to apply [the parameter object refactoring pattern](https://refactoring.guru/introduce-parameter-object).

### General

#### G5: Duplication

#### G9: Dead Code

Avoid it ! 

#### G18: Inappropriate Static


``Math.max(double a, double b)`` is a good static method. 
It does not operate on a single instance; indeed, it would be silly to have to say ``new Math().max(a,b)`` or even ``a.max(b)``.

Sometimes, however, we write static functions that should not be static.
For example,consider:
```java
HourlyPayCalculator.calculatePay(employee, overtimeRate).
```

Again, this seems like a reasonable static function. 
It doesn’t operate on any particular object and gets all it’s data from it’s arguments.
However, there is a reasonable chance that we’ll want this function to be polymorphic. 
We may wish to implement several different algorithms for calculating hourly pay, for example, ``OvertimeHourlyPayCalculator`` and ``StraightTimeHourlyPayCalculator``. 
So in this case the function should not be static. 
It should be a nonstatic member function of Employee.
In general you should prefer nonstatic methods to static methods. 

__When in doubt, make the function nonstatic!__
If you really want a function to be static, make sure that there is no chance that you’ll want it to behave polymorphically.


#### G20: Function Names Should Say What They Do

What name should we use for a method providing this behaviour ?

```java
Date newDate = date.add(5);
```

1. addDaysTo 
2. add 
3. obiWanKenobi


#### G25: Replace Magic Numbers with Named Constants

Avoid this kind of code :

```java
double perimeter = 3.14159 * radius * 2 ;    
int dailyPay = hourlyRate * 8;

```

prefer 

```java
double perimeter = Math.PI * radius *2;
int dailyPay = hourlyRate * NUMBER_OF_HOURS_A_DAY;
```

#### G30: Functions Should Do One Thing


### Java

#### J3: Constants versus Enums

Now that enums have been added to the language (Java 5), use them! 
Don’t keep using the old trick of public static final ints. 
The meaning of ints can get lost. 
The meaning of enums cannot, because they belong to an enumeration that is named.
What’s more, study the syntax for enums carefully. They can have methods and fields

### Tests

##### T1: Insufficient Tests

##### T2: Use a Coverage Tool!


You can use both your IDE ( eclipse, intellij ) and SONARQUBE report.
Check the report when developing your tests!

##### T3: Don't Skip Trivial Tests

##### T5: Test Boundary Conditions

For example, if you provide a REST API, check all your HTTP STATUS codes in your integration tests.

##### T9: Tests Should Be Fast

Every tests ( integration and unit ) must be fast.


## Refactoring

Check [this web site](https://refactoring.guru)

Example : [Refactoring of switch case](https://refactoring.guru/smells/switch-statements)

### Katas

Go the [Geometry class](src/main/java/info/touret/workshop/cleancode/smell/bad/Geometry.java). 
Apply a refactoring to this class transforming the 'switch case'.

Validate your refactoring by using [the unit test](src/test/java/net/awl/ppc/dif/common/cleancode/smell/GeometryTest.java).
