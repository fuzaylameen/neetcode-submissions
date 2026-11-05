class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> list: paths){
            map.put(list.get(0),list.get(1));
        }
        String dest="";
        for(List<String> list: paths){
            if(!map.containsKey(list.get(1))) dest=list.get(1);
        }
        return dest;
    }
}
