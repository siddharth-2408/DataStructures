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
public class ArraysLargestSubarraySum 
{
    //Kadane's Algo
    static int largestSubarraySum(int[] arr)
    {
        if(arr.length==0) return 0;
        if(arr.length==1) return arr[0];
        int maxSum=0,sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) 
    {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(largestSubarraySum(arr));
    }
}
