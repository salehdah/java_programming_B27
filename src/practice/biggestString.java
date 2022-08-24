package practice;

import java.util.Scanner;

public class biggestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int i;
        String longestString="";
        for(i=0;i<str.length();i++){
            if(str.length()<=2 && str.charAt(0)==str.charAt(1)) {
               longestString=str;
                  break;
               } else if(str.length()<=2 && str.charAt(0)!=str.charAt(1)) {
               longestString+=""+str.charAt(0);
                break;
            } else if (str.charAt(i)==str.charAt(i+1) ) {
                do {
                longestString+=""+str.charAt(i+2);
                longestString+=""+str.charAt(i)+str.charAt(i+1);
                i++;
            } while (str.charAt(i+1)==str.charAt(i+2) && i <str.length()-3 );



        }

            }
        System.out.println(longestString);
        int temp =1;

        }

    }

