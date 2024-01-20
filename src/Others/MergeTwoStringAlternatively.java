package Others;

public class MergeTwoStringAlternatively {
        public String mergeAlternately(String word1, String word2) {
            int size = word1.length() + word2.length();
            StringBuilder mergedString = new StringBuilder();
            for(int i = 0; i<size-1; i++){
                if(i<word1.length() ){
                    mergedString.append(word1.charAt(i));
                }
                if(i<word2.length() ){
                    mergedString.append(word2.charAt(i));
                }
            }
            return mergedString.toString();
        }
}
