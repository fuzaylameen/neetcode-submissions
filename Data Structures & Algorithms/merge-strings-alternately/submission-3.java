class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int n=l1>l2?l1:l2;
        String res="";int j=0;int k=0;
        for(int i=0;i<n;i++){
            if(j<l1){
                res+=word1.charAt(j);
                j++;
            }
            if(k<l2){
                res+=word2.charAt(k);
                k++;
            }


        }
        return res;    
    }
}