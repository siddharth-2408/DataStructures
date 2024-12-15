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
public class StringPalindromeCheck 
{
    static boolean isPalindrome(String s)
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                temp += ch;
        }
        int i=0,j=temp.length()-1;
        while(i<j)
        {
            if(temp.charAt(i) != temp.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s.toLowerCase()));
    }
}
