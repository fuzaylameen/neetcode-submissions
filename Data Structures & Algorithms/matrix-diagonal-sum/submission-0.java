class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int l=0,r=n-1;
        int sum=0;
        for(int i=0;i<n;i++){
            if(l==r) sum+=mat[i][l];
            else{
                sum+=mat[i][r];
                sum+=mat[i][l];
            }
            l++;
            r--;
        }
        return sum;
        
    }
}