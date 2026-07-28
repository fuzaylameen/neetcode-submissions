class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean c =false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c=true;
                break;
            }
        }
        return c;
    }
}