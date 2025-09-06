import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];

        // Copy first m elements from nums1
        for (int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }

        // Copy n elements from nums2
        for (int j = 0; j < n; j++) {
            res[m + j] = nums2[j];
        }

        // Sort combined array
        Arrays.sort(res);

        // Copy result back into nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = res[k];
        }
    }
}
