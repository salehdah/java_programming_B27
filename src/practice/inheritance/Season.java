package practice.inheritance;

public class Season {
    String name;
    int highestAverageTemp;
    int lowestAverageTemp;

    public Season(String name, int highestAverageTemp, int lowestAverageTemp) {
        this.name = name;
        this.highestAverageTemp = highestAverageTemp;
        this.lowestAverageTemp = lowestAverageTemp;
    }
    public void activity(){

    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }
}
