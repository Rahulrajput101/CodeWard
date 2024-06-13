package hashing;

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
            char c = s.charAt(i);
          map.put(c, map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i<t.length(); i++){
            char c = t.charAt(i);
            if (map.containsKey(c)){
                if (map.get(c) == 1){
                    map.remove(c);
                }else {
                    map.put(c, map.get(c)-1);
                }
            }else {
                return false;
            }
        }

        return map.isEmpty();
    }
}

//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> diff1 = new HashSet<>(set1);
//
//         diff1.removeAll(set1);
//
//         diff1.toArray();
//
//        List.of(diff1.stream().toList());
