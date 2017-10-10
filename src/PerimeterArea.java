import java.util.Scanner;

/**
 * Created by golov on 10.10.2017.
 */
public class PerimeterArea {
    public static void main(String[] args) {
        System.out.println("Eneter radius of the circle: ");
        Scanner scn = new Scanner(System.in);
        double radius = scn.nextDouble();
        double perimeter = 2*3.14*radius;
        double area = 3.14*Math.pow(radius,2);
        System.out.println("Perimeter of the circle is "+perimeter);
        System.out.println("Area of the cicle is "+area);

    }
}
