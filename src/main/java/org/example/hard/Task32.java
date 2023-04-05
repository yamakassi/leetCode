package org.example.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task32 {
    public int longestValidParentheses(String s) {

        Map<Character,Character> characterMap = new HashMap<>();
        characterMap.put('}','{');
        characterMap.put(')','(');
        characterMap.put(']','[');
        int maxCounter1=0,max2=0;
        Stack<Character> stack=new Stack<>();
        char[] sChars = s.toCharArray();
        for(int i=0;i<sChars.length;i++){
            //если  скобка открытая, кладем её в стек
            if(!characterMap.containsKey(sChars[i])){
                stack.push(sChars[i]);
            }else{
                if(stack.empty()) {
                    if(max2>maxCounter1) maxCounter1=max2;
                    max2=0;
                    continue;
                };
                if(!characterMap.get(sChars[i]).equals(stack.pop())){
                    if(max2>maxCounter1) maxCounter1=max2;
                    max2=0;
                }
            }
            max2++;


        }

        if(!stack.isEmpty()) {
            max2=max2-(stack.size()*2+1);
            if(max2>maxCounter1 || maxCounter1==0) maxCounter1=max2;

        }else {
            if(maxCounter1==0){
                maxCounter1=max2;
            }
        }



        return maxCounter1;
    }
}
