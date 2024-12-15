/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set2;

/**
 *
 * @author rajes
 */
public class ArraysCountInversions 
{
    static int countInversion(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int arr[] = {4,5,2,1};
        System.out.println(countInversion(arr));
    }
    /*
    // Merge sort-based optimized method (O(n log n))
    static int countInversionMergeSort(int arr[]) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    static int mergeSortAndCount(int arr[], int start, int end) {
        if (start >= end) {
            return 0; // No inversions in a single element
        }

        int mid = (start + end) / 2;

        // Count inversions in left and right halves
        int left = mergeSortAndCount(arr, start, mid);
        int right = mergeSortAndCount(arr, mid + 1, end);

        // Count cross-inversions and merge the two halves
        int cross = mergeAndCount(arr, start, mid, end);

        return left + right + cross;
    }

    static int mergeAndCount(int arr[], int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start; // Pointer for left half
        int j = mid + 1; // Pointer for right half
        int k = 0; // Pointer for temp array
        int inversions = 0;

        // Merge the two halves while counting inversions
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversions += (mid - i + 1); // All remaining elements in left half are inversions
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy sorted temp array back into original array
        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }

        return inversions;
    }
    */
}
