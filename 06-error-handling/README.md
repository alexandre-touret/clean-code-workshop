# Error Handling

## Theory

### Don't use ``NULL``

If you return null values as   

```java
public List<Geometry> getGeometries(){
    return geometries;
}
```

You have to handle ``null`` in your code.

```java
if( myclass.getGeometries()==null){
    // do some stuff
}
    
}
```

Prefer this code

```java
public List<Geometry> getGeometries(){
    return Optional.ofNullable(geometries).orElse(Collections::emptyList);
}
``` 

In this way you don't have to handle ``null`` and prevent ``NullPointerException``.


### Use exceptions only for exceptional conditions

Don't use exceptions for testing ( number format, array size,...)

```java
try {
    int i = 0;
    while(true){
        range[i++].climb();
        }
    } catch (ArrayIndexOutOfBoundsException e) {}
```   

There are some things wrong with this reasoning:
* Because exceptions are designed for exceptional circumstances, there is little incentive for JVM implementors to make them as fast as explicit tests.
* Placing code inside a try-catch block inhibits certain optimizations that JVM implementations might otherwise perform.

__Exceptions are, as their name implies, to be used only for exceptional conditions; they should never be used for ordinary control flow.__

### Use checked exceptions for recoverable conditions and runtime exceptions for programming errors.

If an exception cannot be recoverable (eg. database connection is broken), don't use checked exception. 
However, catch the exceptions at the boudary of your system to encapsulate them into appropriate errors for your client.

Use checked exceptions for conditions from which the caller can reasonably be expected to recover.

### Avoid unnecessary use of checked exceptions

Prefer ``RuntimeException``.
If you don't have to check an exception, let it throw to the caller.
Catch it on the boundary of your system to filter and encapsulate the error with appropriate error codes 

### Favor the use of standard exceptions

There are plenty standard interfaces. Use them instead creating custom exceptions.

You can find below some examples

|Exception| Occasion for Use|
----------|:---------------|     
|IllegalArgumentException| Non-null parameter value is inappropriate|
|IllegalStateException |Object state is inappropriate for method invocation|
|NullPointerException |Parameter value is null where prohibited|
|IndexOutOfBoundsException |Index parameter value is out of range|
|ConcurrentModificationException |Concurrent modification of an object has been detected where it is prohibited|
|UnsupportedOperationException | Object does not support method|

### Document all exceptions thrown by each method

Document on your javadoc all the exceptions thrown by your method 


```java

/**
* ....
*
* @throws IndexoutofBoundsException : the index is too high
*/
public E get(int index){
    ListIterator<E> iterator = listIterator(index);
    
    try{
        return i.next();
        
    }catch(NoSuchElementException e){
        throw new IndexoutofBoundsException("index :"+index);
    }
}

```

## Katas

Review all the classes which are in the package [``...bad``](src/main/java/info/touret/workshop/cleancode/errorhandling/bad) .
Copy them into the [``...good``](src/main/java/info/touret/workshop/cleancode/errorhandling/good) one and fix them regarding the advices given in this chapter.


__[Next Chapter : Classes](../07-classes/README.md)__
