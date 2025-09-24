class Solution {
    public int strStr(String haystack, String needle) {
        int res=0;
        if (needle.isEmpty()) return 0;
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                 return i;
            }
        }
        return -1; 
        // return res;
    }
}
