/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rajes
 */
public class HappyNumber 
{
    static boolean isHappy(int n) 
    {
        if(n<1)
            return false;
        if(n==1)
            return true;
        HashSet<Integer> hashSet = new HashSet<>();
        while(true)
        {
            int sum = 0;
            while(n>0)
            {
                int r = n%10;
                sum = sum+r*r;
                n = n/10;
            }
            if(sum == 1)
                return true;
            if(hashSet.contains(sum))
                return false;
            hashSet.add(sum);
            n = sum;
        }
    }
    static public void main(String args[])
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        n = scan.nextInt();
        System.out.println(isHappy(n));
    }
    
}
