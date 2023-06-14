package info.touret.workshop.cleancode.function.bad;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Geometry {

    private void CompareSphereArea(int x1, int y1, int z1, int x2, int y2, int z2){

        double radius1 = sqrt(pow(x1,2)+pow(y1,2)+pow(z1,2));
        double radius2 = sqrt(pow(x2,2)+pow(y2,2)+pow(z2,2));
        double sphereArea1 = 4* Math.PI*pow(radius1,2);
        double sphereArea2 = 4* Math.PI*pow(radius2,2);

        if (sphereArea1>sphereArea2){
            System.out.println("sphere 1 area is greater than sphere 2 area");
        }else if(sphereArea1==sphereArea2){
            System.out.println("sphere 1 area is smaller than sphere 2 area");
        } else {
            System.out.println("sphere 1 area equals sphere 2 area");
        }
    }

    private boolean isAsquare(int x, int y){
        if ( x==y ){
            Square s = new Square();
            s.setX(x);
            s.setY(y);
            return  true;
        }else {
            Rectangle rectangle = new Rectangle();
            rectangle.setX(x);
            rectangle.setY(y);
            return false;
        }

    }

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.CompareSphereArea(12,10,9,6,5,16);
        int x = 12;
        int y =12;
        boolean isAsquare = geometry.isAsquare(x,y);
        if (isAsquare == true) {
            Square square = new Square();
            square.setX(x);
            square.setY(y);
        }
    }
}
