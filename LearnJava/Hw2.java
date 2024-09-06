import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int counting = 0;
        int num_to_print = 0;
        int num_of_spaces = num;

        if (num > 0) {
            while (counting != num) {
                counting += 1;
                while (num_to_print != counting) {
                    for (int i = 0; i < counting; i++) {
                        for (int a = 0; a < num_of_spaces; a++) {
                            System.out.print(" ");
                        }
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
