package practice;
/*
Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc
 */

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String newWord="";

        while (str.length()>0){
            newWord+=str.charAt(0);
            str=str.replaceAll(str.substring(0,1),"");
        }
        System.out.println(newWord);

        }
    }

