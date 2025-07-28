import java.util.Scanner;
public class half_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row num");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j<n;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        
}
}