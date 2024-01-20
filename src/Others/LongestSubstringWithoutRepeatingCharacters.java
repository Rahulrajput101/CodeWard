package Others;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int longSubStr = 0;
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            int temp =0;
            if(str.toString().indexOf(s.charAt(i)) != -1){
                if(temp>longSubStr){
                    longSubStr = temp;
                }
                temp = 0;
                i++;
            }else{
                temp++;
                i++;
            }
        }

        return longSubStr;

    }
}
