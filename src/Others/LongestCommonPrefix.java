package Others;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 0; i<strs.length; i++){
            int j =0;
            while( j<strs[i].length() && j<prefix.length() &&strs[i].charAt(j) == prefix.charAt(j)){
                j++;
            }

            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}
