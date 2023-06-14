# Objects and data structure

## Theory

This is a complex topic so pay good attention to it. First we need to clarify the difference between object and Data Structures.

-Objects hide their data behind abstractions and expose functions that operate on that data. Data structure expose their data and have no meaningful functions.-

These 2 things are completely different. One is just about storing data and other is how to manipulate that data.

## Example

Consider three shape class and one geometry class.
The shape are simple data structures without any behavior, all the behavior is in the Geometry class.

```java
public class Square {
  public Point topLeft;
  public double side;
}

public class Rectangle {
  public Point topLeft;
  public double height;
  public double width;
}

public class Circle {
  public Point center;
  public double radius;
}

public class Geometry {
  public double area(Object shape) throws NoSuchShapeException {
    if (shape instanceof Square) {
        Square s = (Square)shape;
        return s.side * s.side;
    } else if (shape instanceof Rectangle) {
        Rectangle r = (Rectangle)shape;
        return r.height * r.width;
    } else if (shape instanceof Circle) {
        Circle c = (Circle)shape;
        return PI * c.radius * c.radius;
    }
        throw new NoSuchShapeException();
    }
}
```
If we add a perimeter function to Geometry. The shape class would be unaffected.
On the other hand, if we add new shape, all the functions in Geometry must change.

There is another approach.

```java
public class Square implements Shape {
  private Point topLeft;
  private double side;
  public double area() {
    return side*side;
  }
}

public class Rectangle implements Shape {
  private Point topLeft;
  private double height;
  private double width;
  public double area() {
    return height * width;
  }
}

public class Circle implements Shape {
  private Point center;
  private double radius;
  public double area() {
    return PI * radius * radius;
  }
}
```

Now we can easily add new shape but if we want to add perimeter function in one shape,  all the shape must change.

__[Next Chapter : Error handling](../06-error-handling/README.md)__