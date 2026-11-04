class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int max=-1;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int count=i-map.get(s.charAt(i))-1;
                max=(count>max)?count:max;
            }
            else map.put(s.charAt(i),i);
        }
        return max;
    }
}