package hashing;

import java.util.HashMap;

public class IsoMorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Character> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            Character atS =s.charAt(i);
            Character atT = t.charAt(i);

            if(map.containsKey(atS)){
                if(map.get(atS) != atT){
                    return false;
                }
            }else{
                if(map.containsValue(atT)){
                    return false;
                }
                map.put(atS,atT);
            }
        }
        return true;
    }
}
