class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int buy=0, sell=0;
        int profit=0;
        if(prices.length==0) return 0;
        for(int i=0; i<prices.length; i++){
            if(prices[buy]>prices[i]) buy=i;
            if(prices[sell]<prices[i] || sell<buy) sell=i;
            profit= prices[sell]-prices[buy];
            if(profit>max) max=profit;
         }

        return max;
        
    }
}
