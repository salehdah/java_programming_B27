package day16_string;

public class somme {
    public static void main(String[] args) {
        int num =500;
        int sum = num;
        while (num >0){
            sum+=--num;
        }
        System.out.println(sum);
    }
}
