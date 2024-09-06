public class mainEmployee {
        public static void main(String[] args) {
                Employee emp = new Employee();
                emp.setName("Ishan");
                emp.setAge(50);
                emp.setSalary(100000000);
                System.out.println("Employee name: " + emp.getName());
                System.out.println("Employee age: " + emp.getAge());
                System.out.println("Employee salary: " + emp.getSalary());
        }
}