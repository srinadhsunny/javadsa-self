import java.util.Scanner;
public class decreasingSequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input2= sc.nextInt();
        System.out.println("enter the array");
        int[] input1= new int[input2];
        for(int i=0;i<input2;i++){
            input1[i]=sc.nextInt();
        }
        int dslen = 1;
        int dsnum = 0;
        int[] dscount = new int[input2];
        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
            dslen++;
        } else if (input1[i] < input1[i + 1] && dslen > 1) {
            dsnum++;
            dscount[i] = dslen;
            dslen = 1; // reset for next sequence
            }
        }
        int max = 0;

        for (int i = 0; i < input2; i++) {
            if (dscount[i] > max) {
            max = dscount[i];
            }
        }
        System.out.println("max length of decreasing sequences is :"+max);
        System.out.println("number of decreasing sequences in an array : "+dsnum);
    }
}
