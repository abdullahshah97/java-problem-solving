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
public class Regex {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        switch(c){
            case 0: tests();
                    break;
            case 1: furtherTests(sc);
                    break;
            case 2: bookExamples(sc);
        }
        
        
    }
    
    public static void tests(){
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        String j = "java";
        System.out.printf("%s to %s", h,j); //quick formattinig
        if(h.matches("hello.*"))    //. is any character and * is any amount of times
            System.out.println("\nYou used .*");
        else if(h.matches(".*hello")){  //.* anthing comes before
            System.out.println("\nYou used .*hello");
        }
        else if(h.matches("(bye){2}")){
            System.out.println("\nbye twice");
        }
        else if(h.matches("\\w.*")){    // \w matches any character, .* any amount of times
            System.out.println("\nAny word");
        }
    }
    
    public static void furtherTests(Scanner sc){
        System.out.println("enter name or telephone or mobile number");
        String a = sc.nextLine();
        if(a.matches("(abdullah|saiyedah)")){
            System.out.println(a);
        }
        else if(a.matches("((020)|(078))(\\d){8}")){
            System.out.printf("Phone number is %s",a);
        }
            
    }

    private static void bookExamples(Scanner sc) {
        String a = sc.nextLine();
        if(a.matches("[\\d]*[02468]")){
            System.out.printf("\n%s is an even number",a);
        }
        else if(a.matches("[A-Z][a-zA-Z]{1,24}")){
            System.out.printf("%s is a surname",a);
        }
    }
}
