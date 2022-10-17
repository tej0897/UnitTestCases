package org.example;

import java.util.List;

public class FirstElementCheck {
    public static int firstElementCheck(List<Integer> list){
        return list.stream()
                .findFirst()
                .get();
    }
}
