package Others;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        StringBuilder filterStr = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                filterStr.append(Character.toLowerCase(c));
            }
        }

        return filterStr.toString().equals(String.valueOf(filterStr.reverse()));
    }
    
}
