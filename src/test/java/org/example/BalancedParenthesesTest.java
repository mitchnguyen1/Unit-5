package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test for balance in parentheses.
 * <p>
 * balance() only checks for parentheses.
 *
 * @Test: balance()
 * 1. ()()()() - true
 * 2. ((()))((()())()) - true
 * 3. )( - true
 * 4. ) - false
 * <p>
 * <p>
 * balanceAllTypes() checks for other brackets
 * @Test: balanceAllTypes()
 * 1. ( { [ ] } ) - true
 * 2. (({{}[}])) - true
 * 3. {}} - false
 */


class BalancedParenthesesTest {

    String TrueEvenFour = "()()()()";
    String TrueRandomOrder = "((()))((()())())";
    String TrueOppositePosition = ")(";
    String FalseOneParenth = ")";

    String TrueEvenThree = "({[]})";
    String TrueRandom = "(({{}[]}))";
    String FalseMissingOpening = "{}}";

    private BalancedParentheses b = new BalancedParentheses();


    @Test
    void balance_TrueEvenFour() {
        assertTrue(b.balance(TrueEvenFour));
    }

    @Test
    void balance_TrueRandomOrder() {
        assertTrue(b.balance(TrueRandomOrder));
    }

    @Test
    void balance_TrueOppositePosition() {
        assertTrue(b.balance(TrueOppositePosition));
    }

    @Test
    void balance_FalseOneParenth() {
        assertFalse(b.balance(FalseOneParenth));
    }

    @Test
    void balanceAllTypes_TrueEvenThree() {
        assertTrue(b.balanceAllTypes(TrueEvenThree));
    }

    @Test
    void balanceAllTypes_TrueRandom() {
        assertTrue(b.balanceAllTypes(TrueRandom));
    }

    @Test
    void balanceAllTypes_FalseMissingOpening() {
        assertFalse(b.balanceAllTypes(FalseMissingOpening));
    }
}