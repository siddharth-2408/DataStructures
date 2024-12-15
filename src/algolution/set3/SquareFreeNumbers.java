/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author rajes
 */
public class SquareFreeNumbers 
{
    static int squareFreeNumbers(int n)
    {
        double temp=0;
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                factors.add(i);
                if(i!=n/i)
                    factors.add(n/i);
            }
        }
        factors.add(n);
        HashSet<Integer> squareFreeFactors = new HashSet<>(factors);
        for(int i=2;i<=Math.sqrt(n);i++) 
        {
            int square=i*i;
            if (n%square == 0) 
            {
                for(int factor : factors) 
                {
                    if(factor%square == 0) 
                    {
                        squareFreeFactors.remove(factor); // Remove non-square-free factor
                    }
                }
            }
        }
        squareFreeFactors.remove(1);

        return squareFreeFactors.size();
    }
    public static void main(String args[])
    {
        int num = 72;
        System.out.println(squareFreeNumbers(num));
    }
}
