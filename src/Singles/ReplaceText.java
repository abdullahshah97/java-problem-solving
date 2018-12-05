/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class ReplaceText {
    public static void main(String [] args) throws FileNotFoundException{
    //    Scanner sc = new Scanner(System.in);
    //    String [] arr2 = sc.nextLine().split(" ");
        String [] arr = {"FileWriteData.txt", "FileWrittenToData.txt", "Abdullah", "Shah Ahmad"};
        if(arr.length != 4) {
            System.out.println("usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(0);
        }
        
        File sourceFile = new File("src/Singles/"+arr[0]);
        if(!sourceFile.exists()){
            System.out.println("Sourcefile doesnt exist");
        }
        
        File targetFile = new File("src/Singles/"+arr[1]);
        if(targetFile.exists()){                                //will work on existing files too
            System.out.println("Target file already exists");
        }
        
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
        
        while(input.hasNext()){
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(arr[2], arr[3]);
            output.println(s2);
        }
        
        input.close();
        output.close();
        System.exit(0);
    }
}
