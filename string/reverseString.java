public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        int left=0;
        int right=sb.length()-1;
        while (left<right) {
            char frontChar=sb.charAt(left);
            char backChar=sb.charAt(right);
            sb.setCharAt(right,frontChar);
            sb.setCharAt(left,backChar);
            left++;
            right--;
            
        }
        System.out.println(sb);


    }

    
}