import java.util.Scanner;
public class n_num_sum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int sum=0;
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            sum=sum+i;

        }
        System.out.println("sum of n natural numbers is "+ sum);
    }
    
}
