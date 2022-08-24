package practice;

import java.util.Scanner;

public class ToUpperCase {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            String word1 = "";

            String[] words=str.split("[ ]+");
            word1 = words[0];
            for(int i = 1;i<words.length;i++){
                String first=words[i].substring(0,1);
                String afterFirst=words[i].substring(1);
                word1+=first.toUpperCase()+afterFirst;
            }
            System.out.println( word1.trim());
        }

}
