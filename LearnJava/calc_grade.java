import java.util.Scanner;

public class calc_grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = scan.nextInt();
        System.out.println("Your grade is: " + grade(grade));
    }

    public static String grade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}