package Others;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String words[] = s.split("\\s");
        String lastWord =  words[words.length-1].trim();
        return lastWord.length();


    }
}
