package Others;

import java.util.HashMap;
import java.util.Random;

public class GcdOfStrings {
//    public String gcdOfStrings(String str1, String str2) {
//
//        StringBuilder gcd = new StringBuilder();
//        for( int i =0;  i<str2.length(); i++){
//            int count = 0;
//            for(int j =0; j<str1.length(); j++){
//                if(str2.charAt(j) == str1.charAt(i)){
//                    if(count>=2){
//                        System.out.println(count+ "count1");
//                        gcd.append(str2.charAt(j));
//                        count = 0;
//                    }else{
//                        System.out.println(count+ "2count");
//                        count++;
//                    }
//                }
//            }
//        }
//
//        return gcd.toString();
//
//    }
public String gcdOfStrings(String str1, String str2) {

    StringBuilder gcd = new StringBuilder();
    int len1 = str1.length();
    int len2 = str2.length();

    if(!(str1 + str2).equals(str2 + str1)){
        return " ";
    }


    return "";
}

}
