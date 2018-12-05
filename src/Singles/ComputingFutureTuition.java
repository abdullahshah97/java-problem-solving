/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

/**
 *
 * @author abdullah
 */
public class ComputingFutureTuition {
    public static void main(String [] args){
        double tuition =  10000;
        double rate = 1.05;
        tuitionTenYears(tuition, rate);
        tuitionFourYears(tuition, rate);
        System.exit(0);
    }

    private static void tuitionTenYears(double x, double rate) {
        int count = 0;
        while(count<10){
            x *= 1.05;
            count++;
        }
        System.out.println("After 10 years, tuition will be: " + x);
    }

    private static void tuitionFourYears(double x, double rate) {
        x *= Math.pow(rate,10); //ten years from now
        double total = x;
        int count = 0;
        while(count<4){
            x *= 1.05;
            total += x;
            System.out.println(total);
            count++;
        }
        System.out.println("Total of 4 years tutition after 10 years will be: "+total);
    }
}