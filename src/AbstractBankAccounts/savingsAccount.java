/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractBankAccounts;

/**
 *
 * @author abdullah
 */
public class savingsAccount extends Account {
    String random;
    public savingsAccount(String n, int m, String random1){
        super(n,m);
        random = random1;
    }
    
    @Override
    public void withdraw( int n){
        System.out.println("Illegal for savingsAccount");
    }
    
    
    
}
