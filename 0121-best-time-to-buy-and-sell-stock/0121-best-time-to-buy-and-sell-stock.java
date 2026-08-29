class Solution {
    public int maxProfit(int[] prices) {
        int Profit = 0;
        int minCost = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minCost){
                minCost = prices[i];
            }
            else if(prices[i] - minCost > Profit)
            {
                Profit = prices[i]-minCost;
            }
        }
        return Profit;
    }
}