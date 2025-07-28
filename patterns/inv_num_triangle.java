import java.util.Scanner;
public class inv_num_triangle {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row value");
        int r=sc.nextInt();
        for(int i=0;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(j);

            }
        System.out.println(" ");
        }
    }
}