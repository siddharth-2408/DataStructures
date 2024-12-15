/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algolution.set3;

/**
 *
 * @author rajes
 */
import java.util.Stack;
public class ValidParenthesis2 
{
    static boolean isValid(String s)
    {
        if(s.length()<= 1||s.length()%2!=0) 
            return false;
        else if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']')
            return false;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++) 
        {
            char current = s.charAt(i);
            if(current=='(' || current=='[' || current=='{') 
            {
                stack.push(current);
            } 
            else
            {
                if(stack.empty())
                    return false;
                char top = stack.pop();
                if((current == ')' && top != '(') || (current == ']' && top != '[') || (current == '}' && top != '{'))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String []args)
    {
        String s ="()[{";
        System.out.println(isValid(s));
    }
}
