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
public class ArraysFirstOccurrence 
{
    static int firstOccurence(int[] arr,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(n == arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {0,1,2,2,3,5,2,1,4,1};
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(firstOccurence(arr,n));
    }
}
