class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         List<Integer> list = new ArrayList<>();
         double res=0;
         for(int value:nums1)list.add(value);
         for(int value:nums2)list.add(value);
         Collections.sort(list);
         int n=list.size();
         if(n%2!=0){
            res=list.get(n/2);
         }else{
            res=((list.get(n/2)+list.get(n/2-1))/2.0);
         }
         return res;
    }
}
