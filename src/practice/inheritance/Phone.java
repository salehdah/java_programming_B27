package practice.inheritance;

public class Phone extends Device{
    public Phone(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    public static void usingDevice(){

        System.out.println("the phone is being used");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
