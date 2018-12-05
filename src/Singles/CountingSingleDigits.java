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
public class CountingSingleDigits {
    public static void main(String [] args){
        int [] arr = new int [100];
        int [] count = new int [10];
        for(int i = 0; i < 100; i++){
            arr[i]= (int) (Math.random()*10);
            count[arr[i]] +=1;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(count[i]);
        }
    }
}
