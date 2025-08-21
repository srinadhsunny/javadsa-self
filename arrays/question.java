import java.util.Scanner;
public class question{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int array[]= new int[n];
        System.out.println("enter the array values");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int ress=0;
        int resn=0;
        int resp=0;
        for(int i=0;i<n;i++){
            if (array[i]<0) {
                int num=-(array[i]);
               
                resn=resn+num;
                
            }else{
                resp=resp+array[i];
            }
            
        }
        if(resn>resp){
            System.out.println("resn:"+ resn +"resp"+  resp);
            ress=-(resn-resp);
        }else{
              System.out.println("resn:"+ resn +"resp"+  resp);
            ress=resp-resn;
        }
       System.out.println("result is"+ ress);
    }
}