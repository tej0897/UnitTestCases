package org.example;

import java.util.Arrays;
import java.util.List;

public class SortingList {
    public static List<Integer> sortList(List<Integer> list) {
        return(list.stream()
                .sorted()
                .toList());
    }
}
