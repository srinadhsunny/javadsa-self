import java.util.Scanner;
public class diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n  =sc.nextInt();
        //upper part
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" *");
            }
        System.out.println();

        }
        ///lower part
        for(int i=n;i>=1;i--){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=1 ;j<=2*i-1;j++){
                System.out.print(" *");
            }
        System.out.println();
        }
        
    }

    
}