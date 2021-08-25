package org.fasttrackit.course4.nPalindome;



public class LogicalOp {

    public void palindromeNum(int n){
        int rev = 0;
        int temp = n;
        while (temp>0){
            rev = rev*10;
            rev = rev + temp%10;
            temp = temp/10;
        }
        if (n == rev){
            System.out.println(" Numarul " + n + " este un palindrom");
        }
        else{
            System.out.println("Numarul "+ n + " nu este un palindrom");
        }
    }
}
