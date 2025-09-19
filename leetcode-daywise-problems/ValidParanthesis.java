class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       boolean res=true;
       for(char c:s.toCharArray()) {
        if(c=='('||c=='['||c=='{'){
            stack.push(c);        

       }else if(c==')'){
        if(stack.isEmpty()||stack.pop()!='('){
            res= false;
        }
        }else if(c==']'){
            if(stack.isEmpty()||stack.pop()!='['){
                res=false;
            }

        }else if(c=='}'){
            if(stack.isEmpty()||stack.pop()!='{'){
                res=false;
            }
        }
        // }else if(stack.isEmpty()!=true){
        //     res=false;

        // }
       
       }
       return res&&stack.isEmpty();
    }
}
