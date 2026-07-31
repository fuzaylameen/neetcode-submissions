class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=text.length();
        for(int i=0;i<n;i++ ){
            char c=text.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        String check="balon";
        int c=10000;
        for(int i=0;i<check.length();i++){
            char t=check.charAt(i);
            int m=map.getOrDefault(t,0);
            if(t=='l' || t=='o') m=m/2;
            if (m<c) c=m;
        }
        return c;

        
    }
}