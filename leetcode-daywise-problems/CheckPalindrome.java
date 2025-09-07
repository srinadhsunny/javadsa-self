class Solution {
    public boolean isPalindrome(String s) {
        String ss="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String sl="abcdefghijklmnopqrstuvwxyz";
        String su="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int left=0;
        boolean res=true;
        int right=s.length()-1;
        while (left<right){
            if(ss.indexOf(s.charAt(left))==-1){
                left++;
                continue;
            }else if(ss.indexOf(s.charAt(right))==-1){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                res= false;
                break;
            }
            left++;
            right--;
            

        }
    return res; 
    }
}
