package day02_print_statements;
/*Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

        Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

        No loop yet

 */
public class ArrayInitial {
    public static void main(String[] args) {
        String[] names={"James Bonds", "Harry Potter", "Tony Stark"};
        System.out.println(""+names[0].charAt(0)+names[0].charAt(names[0].indexOf(' ')+1));
        System.out.println(""+names[1].charAt(0)+names[1].charAt(names[1].indexOf(' ')+1));
        System.out.println(""+names[2].charAt(0)+names[2].charAt(names[2].indexOf(' ')+1));

    }
}