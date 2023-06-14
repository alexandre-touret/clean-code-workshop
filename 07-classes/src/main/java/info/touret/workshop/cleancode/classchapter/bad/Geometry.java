package info.touret.workshop.cleancode.classchapter.bad;

import static java.lang.Math.PI;

public class Geometry {

    public int circleAbsissa;
    public int circleOrdinate;
    public int circleRadius;

    public int rectangleAbscissa;
    public int rectangleOrdinate;
    public int rectangleHeight;
    public int rectangleWidth;
    public int squareAbscissa;
    public int squareOrdinate;
    public int squareHeight;
    public int squareWidth;

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.circleRadius = 5;
        System.out.println("Circle computeArea: " + geometry.computeArea("circle"));
        geometry.rectangleWidth = 10;
        geometry.rectangleHeight = 10;
        System.out.println("Rectangle computeArea: " + geometry.computeArea("rectangle"));
        geometry.squareHeight = 10;
        System.out.println("Square computeArea: " + geometry.computeArea("square"));
    }

    private double computeArea(String shape) {
        double a = 0;

        if (shape.equalsIgnoreCase("circle")) {
            return circleRadius * circleRadius * PI;
        } else {
            if (shape.equalsIgnoreCase("rectangle")) {
                return rectangleHeight * rectangleWidth;
            } else {
                if (shape.equalsIgnoreCase("square")) {
                    return squareHeight * squareHeight;
                }
            }
        }
        return a;
    }
}
