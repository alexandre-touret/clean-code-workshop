package info.touret.workshop.cleancode.comment.bad;

public class Geometry {

    public static void main(String[] args) {

    Circle circle1 = new Circle();
    circle1.setR(10);
    Circle circle2 = new Circle();
    circle2.setR(12);
    //is true if the radius is bigger than circle2
    Boolean radiusCompare = circle1.compareRadius(circle2);
}

}
