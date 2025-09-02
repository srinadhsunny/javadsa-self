// using to pointer method
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        Arrays.sort(nums,0,k);
        return k;
        
    }
}
// optimized with swapping method
    class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
            }else{
                i++;
            }
        }
        return n;
        
    }
}
