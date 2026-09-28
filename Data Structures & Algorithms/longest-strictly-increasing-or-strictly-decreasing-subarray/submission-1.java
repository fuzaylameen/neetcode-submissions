class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c1=1,c2=1;
        int max=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                c1++;
                c2=1;    
            }
            else if(nums[i]<nums[i-1]){
                c1=1;
                c2++;    
            }
            else{
                c1=1;
                c2=1;
            }
            max=c1>max?c1:max;
            max=c2>max?c2:max;
        }
        return max;
    }
}