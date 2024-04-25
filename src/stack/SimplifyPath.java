package stack;

import java.util.Objects;
import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {

        String [] elements = path.split("/");

        Stack<String> s = new Stack();

        for( String str : elements){
            if(str.equals(".") || str.isEmpty()){

            }else if (str.equals("..")){
                if (!s.isEmpty()) {
                    s.pop();
                }
            }else {
                s.push(str);
            }
        }
     //   String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        while (!s.isEmpty()) {
            stringBuilder.insert(0,"/"+s.pop());
            //str = "/" + s.pop()+str ;

        }

        return stringBuilder.isEmpty() ? "/" : stringBuilder.toString();

    }
}
