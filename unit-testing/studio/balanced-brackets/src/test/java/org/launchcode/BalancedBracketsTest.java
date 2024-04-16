package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void balancedOpeningAnbClosingBracketsOnly() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void unbalancedOpeningAnbTwoClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    void closingAndOpeningBracketsOnly() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));

    }
    @Test
    void singleOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    void singleClosingBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    void balancedOpeningAndClosingBracketsAroundWordLaunchCode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    void emptyStringWithNotBracketsOfAnyKind() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    void balancedOpeningAndClosingBracketsPriorToWordLaunchCode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
     void balancedOpeningAndClosingBracketsAroundWordCodeThatBeginsWithLaunch() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    void openingBracketOnlyPriorToWordLaunchCode() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    void balancedOpeningAndClosingBracketsAroundWordCodeThatBeginsWithWordLaunch() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    void unbalancedClosingThenOpeningBracketAroundWordCode() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

}
