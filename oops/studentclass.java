class student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class studentclass {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name="sunny";
        s1.age=20;
        s1.printinfo();
    }
}