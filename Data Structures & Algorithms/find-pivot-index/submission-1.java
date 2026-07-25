class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        int j=n-1;int p=0,s=0;
        for(int i=0;i<n;i++){
            p+=nums[i];
            s+=nums[j];
            prefix[i]=p;
            suffix[j]=s; j--;
        }

        for(int i=0;i<n;i++){
            int left=(i==0)?0:prefix[i-1];
            int right=(i==n-1)?0:suffix[i+1];
            if(left==right) return i;
        }
        return -1;
    }
}