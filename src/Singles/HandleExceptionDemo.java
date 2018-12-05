/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class HandleExceptionDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("\nEnter Integer:");
                System.out.print(sc.nextInt());
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Not an integer");
                sc.nextLine();
                e.getMessage();
            }
        } while (continueInput);
    }
}
