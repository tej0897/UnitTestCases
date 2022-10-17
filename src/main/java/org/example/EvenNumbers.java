package org.example;

import java.util.List;

public class EvenNumbers {
    public static List<Integer> evenCheck(List<Integer> list) {

        return(list.stream()
                .filter(number -> number % 2 == 0)
                .toList());
    }
}
