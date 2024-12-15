/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set2;

import java.util.PriorityQueue;

/**
 *
 * @author rajes
 */
public class ArrayKthLargestElement 
{
    static int kthLargest(int[] arr,int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int a:arr)
        {
            if(minHeap.contains(a)) continue;
            minHeap.offer(a);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) 
    {
        int k=2,arr[] = {3,2,1,5,6,4};
        System.out.println(kthLargest(arr,k));
    }
}
