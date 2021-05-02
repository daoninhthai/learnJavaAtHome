package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình tạo 1 mảng và nhập các phần tử cho mảng. Sau đó tách các phần tử trong mảng đó thành 1 HashSet chứa các phần tử không trùng nhau
        Integer[] array ={1,2,3,4,3,1,5};
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();


        for (Integer integer : array) {
            if (hashSet1.contains(integer)) {
                hashSet2.add(integer);
            } else {
                hashSet1.add(integer);
            }
        }
        System.out.println(hashSet1);
    }
}
