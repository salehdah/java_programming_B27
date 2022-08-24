package practice;

import java.util.Scanner;

public class whatTimeIsIt {
    public static void main(String[] args) {
        Scanner time=new Scanner(System.in);
        System.out.println("please enter the time");
        int a=time.nextInt();
        if (a>=6 && a<=11) {
            System.out.println("good morning");
        }
        else if (a<=16 && a>=12) {
            System.out.println("good evening");
        } else if ( (a>=17 && a<=23) ||( a>=0 && a<=5 )) {
            System.out.println("good night");
            
        }else {
            System.out.println("time format error");
        }
    }
}
