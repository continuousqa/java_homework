package com.com.bank;

public class Main {
    public static void main(String[] args){

        Account account = new Account();
        account.setAccountNumber("12345");
        account.setBalance(450);
        account.setCustomerEmail("brian@sdet.us");
        account.setCustomerName("Brian Warner");
        account.setCustomerPhoneNumber("8887772231");

        System.out.println("Account #: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Email: " + account.getCustomerEmail());
        System.out.println("Name: " + account.getCustomerName());
        System.out.println("Phone #: " + account.getCustomerPhoneNumber());

        account.deposit(56);
        System.out.println("Starting Balance: " + account.getBalance());

        account.withdrawl(90000);
        System.out.println("Balance should be unchanged (attempted withdraw of $90000): " + account.getBalance());

        account.withdrawl(204);
        System.out.println("Balance after Withdraw of $204: " + account.getBalance());


    }
}
