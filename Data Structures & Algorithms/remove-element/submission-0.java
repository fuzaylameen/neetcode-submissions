class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0,k=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==val) k++;
            else{
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
            }
        }
        return nums.length-k;
    }
}