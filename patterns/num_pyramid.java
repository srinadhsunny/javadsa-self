import java.util.Scanner;
public class num_pyramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the r value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
        System.out.println();
        }
        
    }

    
}