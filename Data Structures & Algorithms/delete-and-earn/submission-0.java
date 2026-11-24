class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int curr=0;
        int prev1=0;
        int prev2=0;
        prev1=nums[0]*map.get(nums[0]);

        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]) continue;
            curr=nums[i]*map.get(nums[i]);
            if(nums[i-1]+1!=nums[i]) curr+=prev1;
            else if(curr+prev2>prev1) curr+=prev2;
            else curr=prev1;

            prev2=prev1;
            prev1=curr;
        }
        return prev1;  
    }
}