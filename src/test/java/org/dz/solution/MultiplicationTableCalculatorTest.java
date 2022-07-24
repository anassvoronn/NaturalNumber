package org.dz.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTableCalculatorTest {

    @Test
    public void print01() {
        MultiplicationTableCalculator calculator = new MultiplicationTableCalculator();
        calculator.print(1, 15);
    }

    @Test
    public void print09() {
        MultiplicationTableCalculator calculator = new MultiplicationTableCalculator();
        calculator.print(9, 30);
    }

    @Test
    public void printMinus9() {
        MultiplicationTableCalculator calculator = new MultiplicationTableCalculator();
        calculator.print(-9, 15);
    }

    @Test
    public void print0() {
        MultiplicationTableCalculator calculator = new MultiplicationTableCalculator();
        calculator.print(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print3LengthMinus1() {
        MultiplicationTableCalculator calculator = new MultiplicationTableCalculator();
        calculator.print(3, -1);
    }

    @Test
    public void print3Length0() {
        MultiplicationTableCalculator calculator = new MultiplicationTableCalculator();
        calculator.print(3, 0);
    }

}