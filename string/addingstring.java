import java.util.Scanner;
public class addingstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter input 1");
        String input1=sc.nextLine();
        
        System.out.println("enter input 2");
        String input2=sc.nextLine();
        
        int input11=Integer.parseInt(input1);
        int input22=Integer.parseInt(input2);
       
        int sum=input11+input22;
        //converting into string
        String output= Integer.toString(sum);
        System.out.println(output);
        


    }
}