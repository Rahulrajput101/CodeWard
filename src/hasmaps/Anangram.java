package hasmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Anangram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            Character atS =s.charAt(i);
            Character atT = t.charAt(i);

            if(!map.containsKey(atS)){
                map.put(atS,1);
            }else{
                map.put(atS,map.get(atS)+1);
            }

            if(!map.containsKey(atT)){
                map.put(atT,-1);
            }else{
                map.put(atT,map.get(atT)-1);
            }
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> diff1 = new HashSet<>(set1);

         diff1.removeAll(set1);

         diff1.toArray();

        List.of(diff1.stream().toList());

        return true;
    }
}
