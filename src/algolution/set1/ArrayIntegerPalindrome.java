/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set1;

import java.util.Arrays;

/**
 *
 * @author rajes
 */
public class ArrayIntegerPalindrome 
{
    public static void main(String[] args) 
    {
        int arr[] = {44,23,32,44};
        int temp[] = arr.clone();
        ArrayReverse.reverseArray(temp);
        System.out.println(Arrays.equals(arr, temp));
    }
}
