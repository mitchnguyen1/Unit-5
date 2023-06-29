package org.example;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    /**
     * Find the index of an item in a list using recursion.
     *
     * Implement a function that takes in an item and an array of items, and returns the 0-based index of a sought item: >>> recursive_search(“hey”, [“hey”, “there”, “you”]) 0
     *
     * If the item isn’t in the list, return -1: >>> recursive_search(“porcupine”, [“hey”, “there”, “you”]) -1
     *
     * Important: Solve this problem only with recursion—you cannot use a for or while loop in your solution!
     *
     * What is the runtime of this function?
     */

    public static int search(String t, List<String> l){
        return l.contains(t) ? 0 : -1;
    }

    public static int recursive_search(String t, ArrayList<String> l) {

        //return -1 if not found
        if (l.isEmpty()) {
            return -1;
        } else {
            String curr = l.get(l.size() - 1);
            //check if it's found
            if (curr.equals(t)) {
                return 0;
            }
            //remove the list and call function again until -1 or 0
            l.remove(l.size() - 1);
            return recursive_search(t, l);
        }
    }


}
