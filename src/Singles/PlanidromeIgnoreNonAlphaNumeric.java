/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singles;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 *
 * @author abdullah
 */
public class PlanidromeIgnoreNonAlphaNumeric {
    public static void main(String [] args){
        String s = JOptionPane.showInputDialog("Enter planidrome");
        JOptionPane.showMessageDialog(null,isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s){
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
    }

    private static String filter(String s) {
        StringBuffer strBuf = new StringBuffer();
        for(int i =0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                strBuf.append(s.charAt(i));
        }
        return strBuf.toString();
    }
    
    private static String reverse(String s) {
        StringBuffer strBuf = new StringBuffer(s);
        strBuf.reverse();
        return strBuf.toString();
    }
}
