package hashing;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FindItineraryFromTickets {
    public void findMain(){
        ArrayList<Pair<String,String >>  list = new ArrayList<Pair<String, String>>();
        list.add(new Pair<>("Chennai", "Bengaluru"));
        list.add(new Pair<>("Mumbai", "Delhi"));
        list.add(new Pair<>("Goa", "Chennai"));
        list.add(new Pair<>("Delhi", "Goa"));

        HashMap<String,String> hm = new HashMap<>();
        HashMap<String,String> hmRev = new HashMap<>();


        for (Pair<String,String> pair : list){
            hm.put(pair.component1(),pair.component2());
            hmRev.put(pair.component2(), pair.component1());
        }
        ArrayList<Pair<String,String >>  journey = new ArrayList<Pair<String, String>>();
        String start = "";

        for ( String key : hm.keySet()){
             if (!hmRev.containsKey(key)){
                 start = key;
             }
        }

        System.out.println("start is " +start);

        while (!hm.isEmpty()){
            String end = hm.get(start);
            journey.add(new Pair<>(start,end));
            hm.remove(start);
            start = end;
        }

        for (Pair<String, String> stringStringPair : journey) {
            System.out.println(stringStringPair);
        }
    }

}
