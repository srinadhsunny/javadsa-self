import java.util.Scanner;
public class minInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minimum=arr[1];
        for(int i =0;i<n;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println("smallest among the array is "+ minimum);
    }

    
}