class Solution {
    public int myAtoi(String s) {
        int l=s.length();
        long p=1;
        int count=0;
        long res=0;
        boolean started=false;
        String nums="0123456789";
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='-'){
                p=-1;
            
                // count++;
                if(count<1){
                    continue;
                }
            }
            if(s.charAt(i)==' '&&count<1){
                continue;
            }
             if(s.charAt(i)=='+'){
                p=1;
                
                // count++;
                if(count<1){
                    continue;
                }
            }
            
            else if(nums.indexOf(s.charAt(i))==-1){
                break;
            }else{
                res=res*10+(s.charAt(i) - '0');
                if (p==1&&res > Integer.MAX_VALUE)
                { res= Integer.MAX_VALUE;
                break;}
            else if (p==-1&&-res < Integer.MIN_VALUE) 
            {res= Integer.MIN_VALUE;
            break;
            }
                count++;
            }
        }
        return (int)(p*res);
    }
}
