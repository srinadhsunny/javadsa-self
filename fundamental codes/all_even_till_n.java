import java.util.Scanner;
public class all_even_till_n {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num n ");
        int n =sc.nextInt();
        System.out.println("all the even numbers are");
        for(int i=0;i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
                
            }
        }
    }
}