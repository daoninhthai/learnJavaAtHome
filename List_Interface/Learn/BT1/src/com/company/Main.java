package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // hiển thị các phần tử có trong list
        List<String> listString = new LinkedList<>();
        listString.add("one");
        listString.add("two");
        listString.add("three");
        listString.add("four");
        listString.add("five");
        // in ra list dung get()
        for (int i = 0; i<listString.size();i++){
            System.out.print(listString.get(i)+",");
        }


    }
}
