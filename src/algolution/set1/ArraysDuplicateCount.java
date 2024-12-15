/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set1;

import java.util.HashMap;

/**
 *
 * @author rajes
 */
public class ArraysDuplicateCount 
{
    public static void main(String[] args) 
    {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayElementsFrequency.frequency(map, arr);
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet())
        {
            if((int)entry.getValue()>0)
                count++;
        }
        System.out.println(count);
    }
}
