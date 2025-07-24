import java.util.Scanner;
public class monthname {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num of the month ");
        int mn=sc.nextInt();
        switch (mn) {
            case 1:
                System.out.print("january");
                break;
            case 2:
                System.out.print("february");
                break;
            case 3:
                System.out.print("march");
                break;
            case 4:
                System.out.print("april");
                break;
            case 5:
                System.out.print("may");
                break;
            case 6:
                System.out.print("june");
                break;
            case 7:
                System.out.print("july");
                break;
            case 8:
                System.out.print("august");
                break;
            case 9:
                System.out.print("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
        

        
            default:
                break;
        }
    }
    
}
