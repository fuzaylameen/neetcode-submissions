class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length;
        while(l<=r){
            int mid=(l+r)/2;
            int prev=(mid==0)?Integer.MIN_VALUE:nums[mid-1];
            int next=(mid==nums.length-1)?Integer.MIN_VALUE:nums[mid+1];
            if(nums[mid]>prev && nums[mid]>next) return mid;
            else if(nums[mid]>prev) l=mid+1;
            else r=mid-1;
        }
        return 0;
    }
}