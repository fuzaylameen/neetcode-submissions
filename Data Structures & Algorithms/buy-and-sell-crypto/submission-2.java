class Solution {
    public int maxProfit(int[] prices) {
        int buy=0,sell=0;
        int max=0;
        int profit;
        for(int i=0;i<prices.length;i++){
            if(prices[buy]>prices[i]) buy=i;
            if(buy>sell || prices[i]>prices[sell]) sell=i;
            profit=prices[sell]-prices[buy];
            if(profit>max) max=profit;
        }
        return max;

    }
}
