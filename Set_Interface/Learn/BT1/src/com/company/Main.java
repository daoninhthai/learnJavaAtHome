package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("a");
        listString.add("k");
        listString.add("c");
        listString.add("d");
        Set<String> setString = new TreeSet<>(listString);
        System.out.println(setString);
    }
}
