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
