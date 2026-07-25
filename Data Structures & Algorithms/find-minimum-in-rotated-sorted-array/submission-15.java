class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        int mid=0;
        mid=l+(r-l)/2;
        while(r>l){
            
            if(nums[mid]>nums[r]) l=mid+1;
            else if(nums[mid]<nums[r]) {
                if(mid>0){if(nums[mid]<nums[mid-1]) break;}
                r=mid-1;
            }
            mid=l+(r-l)/2;
        }
        return nums[mid];


    }
}
