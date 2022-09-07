package practice.inheritance;

public class Spring extends Season{
    public Spring(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("go outside");
    }
}
