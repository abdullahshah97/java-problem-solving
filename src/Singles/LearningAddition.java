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
public class LearningAddition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int first = (int) (Math.random()*100);
        int second = (int) (Math.random()*100);
        System.out.println("Add the two numbers:" + first + " and " + second);
        int answer = sc.nextInt();
        if(answer==first+second)
            System.out.print("Correct");
        else
            System.out.println("Wrong");
    }
}
