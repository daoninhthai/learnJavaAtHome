package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // iterator
        //dung vong for cai tien de in ra list
        List<String> listString = new LinkedList<>();
        //khai bao iterator
        Iterator<String>  iterator = null;
        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");

        iterator = listString.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }

    }
}
