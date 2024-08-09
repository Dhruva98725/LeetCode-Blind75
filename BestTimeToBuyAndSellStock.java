// Problem: 121. Maximum Product Subarray
// Link: https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
