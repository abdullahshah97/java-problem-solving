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
public class BinarySearch {
    public static void main(String [] args){
        System.out.println(binarySearch());
        System.exit(0);
    }
    
    public static int binarySearch(){
        int [] x = {1,3,5,7,9,11,13,15,17,19};  //sorted list
        int key = 12;
        int low = 0, high = x.length-1;
        
        while(high>=low){
            int mid = (low + high)/2;
            if(key < x[mid])
                high = mid - 1;
            else if(key == x[mid])
                return mid;
            else if(key > x[mid])
                low = mid+1;
        }
        return -low-1;
    }
    
}
