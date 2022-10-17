package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {

    @Test
    public void should_Return_EvenNumbers_From_the_List(){
        //given
        List<Integer> list = Arrays.asList(11, 11, 10, 22);
        List<Integer> actual = Arrays.asList(10, 22);

        //when
        List<Integer> expected = EvenNumbers.evenCheck(list);

        //then
        assertEquals(expected, actual);
    }

}