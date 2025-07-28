import java.util.Scanner;
public class soled_rec {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter length of rectangle");
        int l=sc.nextInt();
        System.out.println("enter breadth of rectangle");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            System.err.print("\n");
            for(int j=1;j<=l;j++){
                System.out.print("  *");

            }

        }
    }
}