class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maptar= new HashMap<> ();
        HashMap<Integer,Integer> mapind= new HashMap<> ();

        int len=nums.length;
        for(int i=0; i<len; i++){
            maptar.put(nums[i],(target-nums[i]));
            mapind.put(nums[i],i);
        }

        int[] res=new int[2];
        for(int i=0;i<len;i++){
            int value=maptar.get(nums[i]);
            if(maptar.containsKey(value)) {
                if(i==mapind.get(value)) continue;
                res[0]=i;
                res[1]=mapind.get(value);
                break;
            }
        }
        return res;


    }
}
