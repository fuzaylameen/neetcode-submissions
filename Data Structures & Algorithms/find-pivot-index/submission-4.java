class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, left=0;
        int n=nums.length;
        for(int i: nums){
            sum+=i;
        }

        for(int i=0;i<n;i++){
            int right=sum-nums[i]-left;
            if(right==left) return i;
            left+=nums[i];
        }
        return -1;
    }
}