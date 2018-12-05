/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class FileReadData {
    public static void main(String [] args) throws Exception{
        File file = new File("src/Singles/FileWriteData.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int scores = input.nextInt();
            System.out.printf("%s %s %s " + scores + "\n", firstName, middleName, lastName);
        }
    }
}
