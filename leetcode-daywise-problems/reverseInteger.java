class Solution {
    public int reverse(int x) {
        int rem=0;
        int res=0;
        int ress=0;

        int product=100;
        if(x>=0){
            while(x>0){
            rem=x%10;
            x=x/10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && rem > 7)) {
                    res= 0;
                    break;
                }
            res=res*10+rem;
            // product/=10;
        }
        ress=res;
        }else{
            x=-x;
            while(x>0){
            rem=x%10;
            x=x/10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && rem > 7)) {
                    res= 0;
                    break;
                }

            res=res*10+rem;
            // product/=10;
            

        }
        ress=-res;
        }
        return ress;
        
    }
}
