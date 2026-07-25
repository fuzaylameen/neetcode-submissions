class Solution {
    public String maximumOddBinaryNumber(String s) {

        int wlen=s.length();
        int n=0;

        for(int i=0;i<wlen;i++){
            if(s.charAt(i)=='1'){
                n++;
            }
        }
        
        String t="";
        for(int i=0;i<wlen-1;i++){
            if(n-1>0){
                t+='1';
                n--;
            }
            else{
                t+='0';
            }

        }

        t+='1';
        return t;
    }
}