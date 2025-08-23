//parameterized constructor
class student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(name);
        System.out.println(age);
        //constructor is called when  new is used to create instances(particular object storage) //same as class withput return type
    }
        student(String name,int age){
            System.out.println("constructor called");
            this.name=name;
            this.age=age;
        }
    
}
public class parameterizedconstructor {

    public static void main(String[] args) {
        student s1 = new student("sunny",20);
        //below lines can be replaced with constructor parameters so we gvg  name and age directly in above braces only as a parameters in oresences of parameterized constructors
        // s1.name="sunny";
        // s1.age=20;
        s1.printinfo();
    }
}