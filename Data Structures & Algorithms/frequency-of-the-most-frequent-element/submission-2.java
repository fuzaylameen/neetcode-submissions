class Solution {
    public int maxFrequency(int[] nums, int k) {
        int diff=0,freq=0;
        int n=nums.length;
        Arrays.sort(nums);
        if(n==1)return 1;
        int l=0,r=1;
        while(r<n){
            diff+=(nums[r]-nums[r-1])*(r-l);
            while(diff>k){
                diff-=nums[r]-nums[l];
                l++;
            }
            freq=(r-l+1)>freq?(r-l+1):freq;
            r++;
        }
        return freq;
    }
}