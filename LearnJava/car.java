public class car extends vechile {
    public String drive(){
        return "Car is driving";
    }
    public String stop(){
        return "Car is stopping";
    }
    public static void main(String[] args) {
        car c = new car();
        c.setName("Car");
        c.getName();
        System.out.println(c.startengine());
        System.out.println(c.stopengine());
        System.out.println(c.drive());
        System.out.println(c.stop());
        System.out.println(c.getName());
    }
    
}
