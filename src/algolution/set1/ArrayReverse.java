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
public class ArrayReverse 
{
    public static void reverseArray(int[] arr)
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j]; 
            i++;
            j--;
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {10,-2,-1,0,3,-5};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
