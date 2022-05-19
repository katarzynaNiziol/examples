package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Radek");
        names.add("Małgorzata");
        names.add("Bogumił");
        names.add("Tadeusz");
        names.add("Marcin");
        names.add("Grażyna");

        names = filter(names, name -> name.endsWith("a"));
        modifyAndDisplay(names, n -> n + "!");
    }

    private static List<String> filter(List<String> input, Filter filter) {
        List<String> resultList = new ArrayList<>();
        for (String name : input) {
            if (filter.filter(name)) {
                resultList.add(name);
            }
        }
        return resultList;
    }

    private static void modifyAndDisplay(List<String> names, Modifier modifier) {
        List<String> modifiedNames = new ArrayList<>();

        for (String name : names) {
            String modifiedName = modify(name, modifier);
            modifiedNames.add(modifiedName);
        }
        System.out.println(modifiedNames);

    }

    private static String modify(String string, Modifier modifier) {
        return modifier.modify(string);
    }


}

