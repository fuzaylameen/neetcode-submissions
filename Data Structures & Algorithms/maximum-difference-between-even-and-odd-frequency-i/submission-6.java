class Solution {
    public int maxDifference(String s) {
        int odd=0,eve=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Integer values:map.values()){
            if(eve==0 && values%2==0)eve=values;
            if(values<eve && values%2==0) eve=values;
            else if(values>odd && values%2!=0) odd=values;
        }
        return odd-eve;
    }
}