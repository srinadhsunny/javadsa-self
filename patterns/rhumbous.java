import java.util.Scanner;
public class rhumbous {
    public static void main(String[] args) {
        Scanner sc = new Scanner;
        int n =sc.nextInt;
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n;j++){
                System.out.print(" *");

            }
        System.out.println();
        }
        
    }

    
}
