package practice.objects;

import practice.objects.car;

public class CarTest {
    public static void main(String[] args) {
        car car1= new car();
        car1.model="mercedes";
        car1.year=2010;
        car1.color="green";
        car1.fuelLevel=100;
        car1.drive();
        System.out.println(car1);;
    }

}
