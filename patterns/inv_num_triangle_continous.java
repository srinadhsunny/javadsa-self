import java.util.Scanner;
public class inv_num_triangle_continous {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row value");
        int r=sc.nextInt();
        int d=1;;
        for(int i=0;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(d+ "     ");
                d++;

            }
        System.out.println(" ");
        }
    }
}