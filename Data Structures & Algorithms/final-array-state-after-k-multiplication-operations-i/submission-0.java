class Solution {
    public int findMin(int [] nums){
        int n= nums.length;
        int min=nums[0],index=0;
        for(int i=1;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
        }
        return index;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k ;i++){
            int index=findMin(nums);
            nums[index]=nums[index]*multiplier;
        }
        return nums;
    }
}