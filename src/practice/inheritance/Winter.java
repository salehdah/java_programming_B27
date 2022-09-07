package practice.inheritance;

public class Winter extends Season{
    public Winter(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("use fireplace");
    }
}
