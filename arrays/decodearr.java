import java.util.Scanner;
public class decodearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the len value");
        int len= sc.nextInt();
        int[] orr= new int[len];
        System.out.println("enter the array values");
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
            
        } for(int i=len-1;i>=0;i--){
            if(i==(len-1)){
                orr[i]=arr[i];
            }else{
                orr[i]=arr[i]-orr[i+1];
            }
        }
        // for(int i=0;i<len;i++){
        //     System.out.print(orr[i]);
            
        // }
        int sum=0;
        for(int i=0;i<=len-1;i++){
            sum=sum+orr[i];
            // System.out.println("sum" +sum);
        }
         System.out.println("sum" +sum);
        System.out.println("starting num of original arr ="+ orr[0]);
        
    
}
}