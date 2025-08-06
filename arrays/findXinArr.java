import java.util.Scanner;
public class findXinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the rows num ");
        int rows=sc.nextInt();
        
        System.out.println("enter the coloumns value");
        int cols=sc.nextInt();
        
        int arr[][]=new int[rows][cols];
        System.out.println("enter the elements");
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elemnet to search");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x==arr[i][j]){
                    System.out.println(x + " is found at"+i+"X"+j);
                }
            }
        }
    }

    
}