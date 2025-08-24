//interface is a pyre abstraction which makes multiple interface class to be implemented in a class
interface Animal{
    void walk();
    int eyes=2;//final its can,t be changed it fix's that  evry animal has 2 eyes
}
interface herbivours{

}
//class that implements to interface classes
class Horse implements Animal,herbivours{
    //methods are implemented by the derived class but we need to define here
    public void walk(){
        System.out.println("horse walks with 4 legs");
    }
}
public class interfaces{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();//sinces it is a method
       System.out.println(h1.eyes);//sinces eyes is an intialization
    }
    
}

