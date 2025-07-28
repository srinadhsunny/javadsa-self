import java.util.Scanner;
public class half_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row num");
        int r = sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();

        }
        
}
}