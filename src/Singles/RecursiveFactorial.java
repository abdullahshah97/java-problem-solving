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
public class RecursiveFactorial {
    public static void main(String [] args){
        System.out.println("Enter a non-negative number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = fac(n);
        System.out.printf("The factorial of %d is %d\n", n, a);
    }

    private static int fac(int n) {
        if(n == 0)
            return 1;
        else
            return n * fac(n-1);
    }
}