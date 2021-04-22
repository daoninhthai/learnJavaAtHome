package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list = new LinkedList<String>();
        List<String> list2 = new LinkedList<String>();

        Collections.addAll(list, colors);
        Collections.addAll(list2, colors2);

        Iterator<String> iterator = list.iterator();
        Iterator<String> iterator2 = list2.iterator();


        ListIterator<String> listIterator = list.listIterator();
        //chu hoa
        while (listIterator.hasNext()){
            String str = listIterator.next();
           listIterator.set(str.toUpperCase());

        }



        System.out.println("----List 1----");
        while (iterator.hasNext()){

            System.out.print(iterator.next()+",");

        }


        System.out.println();
        System.out.println("----List 2----");
        while (iterator2.hasNext()){
            System.out.print(iterator2.next()+",");
        }
    }
}
