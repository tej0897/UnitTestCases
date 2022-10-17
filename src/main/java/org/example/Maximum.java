package org.example;

import java.util.List;

public class Maximum {
    public static int checkMax(List<Integer> list) {
        return(list.stream()
                .max(Integer :: compare)
                .get());
    }
}
