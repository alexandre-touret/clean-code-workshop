# Unit Tests

## Theory

### The Three Laws of TDD
By now everyone knows that TDD asks us to write unit tests first, before we write production code.
But that rule is just the tip of the iceberg. 

Consider the following three laws:
1. First Law: You may not write production code until you have written a failing unit test.
2. Second Law: You may not write more of a unit test than is sufficient to fail, and not compiling is failing.
3. Third Law: You may not write more production code than is sufficient to pass the currently failing test.

### Keep your tests clean 

### Organization

#### F.I.R.S.T

Clean tests follow five other rules that form the above acronym:

##### Fast Tests should be fast

They should run quickly.
When tests run slow, you won’t want to run them frequently.
If you don’t run them frequently, you won’t find problems early enough to fix them easily. 
You won’t feel as free to clean up the code.

##### Independent Tests should not depend on each other

One test should not set up the conditions for the next test.
You should be able to run each test independently and run the tests in any order you like.
When tests depend on each other, then the first one to fail causes a cascade of downstream failures, making diagnosis difficult and hiding downstream defects.

#### Repeatable Tests should be repeatable in any environment

You should be able to run the tests in the production environment, in the QA environment, and on your laptop while riding home on the train without a network.
If your tests aren’t repeatable in any environment, then you’ll always have an excuse for why they fail.
You’ll also find yourself unable to run the tests when the environment isn’t available.

##### Self-Validating The tests should have a boolean output

Either they pass or fail.
You should not have to read through a log file to tell whether the tests pass.
You should not have to manually compare two different text files to see whether the tests pass.
If the tests aren’t self-validating, then failure can become subjective and running the tests can require a long manual evaluation

#### Assertions

Test one assertion by method in your test. Use this naming convention

```java
    @Test
    void should_get_a_lastkownmileage() throws Exception {
    ...
    }
    
    [...]
    
     @Test
        public void should_create_partner_and_relations() {
    ...
        }
```

### Given ... When ... Then

In a method, your test should be organized using this following pattern 

```java
    @Test
    void should_get_a_lastkownmileage() throws Exception {
    // given 
        // the context
    // when
        // the user apply some actions
    //then
        // we should have this result
    }
```

## Katas

Review all the classes which are in the package [``...unittesting``](src/main/java/info/touret/workshop/cleancode/unittesting/bad) .
Create the unit tests

__[Next Chapter : Smells and Heuristics](../09-smells-and-heuristics/README.md)__
