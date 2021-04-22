package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào các phần tử là số double cho 1 ArrayList. Sau đó tính và hiển thị tổng của các phần tử đó ra.
        int n ;
        double node;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<>();
        System.out.println("Nhap n :");
        n = sc.nextInt();
        for(int i = 1 ; i <= n; i++){
            System.out.println("Nhap phan tu thu "+i+" :");
            node = sc.nextDouble();
            arrayList.add(node);
        }
        int tong = 0;
        Iterator<Double> iterator=arrayList.iterator();
        while(iterator.hasNext()){

                tong+=iterator.next();

        }
        System.out.println("tong = "+tong);

    }
}
