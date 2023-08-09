package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AppTest {
    private int[] inputs;
    private String result;

    public AppTest(String result, int[] inputs) {
        this.inputs = inputs;
        this.result = result;
    }

    @Parameterized.Parameters
    public static List<Object[]> genParams() {
        return Arrays.asList(new Object[][] {
                {"[-7, -1, 0, 1, 2, 4, 4, 10, 13, 14]",new int[] {-7,2,13,4,14,-1,0,1,4,10}},
                {"[-1, 0, 0, 0, 2, 3, 4, 5, 5, 100]", new int[] {5,3,5,0,0,0,-1,2,4,100}},
                {"[133, 171, 190, 231, 555, 611, 643, 666, 780, 999]",
                        new int[] {133,555,231,611,666,171,190,780,999,643}}
        });
    }

    @Test
    public void appRegularTest() {
        assertEquals(result, App.sortAndPrint(inputs));
    }
}
