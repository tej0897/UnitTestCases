package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfElementsTest {
    @Test
    public void should_Return_Number_Of_Elements_InList(){
        //given
        List<Integer> list = Arrays.asList(11,15,19,45,78,191,450);
        int actual = 7;

        //when
        int expected = NumberOfElements.checkSize(list);

        //then
        assertEquals(expected, actual);

    }

}