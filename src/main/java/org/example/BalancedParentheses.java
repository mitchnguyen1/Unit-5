package org.example;

import java.util.Stack;

public class BalancedParentheses {

    /**
     * For Step 2, you could have used a Stack to implement the solution. How would you implement a stack if you could not use any of the built-in Java libraries?
     *
     * Using an ArrayList and adding and removing the last element.
     *
     */


    /**
     * Write a function that takes in a string and returns true or false depending on whether that string has balanced parentheses. A string has balanced parantheses if every opening paranthesis “(“ has a matching closing paranthesis “)” that closes the corresponding opening paranthesis.
     *
     * For the purposes of this problem, you only need to worry about parentheses “(“and “)”, not other opening-and-closing marks, like curly brackets, square brackets, or angle brackets.
     */

    /**
     * if every opening ( has a closing )
     * no brackets
     *
     * @param s-string
     * @return true=balanced amount of parentheses
     */

    /**
     *
     * @runtime O(n)
     * @space O(1)
     */
    public boolean balance(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(') {
                count++;
            } else {
                count--;
            }
        }
        return count == 0;
    }

    /**
     * Write a function that takes in a string and returns true or false based on whether the string’s opening-and-closing marks (that is, brackets) are balanced. Account for the following bracket types:
     * <p>
     * ( { [ < > ] } ) - true
     * add to stack if its an opener. pop if it's closing
     */

    /**
     *
     * @runtime O(n)
     * @space O(1)
     */
    public static boolean balanceAllTypes(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '{' || curr == '<' || curr == '[') {
                stack.add(curr);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                switch (pop) {
                    case '(':
                        if (curr != ')') {
                            return false;
                        }
                        break;
                    case '{':
                        if (curr != '}') {
                            return false;
                        }
                        break;
                    case '[':
                        if (curr != ']') {
                            return false;
                        }
                        break;
                    case '<':
                        if (curr != '>') {
                            return false;
                        }
                        break;
                }
            }
        }
        return stack.isEmpty();
    }

}
