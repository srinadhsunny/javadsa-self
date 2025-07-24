import java.util.Scanner;
public class circle {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        float r = sc.nextFloat();
        float area =(22/7)*r*r;
        System.out.println("area of the circle is "+ area);
        
    }
}