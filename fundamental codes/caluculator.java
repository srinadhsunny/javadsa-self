import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class caluculator {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    System.out.println("enter n1");
    int a = sc.nextInt();
    System.out.println("enter num2");
    int b =sc.nextInt();
    System.out.println("enter the operation required");
    String operator=sc.next();
    switch(operator){
        case "+":
          System.out.println("addition of a and b is "+(a+b));
          break;
        case "-":
          System.out.println("subtraction of a and b is" +(a-b));
          break;
        case "*":
          System.out.println("multiplication of a and b is "+a*b);
          break;
        case "/":
          System.out.println("division of a  and b is "+a/b);
          break;
        case "%":
          System.out.println("modulus of a and b is "+a%b);
          break;
        default:
          System.out.println("enter valid operator");
          break;



    }
 



    }
}
      
    
