package practice.inheritance;

public class Device {
    String brand;
    String model;
    double price;
    boolean isWireless;
    public static void usingDevice(){
        System.out.println("the device is being used");
    }

    public Device(String brand, String model, double price, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
