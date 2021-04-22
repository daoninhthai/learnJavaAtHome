package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào các phần tử cho 1 ArrayList từ bàn phím. Sau đó tìm và hiển thị phần tử lớn nhất trong ArrayList đó.
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n , node ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n= sc.nextInt();
        for(int i = 1 ; i <= n;i++){
            System.out.println("Nhap phan tu thu "+i+" :");
            node = sc.nextInt() ;
            arrayList.add(node);
        }
        int max = arrayList.get(0);
        for(int i = 0 ; i<n;i++){
            if(arrayList.get(i)>max){
                max=arrayList.get(i);
            }
        }
        System.out.println(max);
    }
}
