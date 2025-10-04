class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int res=0;
        int j=n-1;
        int area;
        while(i<j){
            area= Math.min(height[i],height[j])*(j-i);
        if(res<area){
            res=area;
        }
        
        if(height[i]>height[j]){
            j--;
        }else{
            i++;
        }
        }
        
    return res;
    }
}
