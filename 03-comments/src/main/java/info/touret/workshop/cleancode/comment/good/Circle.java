package info.touret.workshop.cleancode.comment.good;

public class Circle {
    private int x; // abscissa
    private int y; // ordinate
    private int radius;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    // return the position on y
    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    //return true if the radius is bigger than circle2
    public Boolean isBiggerRadius(Circle circle2){
        if( circle2 ==null){
            throw new IllegalArgumentException();
        }

        if ( this.getRadius() > circle2.getRadius()){
            return true;
        } else {
            return false;
        }
    }
}
