package Ravikumar.Sujatha.ElectionWinner;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by sujatharavikumar on 10/3/16.
 */
public class Assessment {


    static String electionWinner(String[] votes) {
        Map<String, Integer> candidates = new TreeMap<String, Integer>(Collections.<String>reverseOrder());
        List asList = Arrays.asList(votes);
        Set<String> mySet = new HashSet<String>(asList);
        for(String s: mySet){
            //System.out.println(s + " " +Collections.frequency(asList,s));
            candidates.put(s,Collections.frequency(asList,s));
        }

        Entry<String,Integer> maxEntry = null;

        for(Entry<String,Integer> entry : candidates.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    public static void main(String[] args) {
        String[] votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"};
        String winner = electionWinner(votes);
        System.out.println(winner);
    }

}
