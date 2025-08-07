import java.util.Scanner;
public class compareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input fyst string
        System.out.println("enter the fyst string");
        String s1= sc.nextLine();
        //input secound string
        System.out.println("enter the secound string");
        String s2=sc.nextLine();
        //compare the String s1.compareTo(s2)returns
        //->+ve if s1>s2
        //->0 if s11=s2
        //-> -ve if s1<s2
        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        
    }
    

    

}
