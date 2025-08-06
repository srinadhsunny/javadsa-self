import java.util.Scanner;
public class stringproblem {
    public static void main(String[] args) {
        String values ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        String input1= sc.nextLine();
        input1=input1.toUpperCase();
        String[] s =input1.split(" ");
        int sum=0;
        int res=0;
        for (String word : s){
            int length =word.length();
            if(length%2==0){
                int left=0;
                int right=length-1;
                //System.out.println(word);
                while (left<right) {
                    res=values.indexOf(word.charAt(left))-values.indexOf(word.charAt(right));
                   // System.out.println(word.charAt(left) + word.charAt(right));
                    sum=sum+res;
                    left=left+1;
                    right=right-1;
                }
                //System.out.println(sum);
            }
            else if (length%2!=0) {
                int add=values.indexOf(word.charAt(word.length()/2))+1;
                int left=0;
                int right=length-1;
                //System.out.println(word);
                while (left<right) {
                    res=values.indexOf(word.charAt(left))-values.indexOf(word.charAt(right));
                   // System.out.println(word.charAt(left) + word.charAt(right));
                    sum=sum+res;
                    left=left+1;
                    right=right-1; 
                }
                sum=sum+add;
                //System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}

