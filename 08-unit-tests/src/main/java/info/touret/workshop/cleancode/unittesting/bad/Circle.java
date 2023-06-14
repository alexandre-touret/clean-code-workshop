package info.touret.workshop.cleancode.unittesting.bad;

public class Circle {
    private int abscissa;
    private int ordinate;
    private int radius;

    public int getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(int abscissa) {
        this.abscissa = abscissa;
    }

    public int getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(int ordinate) {
        this.ordinate = ordinate;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double computeArea() {
        if (radius < 0) {
            throw new IllegalStateException();
        }
        return Math.PI * radius * radius;
    }

    public double computePerimeter() {
        if (radius < 0) {
            throw new IllegalStateException();
        }
        return Math.PI * radius * 2;
    }
}
