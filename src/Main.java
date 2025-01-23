import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your grade?");
        Scanner in = new Scanner(System.in);
        double grade = in.nextDouble();

        if (grade >= 90.0) {
            System.out.println("Your grade is A");
        }
        else if (grade >= 80.0) {
            System.out.println("Your grade is B");
        }
        else if (grade >= 70.0) {
            System.out.println("Your grade is C");
        }
        else if (grade >= 60.0) {
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your grade is F");
        }


    }
}