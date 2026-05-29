// Leetcode - 122 Best Time to Buy and Sell Stock II
// Input: prices = [7,1,5,3,6,4]
// Output: 7

class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1]; 
            }
        }
        return maxProfit;
    }
}