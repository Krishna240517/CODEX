
/*
 * The Stock Buy and Sell problem involves finding the best way to earn maximum profit by buying and selling a stock based on its prices over several days.

-->In the single transaction variant, you're allowed to buy once and sell once, aiming to maximize profit within that one trade.

-->In the multiple transactions version, you can buy and sell multiple times (but must sell before buying again), allowing for profit accumulation from several trades.
 */

public class Q2025_06_29_easy2 {
    public static void main(String[] args){
        
    }
    //stock buy and sell max 1 transaction allowed
    public static int maximumProfit(int[] arr){
        int minSoFar = arr[0];
        int maxProfit = 0;
        for(int i = 1;i<arr.length;i++){
            maxProfit = Math.max(maxProfit,arr[i] - minSoFar);
            minSoFar = Math.min(minSoFar,arr[i]);
        }
        return maxProfit;
    }



    //stock buy and sell multiple transactions allowed
    public static int returnMaxProfit(int[] arr){
        int profit = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1] < arr[i]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
}
