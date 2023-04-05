package org.example.easy;

import java.text.CharacterIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
public class Task20 {

    public boolean isValid(String s) {
        Map<Character,Character> characterMap = new HashMap<>();
        characterMap.put('}','{');
        characterMap.put(')','(');
        characterMap.put(']','[');

        Stack<Character> stack=new Stack<>();
            char[] sChars = s.toCharArray();
            for(int i=0;i<sChars.length;i++){
                //если  скобка открытая, кладем её в стек
                if(!characterMap.containsKey(sChars[i])){
                    stack.push(sChars[i]);
                }else{
                    if(stack.empty()) return false;
                    if(!characterMap.get(sChars[i]).equals(stack.pop())){
                        return false;
                    }
                }

        }
            if(stack.isEmpty()) return true;
            else return false;


    }
}
