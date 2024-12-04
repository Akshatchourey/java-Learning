public class BestTimetoBuyandSellStock{
    static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0, profit;
        for(int i=0;i<prices.length;i++){
            profit = prices[i] - minPrice;
            if(profit > maxProfit) maxProfit = profit;
            if(prices[i] < minPrice) minPrice = prices[i];
        }
        return maxProfit;
    }
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
