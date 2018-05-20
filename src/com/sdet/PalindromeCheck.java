package com.sdet;

public class PalindromeCheck {

    public static void main(String[] args){
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number){
        int reverse = Integer.reverse(number);
        System.out.println("number: " + number + " reverse: " + reverse);
        if(number == reverse){
            return true;
        }else {return false;}

    }
}
