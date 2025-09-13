class Solution {
    public int divide(int dividend, int divisor) {
        int res=0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            res= Integer.MAX_VALUE;
        }else{
        res= dividend/divisor;
        }
        return res;
    }
}
