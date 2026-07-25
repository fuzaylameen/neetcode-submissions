class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1;
        int r=piles[piles.length-1];
        int mid=0;
        while(l<r){
            mid=l+(r-l)/2;
            int sum=0;
            for(int i:piles){
                sum+=(i+mid-1)/mid;
            }
            if(sum<=h) r=mid;
            else l=mid+1;
            
        }
        return l;
        
    }
}
