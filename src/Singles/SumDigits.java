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
public class SumDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer.");
        String xString = sc.next();
        int x = Integer.parseInt(xString);
        boolean even = x%2==0;
        int sum = 0;
        for(int i = 0; i < xString.length(); i++){
            sum += x % 10;
            x /= 10;
        }
        System.out.println(even + " Sum of digits: " + sum);
        
    }
}
