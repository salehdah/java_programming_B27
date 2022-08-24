package practice;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String newWord="";
        for (int i=0;i<str.length();i++){
            int count=0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            if(count>1 ){


                newWord+=""+str.charAt(i);
              break;

            }
        }
        System.out.println(newWord);
    }
}
