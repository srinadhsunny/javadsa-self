abstract class Animal{
    //constructor in abstract class
    Animal(){
        System.out.println("animal is created");
    }
    //abstract method
    abstract  void walk();
    
    //public method
    public void Eat() {
        System.out.println("eating");
    }
}

//class that extends abstract class
    class Horse extends Animal {
        public void walk(){
            System.out.println("horse walks with 4 legs");
        }
    }

    // secound class that extends abstract class
    class Chicken extends Animal{
        public void walk(){
            System.out.println("chicken walks with 2 legs");
        }

    }


public class abstraction {

    public static void main(String[] args) {
        Horse h1 = new Horse();
       h1.walk();
        
    }
}