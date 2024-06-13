package hashing;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] word = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();

        if(pattern.length() != word.length){
            return false;
        }

        for(int i =0; i<word.length; i++){
            Character charPat = pattern.charAt(i);
            String singleWord = word[i];

            if(map.containsKey(charPat)){
                if(!Objects.equals(map.get(charPat), singleWord)){
                    System.out.println("first false "+map.get(charPat)+"_");
                    System.out.println("first false "+singleWord+"_");
                    return false;
                }
            }else{
                if(map.containsValue(singleWord)){
                    System.out.println("second false "+charPat+singleWord);
                    return false;
                }
                map.put(charPat,singleWord);
            }


        }
        return true;

    }
}
