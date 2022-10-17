package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstElementCheckTest {

    @Test
    public void should_Return_First_Element_From_The_List(){
        //given
        List<Integer> list = Arrays.asList(11, 113, 10, 22);
        int actual = 11;

        //when
        int expected = FirstElementCheck.firstElementCheck(list);

        //then
        assertEquals(expected, actual);
    }

}