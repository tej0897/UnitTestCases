package org.example;

import java.util.List;

public class NotStartsWithOne {
    public static List<Integer> oneCheck(List <Integer> list) {

        List<Integer> finalOutput = list.stream()
                .filter(number -> firstNumberCheck(number) != 1)
                .toList();
        return(finalOutput);
    }

    public static int firstNumberCheck(int number){
        while ( number >=10){
            number /=10;
        }
        return number;
    }
}
