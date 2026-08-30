class Solution { //2,4,1
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l = 0;
        for(int r = 1; r < prices.length;r++){
            if(prices[l] < prices[r]){
                int tmp = prices[r] - prices[l];
                profit = profit < tmp?tmp:profit;
                continue;
            }
            l = r;
        }
        return profit;
    }
}
