package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Viết chương trình nhập vào 10 phần tử cho 1 ArrayList chứa các số nguyên dương. Sau đó loại bỏ các phần tử trùng nhau trong ArrayList đó và hiển thị lại ArrayList này.
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n, node;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap phan tu thu " + i + " :");
            node = sc.nextInt();
            arrayList.add(node);
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for(int i :arrayList){
            if(!arrayList1.contains(i)){
                arrayList1.add(i);
            }
        }

        arrayList.clear();
        arrayList.addAll(arrayList1);
        System.out.println("ArrayList :");
        System.out.println(arrayList);

    }}
