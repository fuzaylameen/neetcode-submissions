class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<2) return true;
        boolean up=(nums[1]<nums[0]) ? true : false;
        for(int i=2; i<nums.length; i++){
            if(nums[i]==nums[i-1]) continue;
            boolean now=(nums[i]<nums[i-1]) ? true : false;
            if(up!=now) return false;
        }
        return true;
        
    }
}