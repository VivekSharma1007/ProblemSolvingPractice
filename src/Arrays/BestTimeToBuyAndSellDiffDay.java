package Arrays;

public class BestTimeToBuyAndSellDiffDay {

//  we need to calculate the max value of profit = Selling Price - Buying Price
//  profit will be max when Buy price is less and sell price is more
    public static int buyAndSell(int price[]) {

        int maxProfit = 0;

//      this will keep the track of min value of buy price till the current index(not included)
        int minBuyPrice = price[0];

        for(int i = 1; i < price.length; i++) {
            if(price[i] < minBuyPrice) {
                minBuyPrice = price[i];
            }
            else {
//          Profit = Sell price(means its current index because we can only buy or sell on a single day) - buy price
                int profit = price[i] - minBuyPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSell(price));
    }
}
