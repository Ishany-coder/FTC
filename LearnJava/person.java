public class person {
    int age;
    String name;

    person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
    void sayHello() {
        System.out.println("Hello from person class");
    }
}