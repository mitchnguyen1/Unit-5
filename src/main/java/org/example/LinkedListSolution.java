package org.example;

import java.util.*;
import java.util.LinkedList;

public class LinkedListSolution {
    /**
     * You will be given two linked lists in “reverse-digit” format. For example, the number 123 would be represented in a linked list like this: 3 → 2 → 1 You should return the sum of these two numbers in the same “reverse-digit” format. For 123 + 456, this should return 579, in the form of a linked list like this: 9 → 7 → 5.
     *
     * What is the runtime of this function?
     */

    /**
     * 567,123 - return 6(5+1),8(6+2),10(7+3)
     * @param first,second
     * @return List of sum of first & second
     */
    public List<Integer> addTwoList(List<Integer> first, List<Integer> second){
        List<Integer> solution = new LinkedList<>();

        for(int i = 0; i < first.size(); i++){
            int f = first.get(i);
            int s = second.get(i);
            solution.add(f+s);
        }
        return solution;
    }
}
