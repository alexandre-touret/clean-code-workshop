package info.touret.workshop.cleancode.comment.good;

public class Geometry {

    public static void main(String[] args) {

    Circle circle1 = new Circle();
    circle1.setRadius(10);
    Circle circle2 = new Circle();
    circle2.setRadius(12);

    Boolean isBiggeRadius = circle1.isBiggerRadius(circle2);
}

}
