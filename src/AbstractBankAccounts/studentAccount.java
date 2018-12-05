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
public class studentAccount extends Account {
    public studentAccount(String n, int m){
        super(n,m);
    }
    
    @Override
    public void withdraw(int n){
        System.out.println(money);
        money-=n;
        System.out.println(money);
    }
}
