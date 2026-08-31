class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ex=map.getOrDefault(nums[i],0);
            count+=ex;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}