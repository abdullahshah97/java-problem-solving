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
public class SortString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 word and it will be spelled alphabetically");
        String a = sc.next();
        a = sort(a);
        System.out.println(a);
    }

    private static String sort(String a) {
        StringBuilder str = new StringBuilder();
        str.append(a);
        int n = a.length();
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(str.charAt(j-1) > str.charAt(j)){
                    char temp = str.charAt(j-1);
                    str.setCharAt(j-1, str.charAt(j));
                    str.setCharAt(j, temp);
                }
            }
        }
        return str.toString();
    }
}
