class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        StringBuilder sb = new StringBuilder();
        int maxLen = 0;

        for (int cur = 0; cur < n; cur++) {
            char c = s.charAt(cur);

            int idx = sb.indexOf(String.valueOf(c));
            if (idx != -1) {
                
                sb.delete(0, idx + 1);
            }

            sb.append(c);  
            maxLen = Math.max(maxLen, sb.length());
        }

        return maxLen;
    }
}
