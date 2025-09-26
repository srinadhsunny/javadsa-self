class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; // base cases
        int res = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (i <= x / i) {  // avoid overflow instead of i*i
                res = i;
            } else {
                break;
            }
        }
        return res;
    }
}
