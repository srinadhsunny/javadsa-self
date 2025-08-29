class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //set can be used such that it automaticaly removes duplicates
        Set<List<Integer>> ans= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length&&j!=i;j++){
                for(int k=j+1;k<nums.length&&k!=i&&k!=j;k++){
                    if(nums[i]==-(nums[j]+nums[k])){
                         List<Integer> res= new ArrayList<>();
                         res.add(nums[i]);
                         res.add(nums[j]);
                         res.add(nums[k]);
                         Collections.sort(res);
                         ans.add(res);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
// code is optimized to reduce compleccity and saving time
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort array
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need bigger sum
                } else {
                    right--; // need smaller sum
                }
            }
        }

        return ans;
    }
}

