/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rajes
 */
public class ArrayPrintUniqueElements 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,2,1,2,3,5,40,4,6,6,5,7,8,10,1,2,1,23,145};
        /*
        Streams java 8 or later
        var uniqueElements = Arrays.stream(arr) // Step 1: Convert array to a stream
                                   .boxed()    // Step 2: Convert int to Integer (primitive to object)
                                   .collect(Collectors.groupingBy(e -> e, Collectors.counting())) 
                                   // Step 3: Group elements and count occurrences
                                   .entrySet() // Step 4: Get the map entries (key-value pairs)
                                   .stream()   // Step 5: Create a stream from the entry set
                                   .filter(e -> e.getValue() == 1) // Step 6: Filter only elements with count 1
                                   .map(e -> e.getKey())           // Step 7: Extract the keys (unique elements)
                                   .toList();                      // Step 8: Collect to a list        
        System.out.println("Unique elements: " + uniqueElements);
        */
        //HashSet
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
        //Also We Can use Frequency Map(HashMap)
    }
}
