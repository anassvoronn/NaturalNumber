package org.dz.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class NaturalNumberTest {

    @Test
    public void task3(){
        for (int i = 1; i <= 10; i++) {
            int num = 0;
            num = 6 * i;
            System.out.println(6+"*"+i+"="+num);
        }
    }
}