package tries;

public class LongestWordWithAllPrefixes {
    public static String ans = "";
    public void longestWordPrefixesMain(){
        String [] words = {"a","banana","app","appl","apply","apple","ap"};

        for (int i = 0; i<words.length; i++){
            Tries.insert(words[i]);
        }
       Tries.longestWord(Tries.root,new StringBuilder());
        System.out.println(ans);

    }
}
