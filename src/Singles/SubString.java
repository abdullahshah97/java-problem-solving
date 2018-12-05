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
public class SubString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String and then its sub");
        String string = sc.next().toLowerCase();
        String sub = sc.next().toLowerCase();
        if(string.indexOf(sub)>=0)
            System.out.println("Substring by indexOf()");
        if(myIndexOf(string, sub))
            System.out.println("Substring by MYINDEXOF()");
        }
    //Using just string
    public static boolean myIndexOf(String string, String sub){
        for(int i = 0; i < (string.length() - sub.length() + 1); i++){
            String compare = "";
            if(string.charAt(i)==sub.charAt(0)){
                for(int j = 0; j < sub.length(); j++){
                    compare += string.charAt(i + j);
                }
            if(compare.toString().equals(sub));
                return true;
            }
        }
        return false;
    }
    
    //Using StringBuilder
    /*public static boolean myIndexOf(String string, String sub){
        for(int i = 0; i < (string.length() - sub.length() + 1); i++){
            StringBuilder compare = new StringBuilder();
            if(string.charAt(i)==sub.charAt(0)){
                for(int j = 0; j < sub.length(); j++){
                    compare.append(string.charAt(i + j));
                }
            if(compare.toString().equals(sub));
                return true;
            }
        }
        return false;
    }*/
    
    
}
