package day03_variables;

public class Store {
    public static void main(String[] args) {
        int numberOfItems=1000;
        System.out.println(numberOfItems + " in the store");
        numberOfItems=700;//reassigned 700 into the variable
        System.out.println(numberOfItems + " after sale");
        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment);
        double totalCost = 10000000.99;
        System.out.println(totalCost);
        float f = 19.99F;
        float f2 = 100;
        System.out.println(f);
        System.out.println(f2);
        long population=8_000_000_000L;
        System.out.println(population);
        long pop2=1_000_000;//L is not needed cuz one million is not that big of a number

    }
}
