package ru.skypro;

import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        doTask3();
    }

    private static List<Integer> generateList (int n) {
        List<Integer> list = new ArrayList<>(n);
        System.out.println("Generated list");
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(40));
        }
        System.out.println(list);
        return list;
    }

    private static void doTask1() {
        List<Integer> nums = generateList(20);
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 1){
                System.out.println(i);
            }
        }

    }

    private  static void doTask2() {
        List<Integer> nums = generateList(20);
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
    private static void doTask3() {
        List<String> strings = List.of("test", "test", "fsd", "test", "test", "d33d");
        System.out.println(new HashSet<>(strings));
    }


}

