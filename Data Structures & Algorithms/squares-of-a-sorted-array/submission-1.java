class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []res= new int[n];
        int l=0,r=n-1;
        for(int i=n-1; i>=0; i--){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(right>left){
                res[i]=right;
                r--;
            }
            else{
                res[i]=left;
                l++;
            }
        }
        return res;   
    }
}