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
public class CountOccurence {
    public static void main(String [] args){
        System.out.println("Enter a word and then a letter to count its occurence");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = sc.next().charAt(0);
        int i = counter(s, a);
        System.out.printf("\nIn the word %s the letter %c occured %d times ", s,a,i);
    }
    
    public static int counter(String s, Character a){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==a)
                count++;
        }
        return count;
    }
    
}
