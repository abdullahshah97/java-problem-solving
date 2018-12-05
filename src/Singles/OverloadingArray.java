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
public class OverloadingArray {
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6};
        double [] arr2 = {6,4.4,1.9,2.9,3.4,3.5};
        int x = average(arr);
        double y = average(arr2);
        System.out.println(x + "\t" + y);
    }
    
    public static int average(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    
    public static double average(double [] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
