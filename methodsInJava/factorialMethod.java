import java.util.Scanner;
public class factorialMethod {
    public static int fact(int n){
        int fact =1;
        for(int i =n;i>=1;i--){
             fact=fact*i;

        
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num ");
        int n = sc.nextInt();
        int fact=fact(n);
        System.out.println("the factorial of the num n is "+fact);
    }

    
}