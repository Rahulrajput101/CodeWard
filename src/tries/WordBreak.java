package tries;

import java.util.List;

import static tries.Tries.insert;
import static tries.Tries.search;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {

        for(int i = 0; i<wordDict.size(); i++){
            insert(wordDict.get(i));
        }

        return breakTheWord(s);
    }

    public boolean breakTheWord(String key){
        if(key.isEmpty()){
            return true;
        }
        for(int i = 1; i<=key.length(); i++){
            if(search(key.substring(0,i)) && breakTheWord( key.substring(i))){
                return true;
            }

        }
        return false;
    }
}
