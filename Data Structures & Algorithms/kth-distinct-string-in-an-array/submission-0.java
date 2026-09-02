class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        String res="";
        for(String s: arr){
            if(map.get(s)==1){
                if(k==1){
                    return s;
                }
                k--;
            }
        }
        return res;
    }
}