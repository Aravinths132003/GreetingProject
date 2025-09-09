package org.example;

public class SavingsAccount
{
    double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println(amount+" Amount debited.Main Balance is "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount+" Amount credited.Main Balance is "+balance);
    }
    public double getBalance()
    {
        return balance;
    }
}
