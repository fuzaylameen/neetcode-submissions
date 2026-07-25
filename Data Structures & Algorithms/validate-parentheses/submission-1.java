class Solution {
    public boolean isValid(String s) {
        boolean check=true;
        char[] stack= new char[s.length()];
        int len=-1;
        for(char c: s.toCharArray()){
            if(c=='{' || c=='(' || c=='[') stack[++len]=c;
            else if(c=='}' && len>=0 && stack[len]=='{') len--;
            else if(c==')' && len>=0 && stack[len]=='(') len--;
            else if(c==']' && len>=0 && stack[len]=='[') len--;
            else {
                check=false;
                break;
            }
        }
        if(len>=0) check=false;
        return check;
    }
}
