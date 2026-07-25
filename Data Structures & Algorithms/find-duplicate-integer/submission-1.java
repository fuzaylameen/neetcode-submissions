class Solution {
    public int findDuplicate(int[] nums) {
        int n;
        for(int i=0;i<nums.length;i++){
            int val=Math.abs(nums[i])-1;
            if(nums[val]<0) return Math.abs(nums[i]);
            nums[val]=-nums[val];
        }
        return 0;
        
    }
}
