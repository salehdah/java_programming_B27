package day06_operators;

public class salary {
    public static void main(String[] args) {
        double salary=100_000.00;
        double federalRate=0.21;
        double stateRate=0.08;
        double federalTax=salary*federalRate;
        double stateTax=salary*stateRate;
        double totalTax=federalTax+stateTax;
        double salaryAfterTax=salary-totalTax;
        System.out.println(salaryAfterTax);
    }
}
