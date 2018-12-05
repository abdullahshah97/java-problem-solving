/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class RunnersTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contestants = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < contestants; i++) {
            arr.add(sc.next());
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size() - i; j++) {
                int a = Integer.parseInt(arr.get(j - 1).charAt(0) + "" + arr.get(j - 1).charAt(1));
                int b = Integer.parseInt(arr.get(j).charAt(0) + "" + arr.get(j).charAt(1));
                if (a > b) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
            }
        }
        int lowestH = Integer.parseInt(arr.get(0).charAt(0) + "" + arr.get(0).charAt(1));                               

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size() - i; j++) {
                int a = Integer.parseInt(arr.get(j - 1).charAt(3) + "" + arr.get(j - 1).charAt(4));
                int b = Integer.parseInt(arr.get(j).charAt(3) + "" + arr.get(j).charAt(4));
                if (a > b && lowestH == Integer.parseInt(arr.get(j).toString().charAt(0) + "" + arr.get(j).toString().charAt(1))) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
            }
        }
        
        int lowestM = Integer.parseInt(arr.get(0).toString().charAt(3) + "" + arr.get(0).toString().charAt(4));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size() - i; j++) {
                int a = Integer.parseInt(arr.get(j - 1).charAt(6) + "" + arr.get(j - 1).charAt(7));
                int b = Integer.parseInt(arr.get(j).charAt(6) + "" + arr.get(j).charAt(7));
                if (a > b && lowestM == Integer.parseInt(arr.get(j).toString().charAt(3) + "" + arr.get(j).toString().charAt(4))) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
            }
        }
        System.out.println(arr.get(0));
    }
}
