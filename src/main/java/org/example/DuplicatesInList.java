package org.example;

import java.util.Collections;
import java.util.List;

public class DuplicatesInList {
    public static List<Integer> DuplicateCheck(List <Integer> myList) {
        return(myList.stream()
                .filter(i -> Collections.frequency(myList, i) > 1)
                .distinct()
                .toList());
    }
}