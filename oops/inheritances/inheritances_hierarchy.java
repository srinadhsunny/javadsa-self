//inheritances single level
class shape{
    String color;

}
class triangle extends shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
class rectangle extends shape{
    public void area(int l, int b){
        System.out.println(l*b);
    }
}
public class inheritances_hierarchy {

    public static void main(String[] args) {
        triangle T1 = new triangle();
        T1.color="red";
        T1.area(5, 6);
        rectangle r1=new rectangle();
        r1.color="white";
        r1.area(4, 6);
    }
}