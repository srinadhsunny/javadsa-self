import java.util.Scanner;
public class palindromic_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  n value");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }

    
}