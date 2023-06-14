package info.touret.workshop.cleancode.errorhandling.bad;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("AREA: " + circle.getArea());
        try {
            System.out.println("PERIMETER: " + circle.getPerimeter());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
