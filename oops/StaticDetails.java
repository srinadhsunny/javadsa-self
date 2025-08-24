class student{
    static String school;
    String name;
}
public class StaticDetails {

    public static void main(String[] args) {
        student.school="mths";//changes the school name for all the students at onces directly
        student s1= new student();
        s1.name="sunny";
        System.out.println(s1.name+" "+s1.school);
    }
}
