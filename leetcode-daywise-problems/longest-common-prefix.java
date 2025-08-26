class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        //intial condition
        String prefix =strs[0];
        for(int i=1;i<strs.length;i++)while(
            //finding same letters in other strings if exists it would return the index as 0 for prefix
            strs[i].indexOf(prefix)!=0
        ){
          //updation
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()) return "";

        }
        return prefix;
        
    }
}
