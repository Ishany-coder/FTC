import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word you want to check if it's a palindrome: ");
        String str = scan.next();
        str = str.toLowerCase();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
