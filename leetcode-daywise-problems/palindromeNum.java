class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int right=s.length()-1;
        boolean res= true;
        for(int left=0;left<right;left++){
            if(s.charAt(left)!=s.charAt(right)){
                res=false;
            }
            right--;
        }
        return res;
    }
}
