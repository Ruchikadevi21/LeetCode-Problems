class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int sellprice;
        int buyprice = Integer.MAX_VALUE;
        int difference = -1;
        for(int i=0; i<prices.length; i++){
            sellprice = prices[i];
            buyprice = Math.min(buyprice, prices[i]);
            if(buyprice<sellprice){
                difference = sellprice - buyprice;
                profit = Math.max(profit, difference);
            }
        }
        return profit;
    }
}