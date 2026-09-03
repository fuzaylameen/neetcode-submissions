class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int left[]=new int[n];
        int right[]=new int[n];

        int l=0,r=n-1;
        int le=0,re=0;
        while(l<n){
            if(s.charAt(l)=='0') le++;
            left[l]=le;
            if(s.charAt(r)=='1') re++;
            right[r]=re;
            l++;r--;
        }
        int max=0;
        for(int i=0;i<n-1;i++){
            int curr=left[i]+right[i+1];
            if(curr>max) max=curr;
        }
        return max;
    }
}