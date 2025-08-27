class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int res=Math.min(height[j],height[i])*(j-i);
            if(max<res){
                max=res;
            }
            }
    }return max;
}
}
