/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set2;

/**
 *
 * @author rajes
 */
public class Stocks 
{
    /*Inefficient
    static int maxProfit(int[] prices)
    {
        int profit=0,currProfit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                currProfit = Math.max(currProfit, prices[j] - prices[i]);
                
            }
            profit = Math.max(profit,currProfit);
        }
        return profit;
    }
    */
    static int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) 
        {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
    public static void main(String[] args) 
    {
        int prices[] = {3, 2, 6, 5, 0, 3};
        System.out.println(maxProfit(prices));
    }
}
