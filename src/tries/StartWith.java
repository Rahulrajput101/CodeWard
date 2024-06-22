package tries;

import static tries.Tries.insert;
import static tries.Tries.startsWith;

public class StartWith {
    public void startWithProblemMain(){
        String[] arr = {"apple","app","mango","man","women"};
        for (int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }
        System.out.println(startsWith("app"));
        System.out.println(startsWith("we"));
    }
}
