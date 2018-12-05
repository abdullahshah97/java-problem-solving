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
public class SortStudents {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] students = new String [5];
        int [] scores = new int [5];
        System.out.println("For each 5 students, enter name and score seperated by space.");
        for(int i = 0; i < students.length; i++){
            students[i] = sc.next();
            scores [i] = sc.nextInt();
        }
        sort(students, scores);
        
        for(int i : scores)
            System.out.print(i);
        for(String j : students){
            System.out.print(j);
        }
    }
    
    public static void sort(String [] students, int [] scores){
        int tempScore = 0;
        String tempName = "";
        for(int i = 0; i < students.length; i++){
            for(int j = 1; j<students.length - i; j++){
                if(scores[j-1] > scores[j]){
                    tempScore = scores[j];
                    scores[j] = scores [j-1];
                    scores[j-1] = tempScore;
                    
                    tempName = students[j];
                    students[j] = students[j-1];
                    students[j-1] = tempName;   //Sorted both, no need to return since pass by reference
                }
            }
        }
    }
}
