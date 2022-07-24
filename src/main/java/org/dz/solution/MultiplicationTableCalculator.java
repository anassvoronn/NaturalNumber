package org.dz.solution;

public class MultiplicationTableCalculator {
    public void print(int number, int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length can't be negative");
        }
        int result = 0;
        for (int i = 1; i <= length; i++) {
            result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}
