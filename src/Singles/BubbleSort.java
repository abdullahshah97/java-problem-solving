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
public class BubbleSort {
    public static void main(String [] args){
        int [] arr = {5,8,2,3,4,1,10,2,9,2};
        int n = arr.length, temp = 0;
        for(int i =0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
/*int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j< n - i; j++){
                if(arr[j-1] > arr[j]){  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }
        }
        for(int i =0; i < arr.length; i++){
        System.out.println(arr[i]);
        }*/