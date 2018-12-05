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
public class CountEachLetter {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int [] count = countLetters(s.toLowerCase());
        String output = "";
        for(int i =0; i < count.length; i++){
            if(count[i]!=0){
                output += (char)(i + 'a') +" appears " + count[i] + (count[i]==1? " time\n" : " times\n"); //retrieve character by adding 97
            }
        }
        System.out.println(output);
    }

    private static int[] countLetters(String s) {
        int [] count = new int [26];
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)>96&&s.charAt(i)<125){
                count[s.charAt(i)-'a']++;   //a is 97 in ascii, so b-a is second element in array
            }
        }
        return count;
    }
}
