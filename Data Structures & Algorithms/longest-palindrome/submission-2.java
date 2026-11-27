class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int total=0;
        int odd=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int num=entry.getValue();
            if(num%2==0) total+=num;
            else {
                total+=num-1;
                odd++;
            }
        }
        return (odd>0)? total+1:total;
    }
}