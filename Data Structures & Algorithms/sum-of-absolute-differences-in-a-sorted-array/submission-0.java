class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int j=n-1;

        int pre[]=new int[n];
        int suf[]=new int[n];
        int res[]=new int[n];
        
        int ps=0,ss=0;
        for(int i=0; i<n; i++){
            ps+=nums[i];
            pre[i]=ps;
            
            ss+=nums[j];
            suf[j]=ss;
            j--;
        }
        
        for(int i=0;i<n;i++){
            int l=(i==0)?0:pre[i-1];
            int r=(i==n-1)?0:suf[i+1];
            // res[i]=((i-0)*nums[i]) -l + r - ((n-i-1) *nums[i]);
            res[i]=r-l +nums[i]*((2*i)-n+1);  
        }
        return res;
    }
}
