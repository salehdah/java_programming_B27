package day13_switch;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your floor");
        int floor = input.nextInt();
        String companies;

        switch (floor){

            case 1:
                companies = "Lobby, StarBucks, Amazon Pick Up";
                break; // stops the switch
            case 2:
                companies = "NASA, Cydeo, Discover";
                break; // stops the switch
            case 3:
                companies = "Uber, Lyft, Chase";
                break; // stops the switch
            case 4:
                companies = "Rooftop, Lounge";
                break; // stops the switch
            default: // defined anywhere in the switch, but it will be the case executed if no other case matches
                companies = "Invalid Floor Selected";
        }

        System.out.println("Floor " + floor + ": " + companies);

    }
}
