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
public class ArrayEquilibriumIndex 
{
    static int findTotal(int []a)
    {
        int sum =0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        return sum;
    }
    static int equilibriumIndex(int arr[])
    {
        int leftSum=0;
        int totalSum = findTotal(arr);
        for(int i=0;i<arr.length;i++)
        {
            totalSum -= arr[i];
            if(leftSum==totalSum)
                return i+1;
            leftSum +=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,3,5,2,2};
        System.out.println(equilibriumIndex(arr));
    }
}
