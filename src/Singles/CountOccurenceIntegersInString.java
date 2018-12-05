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
public class CountOccurenceIntegersInString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int [] i = counter(a);
        for (int j = 0; j < i.length; j++)
            System.out.printf("The number %d occured %d times\n",j,i[j]);
    }
    
    public static int [] counter(String s){
        int [] count = new int [10];
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                count[s.charAt(i)-48]++;
            }
        }
        return count;
    }
}
