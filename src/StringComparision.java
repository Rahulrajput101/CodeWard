import java.util.ArrayList;
import java.util.List;

public class StringComparision {
    public int compress(char[] chars) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        // char[] newChars = new char[chars.length];
        if (chars.length == 0) {
            return 0;
        }
        for (int i = 0; i < chars.length; i++) {
//            if(newChars.)
//                newChars[i] = chars[i];
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                comp.append(chars[i]);
                comp.append(count);
                count = 0;
            }
            count++;
        }

        for (int i = 0; i < comp.toString().length(); i++) {
            chars[i] = comp.charAt(i);
        }
        System.out.println(chars);
        return comp.toString().length();
    }

    public boolean isVowel(char ch) {
        // Convert the character to lowercase to handle both upper and lower case vowels
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        return "aeiou".indexOf(ch) != -1;
    }
}
