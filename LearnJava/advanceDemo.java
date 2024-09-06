public class advanceDemo {
    public static void main(String[] args) {
        int a = 0;
        if (a > 0) {
            System.out.println("a is positive");
        } else if (a < 0) {
            System.out.println("a is negative");
        } else {
            System.out.println("a is zero");
        }
        // no matter what do at least perform the action once
        // it's like do-while loop
        do {
            System.out.println("hi");
            a+=1;
        } while (a < 1);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        // you can use arrays to store multiple values of the same data type
        // there are two types of arrays
        // 1. one-dimensional array
        String[] names = {"Ishan", "Rishi", "Anay", "Ishika", "Arjit"};
        // 2. multi-dimensional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    }
}