package day16_string;

public class fizBuzzWhile {
    public static void main(String[] args) {
        int n=1;
        while(n<=50){
            if((n%5==0)&&(n%3==0)){
                System.out.println("fizzBuzz");
            }else if(n%5==0){
                System.out.println("Buzz");
            }else if (n%3==0) {
                System.out.println("fizz");
            }
            n++;
        }
    }
}
