import java.util.Scanner;
public class shape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for the radius of a circle whos area you want to find: ");
        int radius = scan.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int length = scan.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = scan.nextInt();
        circle c1 = new circle(radius);
        rectangle r1 = new rectangle(length, width);
        System.out.println("The area of the circle is: " + c1.getArea(radius));
        System.out.println("The area of the rectangle is: " + r1.getArea(length, width));

    }
}
