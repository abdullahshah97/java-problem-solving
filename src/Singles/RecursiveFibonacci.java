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
public class RecursiveFibonacci {
    public static void main(String [] args){
        System.out.println("Enter a non-negative number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fib(n);
        System.out.printf("Factorial of %d is %d\n", n, f);
    }
    
    public static int fib(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * fib(n-1);
        }
    }
    
    public static int fibEf(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibEf(n-1) + fibEf(n-2);
    }
}   
