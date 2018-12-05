/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class Anagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String s = sc.next();
        System.out.println(isAnagram(a,s) ? "Strings are anagram" : "Strings are not anagrams");
        
    }

    private static boolean isAnagram(String a, String s) {
        StringBuilder str1 = new StringBuilder();   //should match a
        StringBuilder str2 = new StringBuilder();   //deletes s
        str2.append(s);
        
        if(a.length()!=s.length())
            return false;
        
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < str2.length(); j++){
                if(a.charAt(i)==str2.charAt(j)){
                    str1.append(s.charAt(j));
                    str2.deleteCharAt(j);
                }
            }
        }
        
        return (str2.length() == 0);
    }
    
}
