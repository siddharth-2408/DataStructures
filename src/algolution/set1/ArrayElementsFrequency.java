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
public class ArrayElementsFrequency 
{
    static void frequency(HashMap map,int[] arr)
    {
        for(int a:arr)
        {
            if(map.containsKey(a))
            {
                map.put(a, (int)map.get(a)+1);
            }
            else
                map.put(a,0);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,1,2,1,5,1,2,0,2,1,3,2,5,5,4,7,8,9,6,2,2,5,8,9,9,6,5,4,5,6,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        frequency(map,arr);
        System.out.println("Elements Frequencies");
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "        " + entry.getValue());
        }
    }
}
