package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTest {

    @Test
    public void should_Return_Maximum_Element_From_GIvenList(){
        //given
        List<Integer> list = Arrays.asList(11, 113, 10, 22);
        int actual = 113;

        //when
        int expected = Maximum.checkMax(list);

        //then
        assertEquals(expected, actual);
    }

}