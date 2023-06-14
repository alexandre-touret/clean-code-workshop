package info.touret.workshop.cleancode.meaningfulname.bad;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Geometry {
/**
* Gets area
*/
    private double a(Object shape) {
        double a = 0;

        if (shape instanceof Circle) {
            a = pow(((Circle) shape).getR(), 2) * PI;
        } else {
            if (shape instanceof Rectangle) {
                a = (((Rectangle) shape).getH() * ((Rectangle) shape).getW());
            } else {
                if (shape instanceof Square) {
                    a = (((Square) shape).getH() * ((Square) shape).getW());
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Circle c = new Circle();
        c.setR(10);
        System.out.format("Circle Area:%s%n", geometry.a(c));
        Rectangle r = new Rectangle();
        r.setH(10);
        r.setW(5);
        System.out.format("Rectangle Area:%s%n", geometry.a(r));
        Square s = new Square();
        s.setH(10);
        s.setW(5);
        System.out.format("Square Area:%s%n", geometry.a(s));
    }
}
