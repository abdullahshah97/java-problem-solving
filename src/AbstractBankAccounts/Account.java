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
public abstract class Account {
    String name;
    int money;
    
    public Account(String n, int m){
        name = n;
        money =m;
    }
    
    public void deposit(int n){
        money+=n;
    }
    public abstract void withdraw(int n);
    
    public String getName(){
        return name;
    }
}
