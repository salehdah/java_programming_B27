package practice.inheritance;

public class CheckSeason {
    public static void main(String[] args) {
        Winter winter=new Winter("winter", 65,15);
        Summer summer=new Summer("summer",101,70);
        Fall fall=new Fall("fall",80,32);
        Spring spring=new Spring("spring",75,25);
        winter.activity();
        summer.activity();
        fall.activity();
        spring.activity();

        Lyft trip=new Lyft();
        System.out.println("$"+trip.calculateRate(58));
    }
}
