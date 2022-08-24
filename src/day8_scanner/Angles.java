package day8_scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {
        Scanner angle=new Scanner(System.in);
        System.out.println("ples enter the first angle");
        double angle1 = angle.nextDouble();
        System.out.println("please enter the second angle");
        double angle2 = angle.nextDouble();
        System.out.println("please enter the third angle");
        double angle3 = angle.nextDouble();
        double sum = angle1 + angle2 + angle3;
        boolean isTriangle = sum ==180;
        boolean isCircle = sum ==360;
        System.out.println("isCircle= "+isCircle);
        System.out.println("isTriangle= "+isTriangle);

    }
}
