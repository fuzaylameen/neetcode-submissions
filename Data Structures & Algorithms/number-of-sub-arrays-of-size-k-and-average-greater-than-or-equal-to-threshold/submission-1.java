class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,r=0;
        int count =0;
        int sum=0;

        while(r<arr.length){
            if(r<k-1) {
                sum+=arr[r];
                r++;
            }
            else{
                sum+=arr[r];
                if(sum/k>=threshold) count++;
                sum-=arr[l];
                l++; r++;
            }
        }
        return count;
    }
}