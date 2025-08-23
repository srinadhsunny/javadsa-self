//non parametrized
class student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(name);
        System.out.println(age);
        //constructor is called when  new is used to create instances(particular object storage) //same as class withput return type
    }
        student(){
            System.out.println("constructor called");
        }
    
}
public class constructor {

    public static void main(String[] args) {
        student s1 = new student();
        //constructor is used above that we created
        s1.name="sunny";
        s1.age=20;
        s1.printinfo();
    }

}
