//inheritances single level
class shape{
    String color;

}
class triangle extends shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
public class inheritanceslvl1 {

    public static void main(String[] args) {
        triangle T1 = new triangle();
        T1.color="red";
        T1.area(5, 6);
    }
}