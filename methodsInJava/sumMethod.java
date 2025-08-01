import java.util.Scanner;
public class sumMethod {
    public static int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 nums");
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sum(num1,num2);
        System.out.println("sum of 2 nums is "+ sum);
       
    
        
    }

    
}