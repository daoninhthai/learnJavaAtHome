package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình khai báo 1 TreeSet và nhập vào các phần tử là số nguyên cho TreeSet đó. Sau đó tìm phần tử nhỏ nhất trong TreeSet và xóa phần tử đó ra khỏi TreeSet.
        TreeSet<Integer> treeSetInteger = new TreeSet<>();

        treeSetInteger.add(10);
        treeSetInteger.add(9);
        treeSetInteger.add(20);
        treeSetInteger.add(22);
        treeSetInteger.add(11);
        treeSetInteger.add(27);


        int f = treeSetInteger.first();
        treeSetInteger.remove(f);
        System.out.print(treeSetInteger);
    }
}
