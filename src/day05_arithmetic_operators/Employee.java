package day05_arithmetic_operators;

public class Employee {
    public static void main(String[] args) {
        String firstName= "James";
        String lastName = "Bond";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suite ='E';
        int employeeId = 7;
        int numberOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime = true;
        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId + "@" + companyName +".com";
        String benefits = "$" + salary + " salary a year, " + numberOfPTO + " PTO days and work from home";
        System.out.println(fullName);
        System.out.println(email);
        System.out.println(benefits);
    }
}
