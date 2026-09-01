class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ran=new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();

        if(ransomNote.length()>magazine.length()) return false;
        for(int i=0;i<magazine.length();i++){
            if(i<ransomNote.length()) ran.put(ransomNote.charAt(i),ran.getOrDefault(ransomNote.charAt(i),0)+1);
            mag.put(magazine.charAt(i),mag.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(Character c: ran.keySet()){
            if(ran.get(c)>mag.getOrDefault(c,0)) return false;
        }
        return true;
    }
}