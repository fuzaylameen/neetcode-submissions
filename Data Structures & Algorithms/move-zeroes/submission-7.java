class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0,r=0;

        while(r<n){
            if(nums[r]==0) r++;
            else if(nums[l]!=0){
                l++; r++;
            }
            else{
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                r++;l++;
            }
        }
        
    }
}