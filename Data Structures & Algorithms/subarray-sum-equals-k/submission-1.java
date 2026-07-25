class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        for(int i=0;i<n;i++){
            int sum=0;
            sum=nums[i];
            if(sum==k) l++;
            for(int j=i+1;j<n;j++){
                sum+=nums[j];
                if(sum==k) l++;
            }
        }

        return l;
        
    }
}