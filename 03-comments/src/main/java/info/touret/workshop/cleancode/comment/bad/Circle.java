package info.touret.workshop.cleancode.comment.bad;
import java.lang.IllegalArgumentException;
public class Circle {
    private int x; // abscissa
    private int y; // ordinate
    private int r; //radius

    // return the position on x
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

    // return the radius
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    //return true if the radius is bigger than circle2
    public Boolean compareRadius(Circle circle2){
        if( circle2 ==null){
            throw new IllegalArgumentException();
        }

        if ( this.getR() > circle2.getR()){
            return true;
        } else {
            return false;
        }
    }
}
