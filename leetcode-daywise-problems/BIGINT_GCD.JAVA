import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
      


        Scanner sc = new Scanner(System.in);

        BigInteger num1 = new BigInteger(sc.next());
        BigInteger num2 = new BigInteger(sc.next());

        BigInteger gcd = num1.gcd(num2);

        System.out.println(gcd);
        sc.close();

    }
}
