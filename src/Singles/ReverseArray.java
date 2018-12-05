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
public class ReverseArray {
    public static void main(String [] args){
        int [] arr = {10, 5, 1, 2, 6, 7, 4, 8, 3, 9};
        for(int i = 0, j = arr.length-1; i < j ; i++, j--){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
