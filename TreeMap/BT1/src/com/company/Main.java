package com.company;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào các phần tử có khóa kiểu số nguyên cho TreeMap. Sau đó tìm khóa lớn nhất trong các phần tử đó mà có giá trị nhỏ hơn hoặc bằng với 1 khóa bất kỳ được đưa ra.
        //sau do tim khoa nho nhat
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"yeu");
        treeMap.put(0,"anh");
        treeMap.put(2,"em");
        treeMap.put(6,"lon");
        treeMap.put(4,"vai");
        System.out.println("Khóa cần tìm <= trần : " + treeMap.floorKey(10));
        System.out.println("Khóa cần tìm >= sàn  : " + treeMap.ceilingKey(5));

    }
}
