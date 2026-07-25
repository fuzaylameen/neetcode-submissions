class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int l=t.length();
        int j=0; if(l==0) return false;
        for(int i=0;i<n;i++){
            if(j>l-1) return false;
            while(s.charAt(i) != t.charAt(j)) {
                j++;
                if(j>l-1) return false;
            }
            j++;
        }
        return true;
        
    }
}