package Singles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdullah
 */
public class MilesToKM {
    public static void main(String [] args){
        System.out.println("Miles\tKilometers\tKilometers\tMiles");
        for(double i = 1, j = 20; i<11; i++, j+=5){
            System.out.println(i + "\t" + i*1.609 +"\t\t" + j + "\t\t" + j/1.609);
        }
    }
}