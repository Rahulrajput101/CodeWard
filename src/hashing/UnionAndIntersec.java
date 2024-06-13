package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class UnionAndIntersec { // 0(n+m)
    public void unAndInterMain(){
        int [] array1 = {7,3,9};
        int [] array2 = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();

        //Union
        for (int i = 0; i<array1.length; i++){
            hs.add(array1[i]);

        }

        for (int i = 0; i<array2.length; i++){
            hs.add(array2[i]);
        }


        System.out.println("union is "+ hs);
        hs.clear();

        //Intersection
        for (int i = 0; i<array1.length; i++){
            hs.add(array1[i]);

        }
          int count = 0;
        for (int i = 0; i<array2.length; i++){
             if (hs.contains(array2[i])){
                 count++;
                 hs.remove(array2[i]);
             }
        }

        System.out.println(count);

    }
}
