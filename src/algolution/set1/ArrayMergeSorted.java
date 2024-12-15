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
public class ArrayMergeSorted 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {0,5,10,15,20};
        int[] arr2 = {1,6,11,16,21};
        
        int[] arr = new int[arr1.length+arr2.length];
        int j,k,i;
        i=k=j=0;
        
        while(i<arr1.length && j<arr2.length)
        {
           if(arr1[i] < arr2[j])
           {
               arr[k] = arr1[i];
               i++;
               k++;
           }
           else
           {
               arr[k] = arr2[j];
               j++;
               k++;
           }
        }
        while(i<arr1.length)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length)
        {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
