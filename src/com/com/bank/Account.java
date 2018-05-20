package com.com.bank;

public class Account {

    private String accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public void setAccountNumber(String accountNo){
        this.accountNumber = accountNo;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public void setCustomerEmail(String email){
        this.customerEmail = email;
    }
    public void setCustomerPhoneNumber(String phoneNumber){
        this.customerPhoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public String getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }

    public void deposit(int amount){
        this.balance = this.balance + amount;
    }
    public void withdrawl(int amount){
        if(this.balance - amount > 0){
            this.balance = this.balance - amount;
        }
    }
}
