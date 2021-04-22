package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    //dung vong for cai tien de in ra list
        List<String> listString = new LinkedList<>();;
        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");

        for(String s : listString){
            System.out.print(s+",");
        }

    }
}
