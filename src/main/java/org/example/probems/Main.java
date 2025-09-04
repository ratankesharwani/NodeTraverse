package org.example.probems;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 6, 8, 3, 19);
        Optional<Integer> sortedArray = list.stream()
                .distinct()  // remove duplicates: [1, 2, 3, 6, 8, 19]
                .sorted((a, b) -> Integer.compare(b, a))  // sort in descending order: [19, 8, 6, 3, 2, 1]
                .skip(4)  // skip first 4 elements: [2, 1]
                .findFirst();  // get the first remaining element: 2

        System.out.println(sortedArray.orElse(null));

    }
}
