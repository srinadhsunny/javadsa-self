interface Animal{
    void walk();
    int eyes=2;//final its can,t be changed it fix's that  evry animal has 2 eyes
}
interface herbivours{

}
class Horse implements Animal,herbivours{
    public void walk(){
        System.out.println("horse walks with 4 legs");
    }
}
public class interfaces{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
       System.out.println(h1.eyes);
    }
    
}
