// -->complexity -o(n)^2
class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]-prices[i]>res){
                    res=prices[j]-prices[i];
                }
            }
        }
       return res; 
    }
}
----------------------------------------------------
// -->optimzed solution
  class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(min>price){
                min=price;
            }else if(price- min>maxprofit){
                maxprofit=price-min;
            }
        }
     return maxprofit;   
    }
}
