/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Singles;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ComputeChange {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double change = sc.nextDouble();
        int remainder= (int)(change*100);
        int tens = 0, fives=0,ones=0,quarters=0,dimes=0;
        
        tens=(int)(remainder/1000);
        remainder%=1000;
        fives=(remainder/500);
        remainder%=500;
        ones= (remainder/100);
        remainder%=100;
        quarters=(remainder/25);
        remainder%=25;
        dimes=remainder;
        System.out.println("Tens:"+tens+"\nFives:"+fives+"\nOnes:"+ones+"\nQuarters"+quarters+"\nDimes"+dimes);
        
    }
}
