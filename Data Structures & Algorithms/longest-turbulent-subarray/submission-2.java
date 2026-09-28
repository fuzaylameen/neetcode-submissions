class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n=arr.length;
        int l1=0,l2=0,r=0;
        int c1=0,c2=0;
        if(n==1) return 1;
        while(r<n-1){
            if(r%2==0){
                if(arr[r]<arr[r+1]){
                    r++;
                    l2=r;
                    c1=((r-l1+1)>c1)?r-l1+1:c1;
                }
                else if(arr[r]>arr[r+1]){
                    r++;
                    c2=((r-l2+1)>c2)?r-l2+1:c2;
                    l1=r;
                }
                else{
                    r++;
                    l1=r;
                    l2=r;
                    c1=((r-l1+1)>c1)?r-l1+1:c1;
                    c2=((r-l2+1)>c2)?r-l2+1:c2;
                }
            }
            else{
                if(arr[r]>arr[r+1]){
                    r++;
                    l2=r;
                    c1=((r-l1+1)>c1)?r-l1+1:c1;
                }
                else if(arr[r]<arr[r+1]){
                    r++;
                    l1=r;
                    c2=((r-l2+1)>c2)?r-l2+1:c2;
                }
                else{
                    r++;
                    l1=r;
                    l2=r;
                }

            }
        }
        return Math.max(c1,c2);
    }
}