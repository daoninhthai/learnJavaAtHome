package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> listString = new LinkedList<>();
        //khai bao listIterator
        ListIterator<String> listIterator = null;

        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");

        listIterator = listString.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+",");
        }


    }
}
