class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int l=-1,r=-1,count=0;
        for(int i=0;i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count==1) l=i;
                else if(count==2) r=i;
                else return false;
            }
            
        }
        if(count==0) return true;
        if(count==1) return false;
        return s1.charAt(l) == s2.charAt(r) && s1.charAt(r) == s2.charAt(l);
        
        
    }
}
