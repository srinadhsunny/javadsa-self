import java.util.Scanner;
public class menu_driven {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 or 0");
    int c=sc.nextInt();
    do{
        System.out.println("enter the student marks");
        int m=sc.nextInt();
            if (m>=90) {
                System.out.println("good");
                
            }else if (m>=60) {
                System.out.println("better");
                
            
            
        }
        System.out.println("enter 1 or 0");
        c = sc.nextInt();

    }while(c==1);
    System.out.println("suceesfully excuted");
    }
    
}