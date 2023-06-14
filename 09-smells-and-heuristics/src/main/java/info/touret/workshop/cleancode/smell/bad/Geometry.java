package info.touret.workshop.cleancode.smell.bad;

import java.util.Optional;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Geometry {

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Circle c = new Circle();
        c.setRadius(10);
        System.out.format("Circle Area:%s%n", geometry.computeArea(c, ShapeDefinition.CIRCLE));
        Rectangle r = new Rectangle();
        r.setHeight(10);
        r.setWidth(5);
        System.out.format("Rectangle Area:%s%n", geometry.computeArea(r, ShapeDefinition.RECTANGLE));
        Square s = new Square();
        s.setHeight(10);
        System.out.format("Square Area:%s%n", geometry.computeArea(s, ShapeDefinition.SQUARE));
    }

    public double computeArea(Object shape, ShapeDefinition shapeDefinition) {

        switch (shapeDefinition) {
            case CIRCLE:

                Circle circle = (Circle) shape;
                if (circle == null || circle.getRadius() < 0) {
                    throw new IllegalArgumentException();
                }
                return pow(circle.getRadius(), 2) * PI;


            case SQUARE:
                Square square = (Square) shape;
                square = Optional.ofNullable(square).filter(square1 -> square1.getHeight() > 0).orElseThrow(IllegalArgumentException::new);
                return square.getHeight() * square.getHeight();

            case RECTANGLE:
                return (((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth());

            default:
                throw new IllegalArgumentException("Invalid shapeDefinition " + shapeDefinition);
        }
    }
}
