class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map= new HashMap<>();
        String [] arr1=s1.split(" ");
        String [] arr2=s2.split(" ");

        for(String s: arr1) map.put(s,map.getOrDefault(s,0)+1);
        for(String s: arr2) map.put(s,map.getOrDefault(s,0)+1);

        List<String> list= new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()<=1) list.add(entry.getKey());
        }

        int n =list.size();
        String res[]= new String[n]; int i=0;
        for(String s: list) res[i++]=s;
        
        return res;
    }
}
