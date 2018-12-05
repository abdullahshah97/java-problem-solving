package Singles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdullah
 */
public class FileWriteData {
    public static void main (String [] args) throws Exception{
        File file = new File("src/Singles/FileWriteData.txt");
        if(file.exists()){
            System.out.println("Already exists");
            System.exit(0);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Abdullah A Shah ");
        output.println(95);
        
        output.close();
                
    }
}
