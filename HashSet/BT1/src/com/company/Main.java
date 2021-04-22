package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình sắp xếp các phần tử của HashSet theo thứ tự tăng dần.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("orange");
        hashSet.add("banana");
        hashSet.add("apple");
        hashSet.add("pear");
        hashSet.add("guava");
        hashSet.add("mango");
        System.out.println("Cac phan tu co trong hashset truoc khi sap xep la:");
        System.out.print(hashSet);

        List<String> listString = new ArrayList<>(hashSet);
        Collections.sort(listString);
        System.out.println();
        System.out.println("Sau khi da sap xep bang list:");
        System.out.print(listString);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println();
        System.out.println("Sau khi da sap xep bang treeSet:");
        System.out.print(treeSet);
    }
}
