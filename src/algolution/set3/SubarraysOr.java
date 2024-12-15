/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set3;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rajes
 */
public class SubarraysOr 
{
    static int orArrays(int[] arr)
    {
        int result = 0;
        for (int i=0;i<arr.length;i++) 
        {
            int subarrayOr = 0;
            for (int j=i;j<arr.length;j++) 
            {
                subarrayOr |= arr[j];
                result |= subarrayOr;
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1,4,6};
        System.out.println(orArrays(arr));
    }
}
