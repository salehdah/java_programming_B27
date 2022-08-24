package day07_scanner;

public class shortCircuitExe {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(true && true);
        int count=0;
        System.out.println(true || count++ ==1);
        System.out.println(count);


    }
}
