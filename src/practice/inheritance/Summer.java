package practice.inheritance;

public class Summer extends Season{

    public Summer(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("drink lemonade");
    }
}
