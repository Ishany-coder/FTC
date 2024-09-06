import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int counting = 0;
        int num_to_print = 0;

        if (num > 0) {
            while (counting != num) {
                counting += 1;
                while (num_to_print != counting) {
                    for (int i = 0; i < counting; i++) {
                        System.out.print("*");
                    }
                    num_to_print = counting; // Ensure the inner while loop terminates
                }
                System.out.println(); // Move to the next line after printing stars
            }
        } else {
            System.out.println("Enter a positive number");
        }
        scan.close();
    }
}