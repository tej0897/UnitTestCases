package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingListTest {

    @Test
    public void should_Return_Sorted_List(){

        //given
        List<Integer> list = Arrays.asList(23,11,89,130,44,209,67);
        List<Integer> actual = Arrays.asList(11, 23, 44, 67, 89, 130, 209);

        // when
        List<Integer> expected = SortingList.sortList(list);

        //then
        assertEquals(expected, actual);
    }

}