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
//optimized to improve time complexity
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
