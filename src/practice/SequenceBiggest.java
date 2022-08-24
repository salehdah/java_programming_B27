package practice;

import java.util.Scanner;

public class SequenceBiggest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input");
        String input = scan.nextLine();
        int biggest = 0;
        int count = 1;
        String biggestSub = "";

        for (int i = 0; i < input.length() - 1; i++) {
            String eachChar = input.substring(i, i + 1);

            if (eachChar.contains(input.substring(i + 1, i + 2))) {
                count++;
            } else {
                count = 1;
            }
            if (count > biggest) {
                biggest = count;
                biggestSub = eachChar;
            }
        }

        System.out.println(biggestSub.repeat(biggest));

    }
}
