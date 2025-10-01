class Solution {
    public int myAtoi(String s) {
        int l=s.length();
        long p=1;
        int count=0;
        long res=0;
        boolean started=false;
        String nums="0123456789";
        for(int i=0;i<l;i++){
            if (s.charAt(i) == ' ' && !started) {   // skip spaces only before parsing
    continue;
}

if (s.charAt(i) == '-' && !started) {   // allow '-' only once before digits
    p = -1;
    started = true;
    continue;
}

if (s.charAt(i) == '+' && !started) {   // allow '+' only once before digits
    p = 1;
    started = true;
    continue;
}

            
            else if(nums.indexOf(s.charAt(i))==-1){
                break;
            }else{
                started=true;
                res=res*10+(s.charAt(i) - '0');
                if (p==1&&res > Integer.MAX_VALUE)
                { res= Integer.MAX_VALUE;
                break;}
            else if (p==-1&&-res < Integer.MIN_VALUE) 
            {res= Integer.MIN_VALUE;
            started=true;
            break;
            }
                count++;
            }
        }
        return (int)(p*res);
    }
}
