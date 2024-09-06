public class Employee {
        private String name = "John";
        private int age = 25;
        private int salary = 1000000;
        public void setName(String name) {
                this.name = name;
        }
        public void setAge(int age) {
                this.age = age;
        }
        public void setSalary(int salary) {
            if (salary >= 10000) {
                this.salary = salary;
            } else {
                System.out.println("Salary is too low");
            }
        }
        public String getName() {
                return name;
        }
        public int getAge() {
                return age;
        }
        public int getSalary() {
                return salary;
        }
}
