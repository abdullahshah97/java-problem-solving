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
public class Interfaces implements Comparable{
    public Interfaces(){
        
    }
    
    @Override
    public int compareTo(Object  o){
        if(o instanceof int [])
            return 2;
        if(o instanceof String[])
            return 574100;
        return 1;
    }
    
}

