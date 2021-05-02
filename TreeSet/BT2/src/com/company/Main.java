package com.company;


import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình tạo 1 TreeSet và nhập vào các phần tử có kiểu chuỗi cho TreeSet đó. Sau đó đảo ngược các phần tử của TreeSet và hiển thị lại TreeSet sau khi đảo ngược.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(0);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(7);

        System.out.println("treeSet sau khi duoc viet nguoc :");
        Iterator<Integer> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
