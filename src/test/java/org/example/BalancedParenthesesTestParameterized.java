package org.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


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

@RunWith(Parameterized.class)
public class BalancedParenthesesTestParameterized {


    private String input;
    private boolean expectedResult;
    BalancedParentheses b = new BalancedParentheses();

    public BalancedParenthesesTestParameterized(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedResult = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        // Return a collection of test data as arrays
        return Arrays.asList(new Object[][]{
                {"()()()()",true},
                {"((()))((()())())",true},
                {"(()())",true},
                {")",false},
                {"({[]})",true},
                {"(({{}[]}))",true},
                {"{}}",false}
        });
    }


    @Test
    public void balanceAllTypes() {
        boolean result = b.balanceAllTypes(input);
        System.out.println(input);
        assertEquals(expectedResult,result);
    }
}