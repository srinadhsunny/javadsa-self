import java.util.Scanner;
public class num_triangle_even_odd {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row value");
        int r=sc.nextInt();
        for(int i=0;i<=r;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
               
            }
        System.out.println(" ");
        }
    }
}