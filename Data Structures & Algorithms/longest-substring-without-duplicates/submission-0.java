class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int len=s.length();
        if(len==0)return 0;
        int l=0,r=0;int length;
        int max=0;
        for(int i=0;i<len;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            length=r-l+1;
            if (length>max) max=length;
            r++;
        }
        return max;
    }
}
