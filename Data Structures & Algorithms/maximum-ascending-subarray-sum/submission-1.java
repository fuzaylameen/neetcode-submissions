class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                if(nums[i]<=nums[i-1]) sum=0;
            }
            sum+=nums[i];
            if(sum>max) max=sum;
        }
        return max;
    }
}