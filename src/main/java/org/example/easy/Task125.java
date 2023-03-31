package org.example.easy;

//Valid Palindrome
public class Task125 {
    public boolean isPalindrome(String s) {

        if(s==null) new IllegalArgumentException("Input string cannot be null");

        if (s.isEmpty()) return true;
        s=s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
       int i=0;

       int j=s.length()-1;
       while (i<j){
           if(s.charAt(i)!=s.charAt(j)){
               return false;
           }
           i++;
           j--;

       }
       return true;
    }
}
