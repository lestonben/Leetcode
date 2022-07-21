package Sliding_Window;

public class q01_Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int price: prices) {
            lowest = Math.min(lowest, price);
            max = Math.max(max, price-lowest);
        }
        return max;
    }
}
