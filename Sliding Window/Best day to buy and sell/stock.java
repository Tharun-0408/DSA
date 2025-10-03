class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int max = 0;
        while(r < prices.length){ //condition to check if the day of selling is still  within range of array
            if(prices[l] < prices[r]){ //condition to check that buying price is less than selling price(to make profit)
                int profit = prices[r] - prices[l]; //check profit
                max = Math.max(max, profit); //check for maximum profit
            }
            else{
                l = r; //if the buying price is not less than selling price, then move left to right position(increase by 1)
            }
            r++; //move the right position by 1
        }
        return max;
    }
}

