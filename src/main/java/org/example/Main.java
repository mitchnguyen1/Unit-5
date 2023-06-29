package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BalancedParentheses balanced = new BalancedParentheses();

        LinkedListSolution list = new LinkedListSolution();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("hey", "there", "you"));
        System.out.println(Recursion.recursive_search("porcupine", list1));

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("hey", "there", "you"));
        System.out.println(Recursion.recursive_search("hey", list2));

    }

}