package tries;

import java.util.ArrayList;
import java.util.List;

public class TriesMain {
    public static void main(String [] args){
//        WordBreak wordBreak =  new WordBreak();
//        List<String> word = new ArrayList<>();
//        word.add("i");
//        word.add("like");
//        word.add("samsung");
//        word.add("mobile");
//        word.add("sam");
//        word.add("b");
//        System.out.println(wordBreak.wordBreak("ilikesamsung",word));

//        PrefixProblem prefixProblem = new PrefixProblem();
//        prefixProblem.prefixMain();

//        StartWith start = new StartWith();
//        start.startWithProblemMain();

//        CountUniqueSubstrings countUniqueSubstrings = new CountUniqueSubstrings();
//        countUniqueSubstrings.countSubstringMain("ababa");

        LongestWordWithAllPrefixes longestWordWithAllPrefixes = new LongestWordWithAllPrefixes();
        longestWordWithAllPrefixes.longestWordPrefixesMain();
    }
}
