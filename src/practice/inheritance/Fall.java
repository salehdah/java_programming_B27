package practice.inheritance;

public class Fall extends Season {

    public Fall(String name, int highestAverageTemp, int lowestAverageTemp) {
        super(name, highestAverageTemp, lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("read a book");
    }
}
