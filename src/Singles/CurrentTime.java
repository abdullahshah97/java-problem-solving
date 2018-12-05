/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

/**
 *
 * @author abdullah
 */
public class CurrentTime {
    public static void main (String [] args){
        long totalMilliSeconds=System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds/1000;
        int seconds = (int)totalSeconds%60;
        long totalMinutes = (int)totalSeconds/60;
        int minutes=(int)totalMinutes%60;
        long totalHours=(int)totalMinutes/60;
        int hours = (int)totalHours%24;
        System.out.print(hours+":"+minutes+":"+seconds);
        
        
    }
}
