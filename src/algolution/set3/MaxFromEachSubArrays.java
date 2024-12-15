/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set3;

import algolution.set1.ArrayMaximumElement;

/**
 *
 * @author rajes
 */
public class MaxFromEachSubArrays 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,1,4,5};
        int k=3;
        for (int i = 0; i <= arr.length-k; i++) 
        {
            System.out.print(ArrayMaximumElement.maxElement(arr,i,i+k)+" ");
        }
    }
}
