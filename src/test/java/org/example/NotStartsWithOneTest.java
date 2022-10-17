package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotStartsWithOneTest {

    @Test
    public void should_Return_Numbers_ThatDoNotStartWithOne(){
        //given
        List<Integer> mylist = Arrays.asList(11, 113, 10, 22, 32);
        List<Integer> actual = Arrays.asList(22, 32);

        //when
        List<Integer> expected = NotStartsWithOne.oneCheck(mylist);

        //then
        assertEquals(expected, actual);
    }

}