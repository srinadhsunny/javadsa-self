import java.util.Scanner;
public class table {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num for required  multiplication table");
        int num=sc.nextInt();
        int i=0;
        System.out.println("the required multiplication table for the given num"  +  num + "is");
        while (i<=10) {
            System.out.println( num +"*" +i +"="+ num*i);
            i++;
            
        }

    }
}