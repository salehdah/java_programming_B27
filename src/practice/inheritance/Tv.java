package practice.inheritance;

public class Tv extends Device {
    public Tv(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    public static void usingDevice(){
        System.out.println("the tv is being used");
    }
    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
