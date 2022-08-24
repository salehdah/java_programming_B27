package practice;
/*
how to write a program that can print 100 cities names?
 */

public class HundredCities {
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for (int j=8;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
