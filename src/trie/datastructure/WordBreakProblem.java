/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie.datastructure;

import java.util.Arrays;

/**
 *
 * @author rajes
 */
public class WordBreakProblem 
{
    //Structure of a Node
    static class Node
    {
        Node[] children;
        boolean eow;
        //Inititalising
        public Node()
        {
            children = new Node[26];//a-z or A-Z
            eow = false;
            Arrays.fill(children, null);
        }
    }
    static Node root = new Node();
    
    //Insertion in Trie
    public static void insert(String word)
    {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null)
                curr.children[idx] = new Node();
            if(i == word.length()-1)
                curr.children[idx].eow = true;
            curr = curr.children[idx];
        }
    }
    
    //Searching in Trie
    public static boolean search(String key)
    {
        Node curr = root;
        for(int i=0;i<key.length();i++)
        {
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null)
                return false;
            if(i == key.length()-1 && curr.children[idx].eow == false)
                return false;
            curr = curr.children[idx];
        }
        return true;
    }
    
    public static boolean wordBreak(String key)
    {
        if(key.length()==0)
            return true;
        for(int i=1;i<=key.length();i++)
        {
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) 
    {
        String words[] = {""};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(wordBreak("a"));
    }
}
