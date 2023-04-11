package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class Task242 {

    public boolean isAnagram(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length()!=t.length())return  false;
        Map<Character,Integer> mapCountS = new HashMap();
        Map<Character,Integer> mapCountT = new HashMap();
        char[] sCharaster = s.toCharArray();
        char[] tCharaster = t.toCharArray();
        for(int i=0,j=0;i<sCharaster.length;i++,j++){
            if(mapCountS.containsKey(sCharaster[i])) mapCountS.put(sCharaster[i],mapCountS.get(sCharaster[i])+1);
            else mapCountS.put(sCharaster[i],1);
          if(mapCountT.containsKey(tCharaster[i])) mapCountT.put(tCharaster[i],mapCountT.get(tCharaster[i])+1);
            else mapCountT.put(tCharaster[i],1);
        }

        if(mapCountT.equals(mapCountS)) return true;
        else  return false;
    }
}
