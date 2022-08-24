package practice;

import java.util.Scanner;

public class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String newWord="";

        for(int i =0;i< str.length();i++){
            if(i+1<str.length()){
                if(str.charAt(i)!=str.charAt(i+1)){
                    newWord += str.charAt(i);
                }
            }
            if(i+1==str.length()){
                newWord+=str.charAt(i);
            }
        }
        System.out.println(newWord);
    }
}
