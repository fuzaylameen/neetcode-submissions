class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2) return false;
        
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<l1;i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        int l=0;
        for(int i=l1;i<l2;i++){
            if(map1.equals(map2)) return true;
            char left = s2.charAt(l++);
            map2.put(left, map2.get(left) - 1);
            if (map2.get(left) == 0) {
                map2.remove(left);
            }
            char val=s2.charAt(i);
            map2.put(val,map2.getOrDefault(val,0)+1);
        }

        return map1.equals(map2) ;
        
    }
}
