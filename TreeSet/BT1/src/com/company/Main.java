package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình khai báo 1 TreeSet chứa các phần tử là số nguyên. Sau đó tìm và hiển thị các phần tử nhỏ hơn 7 trong TreeSet đó.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(0);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(11);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(5);
        System.out.println("treeSet: ");
        System.out.println(treeSet);
        System.out.println("cach 1 dung array:");
        Iterator<Integer> iterator = treeSet.iterator();
        Integer[] array = treeSet.toArray(new Integer[0]);
        for (Integer integer : array) {
            if (integer <= 7) {
                System.out.print(integer + "\t");
            }
        }

        //cach 2
        System.out.println();
        System.out.println("cach 2 dung headSet:");
        System.out.print(treeSet.headSet(8));
    }
}
