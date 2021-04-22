package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        List<String> listWord = new LinkedList<>();
        listString.add("a");
        listString.add("c");
        listString.add("d");
        listString.add("e");
        listWord.add("f");
        listWord.add("g");
        listWord.add("b");
        listWord.add("h");
        listWord.add("i");
        listString.addAll(listWord);//them vao cuoi
        //neu muon them vao vi tri bat ky
        //listString.addAll(vitri,listWord);
        for(String s : listString){
            System.out.print(s+",");
        }
    }
}
