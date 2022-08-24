
package day10_if_statement;

import java.util.Scanner;

public class chooseLanguage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please select your language\n1-English\n2 - Spanish\n3 - Turkish\n4 - Russian\n5 - French");
        int n=input.nextInt();
        String message=" ";
        if (n==1){
            System.out.println("hello, thank for your call");
        } else if (n==2) {
            message="hello, thank for your call";

        } else if (n==3) {
           message="merhaba, aradiginiz icin tesekkurler";
        } else if (n==4) {
            message="privet, spasibo za vash zvonok";

        } else if (n==5) {
            message="Merci ,pour votre appel";

        }else {
            message="hello, thank for your call";
        }
        System.out.println(message);

    }
}


