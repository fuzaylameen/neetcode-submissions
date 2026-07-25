class Solution {
    public int search(int[] nums, int target) {
        //if(nums.length==0) return -1;
        int left=0,right=nums.length-1;
        while(right>=left){
            int i=left+(right-left)/2;
            if(nums[i]==target)return i;
            else if(target>nums[i]) left=i+1;
            else right=i-1;

        }
        return -1;
        
    }
}
