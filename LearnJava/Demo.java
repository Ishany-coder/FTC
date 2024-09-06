public class Demo {
    public static void main(String[] args){
        // you can make multiple vars of the same data type in one line
        int a = 10, b = 20, c = 30;
        String name = "Ishan";
        int year = 2024;
        boolean isGraduating = true;
        float gpa = 4.0f;
        byte age = 20;
        char ch = 'a';
        System.out.println("Hello, my name is " + name + 
        " and I'll graduate in " + year + ". My GPA is "
        + gpa + ". Am I graduating? " + isGraduating + ". I am "
        + age + " years old. My favorite character is " + ch + ".");
        System.out.println("The sum of a, b, and c is " + (a + b + c));
        System.out.println("my name is " + name.length() + " characters long");
        System.out.println("The character at index 2 is " + name.charAt(2));
        System.out.println("Hello world ");
    }
}