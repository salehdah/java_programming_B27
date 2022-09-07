package practice.inheritance;

public class LyftXl extends Lyft{
    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles)+ super.calculateRate(miles)*0.1;
    }
}
