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
public class DecimalToBinary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String binary = convertDecimalToBinary(a);
        System.out.printf("%d in binary is %s\n",a,binary);
    }

    private static String convertDecimalToBinary(int a) {
        StringBuilder str = new StringBuilder();
        while(a!=0){
            str.append(a%2);
            a /= 2;
        }
        str = str.reverse();
        return str.toString();
                
            
    }
}
