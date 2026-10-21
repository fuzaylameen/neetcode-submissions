class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int nums: arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        int ans=-1;
        for(int key : map.keySet()){
            if(key == map.get(key)) ans=key>ans?key:ans;
        }
        return ans;
    }
}