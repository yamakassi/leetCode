package org.example.easy;

public class Task9 {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x==0) return true;

        int invertedNumber=0;
        int copyX=x;
        while (copyX!=0){
            invertedNumber=invertedNumber*10+copyX%10;
            copyX=copyX/10;

        }

        return x == invertedNumber;
    }
}
