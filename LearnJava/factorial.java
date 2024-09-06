import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number you want to find the factorial of: ");
        int num = scan.nextInt();
        System.out.println(returnfactorial(num));
    }
    public static int returnfactorial(int n){
        if (n == 0){
            return 1;
        }    
        else{
            return n * returnfactorial(n-1);
        }
    }
}
