/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set1;

/**
 *
 * @author rajes
 */
public class ArrayMaximumElement 
{
    public static int maxElement(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int[] arr = {10,-2,-1,0,3,-5};
        System.out.println("Total Count of Negative Numbers are:- "+maxElement(arr));
    }
}
