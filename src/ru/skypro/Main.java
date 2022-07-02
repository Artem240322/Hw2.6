package ru.skypro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.set(i, s + "!");
            System.out.println(s);
        }
        for (String s : list) {
            System.out.println(s);
        }


        Iterator var4 = list.iterator();

        while (var4.hasNext()) {
            String s = (String) var4.next();
            System.out.println(s);
        }

    }
}
