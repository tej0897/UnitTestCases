package org.example;

import org.example.DuplicatesInList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInListTest {

    @Test
    void shouldReturn_Duplicate_Elements_In_List(){
        //given
        List<Integer> list = Arrays.asList(11, 11, 19);
        List<Integer> actual = Arrays.asList(11);

        //when
        List<Integer> expected = DuplicatesInList.DuplicateCheck(list);

        //then
        assertEquals(actual,expected);
    }

}