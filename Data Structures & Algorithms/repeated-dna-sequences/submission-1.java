class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> list=new ArrayList<>();
        if(s.length()<10) return list;
        HashMap<String,Integer> map= new HashMap<>();
        StringBuilder str =new StringBuilder(s.substring(0,10));
        map.put(str.toString(),1);
        for(int i=10; i<s.length(); i++){
            str.deleteCharAt(0);
            str.append(s.charAt(i));
            String curr= str.toString();
            if(map.getOrDefault(curr,0)==1) list.add(curr);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return list;
    }
}
