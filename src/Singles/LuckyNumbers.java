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
public class LuckyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong();
        long j = sc.nextLong();
        long count = j - i + 1;
        long counter = 0;
        for (int n = 0; n < count; n++) {
            String a = Long.toString(i + n);
            String iS = Long.toString(i);
            String jS = Long.toString(j);
            if (a.contains(iS) && !a.contains(jS) || !a.contains(iS) && a.contains(jS)) {
                counter++;
            } else if (a.contains(iS) && a.contains(jS)) {
                {
                    boolean together = Integer.toString(n).matches("(\\d)*{" + j + "" + i + "}(\\d)*");
                    //together = Integer.toString(n).matches("{\\d*"+i+""+j+"\\d*}");

                    if (!together) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }
}
