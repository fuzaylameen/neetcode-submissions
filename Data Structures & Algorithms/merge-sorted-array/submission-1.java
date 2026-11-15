class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0,r=0,i=0;
        int []res = new int[m+n];

        while(l<m && r<n){
            if(nums1[l]<nums2[r]) res[i++]=nums1[l++];
            else                  res[i++]=nums2[r++];
        }
        while(l<m) res[i++]=nums1[l++];
        while(r<n) res[i++]=nums2[r++];

        i=0;
        for( int x: res){
            nums1[i++]=x;
        }
        
    }
}