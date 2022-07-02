package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        doTask1();
    }

    private static void doTask1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 1){
                System.out.println(i);
            }
        }

    }

    private  static void doTask2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 5, 5, 6, 7 ));
        Set<Integer> set = new TreeSet<>();
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 0){
                set.add(i);
            }
        }
        for (Integer i : set) {
            System.out.println(i);
        }

    }


}

