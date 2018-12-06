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
public class recursivePalindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean flag = isPalindrome(a);
    }
    
    public static boolean isPalindrome(String a){
        return isPalindrome(a, 0, a.length()-1);
    }
    
    public static boolean isPalindrome(String a, int low, int high){    //helper method overloading
        if(high<=low)
            return true;
        else if(a.charAt(low)!=a.charAt(high))
            return false;
        else
            return isPalindrome(a, low+1, high-1);
    }
}
