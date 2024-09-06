public class animal{
    public interface inneranimal {
        public void eat ();
        public void sound ();
        public void sleep ();
    }
    public static class dog implements inneranimal {
        public void eat () {
            System.out.println ("Dog is eating");
        }
        public void sound () {
            System.out.println ("Dog is barking");
        }
        public void sleep () {
            System.out.println ("Dog is sleeping");
        }
    }
        
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.sound();
        d.sleep();
    }
    

}