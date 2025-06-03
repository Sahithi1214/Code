class Solution {
    int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(minSoFar > prices[i]){
                minSoFar = prices[i];
            }else{
                maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
            }
        }
        return maxProfit;
    }
}