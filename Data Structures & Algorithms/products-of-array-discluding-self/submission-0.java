class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prefix=new int[n];
        int[] suffix =new int[n];
        int[]res=new int[n];
        
        int p=0,s=n-1;
        int ps=1,ss=1;
        while(p<n){
            ps*=nums[p];
            prefix[p]=ps;
            p++;

            ss*=nums[s];
            suffix[s]=ss;
            s--;
        }

        for(int i=0;i<n;i++){
            int j=(i==0)?1:prefix[i-1];
            int k=(i==n-1)?1:suffix[i+1];
            res[i]=j*k;
        }
        return res;

        
    }
}  
