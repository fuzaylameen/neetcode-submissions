class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String>set=new HashSet<>();
        int n=pattern.length();
        String str[]= s.split(" ");
        if(n!=str.length) return false;
        if(n==1) return true;
        map.put(pattern.charAt(0),str[0]);
        set.add(str[0]);
        
        for(int i=1;i<n;i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(str[i])) return false;
            }
            else if(set.contains(str[i])) return false;
            else {
                map.put(c,str[i]);
                set.add(str[i]);
            }
        }
        return true;

    }
}