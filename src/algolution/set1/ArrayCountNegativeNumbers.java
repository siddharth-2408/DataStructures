/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set1;

import java.util.Scanner;

/**
 *
 * @author rajes
 */
public class ArrayCountNegativeNumbers 
{
    public static int countNegativeNumbers(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0) count++;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] arr = {10,-2,-1,0,3,-5};
        System.out.println("Total Count of Negative Numbers are:- "+countNegativeNumbers(arr));
    }
}
