package day8_scanner;
import java.util.Scanner;
public class EmployeeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your full name");
        String fullName = input.nextLine();
        System.out.println("enter your job tiltle");
        String jobTiltle = input.nextLine();
        System.out.println("what is your hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("what your average number of hours in a week");
        double hours = input.nextDouble();
        double salary = hours*hourlyRate*52;
        input.nextLine();
        System.out.println("where is your company HQ");
        String hqlocation = input.nextLine();
        System.out.println("are you full time : true or false");
        boolean isFullTime=input.nextBoolean();
        System.out.println(fullName + " his job is "+ jobTiltle+ " he is working "+ hours+ " hours a week"+ " at the hourly rate of "+hourlyRate+" his salary is: "+ salary+ " and is he is fulltime "+ isFullTime+ " his company is located in "+ hqlocation);
    }
}
