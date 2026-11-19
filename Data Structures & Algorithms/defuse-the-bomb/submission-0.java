class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int arr[]=new int [n];
        if(k==0) return arr;

        int l=(k + n) % n;
        int r=(k + n) % n;
        
        if(k>0){
            l=1;r=1;
        }

        int c=Math.abs(k);
        int sum=0; 
        for(int i=0;i<n; i++){
            while(c>0){
                sum+=code[r];
                r=(r+1)%n; c--;
            }
            arr[i]=sum;
            sum-=code[l];
            l=(l+1)%n;
            sum+=code[r];
            r=(r+1)%n;
        
        }
        return arr;
    }
}