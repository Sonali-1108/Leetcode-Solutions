class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < first) {
                second = first;
                first = prices[i];
            } 
            else if (prices[i] < second) {
                second = prices[i];
            }
        }

        int remaining = money - (first + second);

        if (remaining < 0) {
            return money;
        } else {
            return remaining;
        }
    }
}