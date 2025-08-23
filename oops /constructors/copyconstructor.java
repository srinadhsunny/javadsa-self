//copy constructor
class student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(name);
        System.out.println(age);
        //constructor is called when  new is used to create instances(particular object storage) //same as class withput return type
    }
    //creatign a copy constructor which copy from student s
        student( student s){
            System.out.println("constructor called");
            this.name=s.name;
            this.age=s.age;
        }
       student(){}
}
public class copyconstructor {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name="sunny";
        s1.age=20;
        // s1.printinfo();
        student s2= new student(s1);
        //using copy constructot s1 is copied to s2
        s2.printinfo();

    }
}