class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            int j=i+1;
            String w1=words[i];
            while(j<words.length){
                String w2=words[j];
                if(w1.length()>w2.length()){
                     j++;
                     continue;
                }
                if(w2.startsWith(w1) && w2.endsWith(w1)) count++;
                j++;
            }
        }
        return count;
        
    }
}