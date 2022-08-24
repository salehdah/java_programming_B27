package day8_scanner;
import java.util.Scanner;

public class pesronInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = input.next();
        System.out.println("please enter your last name");
        String lastName = input.next();
        input.nextLine();
        System.out.println("please enter your adress");
        String adress = input.nextLine();
        System.out.println(firstName +" "+ lastName +" "+ adress);
    }
}
