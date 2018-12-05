/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import java.io.File;


/**
 *
 * @author abdullah
 */
public class TestFileClass {
    public static void main(String [] args){
        File file = new File("src/Singles/ComputeChange.txt");  //creates new file OBJECT must invoke file.createNewFile()
        System.out.println("Does it exist? " + file.exists());
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written to? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        
    }
}
