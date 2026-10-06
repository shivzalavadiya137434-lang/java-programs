import java.util.Scanner;

public class NestedIf{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a movie ticket? (true/false): ");
        boolean ticket = sc.nextBoolean();

        if (age >= 18) {
            if (ticket) {
                System.out.println("You are eligible to watch the movie.");
            } else {
                System.out.println("You are eligible, but you need a movie ticket.");
            }
        } else {
            System.out.println("You are not eligible to watch the movie.");
        }

        sc.close();
    }
}