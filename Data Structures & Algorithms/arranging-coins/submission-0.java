class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(true){
            if(n-i<0) break;
            n-=i;
            i++;
        }
        return i-1;
    }
}