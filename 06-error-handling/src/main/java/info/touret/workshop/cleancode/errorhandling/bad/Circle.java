package info.touret.workshop.cleancode.errorhandling.bad;

public class Circle {
    private Integer x; // abscissa
    private Integer y; // ordinate
    private Integer radius; //radius

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }


    /**
     * @return The area
     */
    public Double getArea() {
        if (radius == null) {
            return null;
        } else {
            return Math.PI * getRadius();
        }
    }

    public Double getPerimeter()  {

        if (getRadius() == null || getRadius() < 0) {
            throw new IllegalStateException("invalid radius");
        }else{
            return Math.PI * getRadius() * 2;
        }
    }
}
