/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set3;

/**
 *
 * @author rajes
 */
public class CoinsCombinations 
{
    static int countCombination(int[] arr,int sum)
    {
        int[] dp = new int[sum+1];
        //Base Case 
        dp[0] = 1;// 0 sum achieve karne ka ek tarika hai ki kuch bhi select mat karo;
        for(int coins:arr)
        {
            for(int j=coins;j<=sum;j++)
            {
                dp[j] += dp[j-coins];
            }
        }
        return dp[sum];
    }
    /*
    Process Coin = 1:
    Update dp for all sums j = 1 to 4:
        dp[1] += dp[1 - 1] → dp[1] = 1
        dp[2] += dp[2 - 1] → dp[2] = 1
        dp[3] += dp[3 - 1] → dp[3] = 1
        dp[4] += dp[4 - 1] → dp[4] = 1
        DP Array after Coin = 1:
        dp = [1, 1, 1, 1, 1]
    Process Coin = 2:
    Update dp for all sums j = 2 to 4:
        dp[2] += dp[2 - 2] → dp[2] = 2
        dp[3] += dp[3 - 2] → dp[3] = 2
        dp[4] += dp[4 - 2] → dp[4] = 3
        DP Array after Coin = 2:
        dp = [1, 1, 2, 2, 3]
    Process Coin = 3:
    Update dp for all sums j = 3 to 4:
        dp[3] += dp[3 - 3] → dp[3] = 3
        dp[4] += dp[4 - 3] → dp[4] = 4
        DP Array after Coin = 3:
        dp = [1, 1, 2, 3, 4]
    */
    public static void main(String[] args) 
    {
        int arr[] = {};
        int sum = 4;
        System.out.println(countCombination(arr,sum));
    }
}
