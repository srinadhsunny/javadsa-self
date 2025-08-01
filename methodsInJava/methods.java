//in java memory alocations take place in stack format . main method is placed at first and the new methods will added respectively up on there creation and vanish with return ; by returining its output.
import java.util.Scanner;
public class methods {
    public static void printMyName(String name){
        System.out.println("my name is "+ name);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String s = sc.nextLine();
        printMyName(s);

    }

    
}
