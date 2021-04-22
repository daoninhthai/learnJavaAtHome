package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình tạo 1 ArrayList mới từ 1 ArrayList đã tồn tại có các phần tử kiểu Integer. Các phần tử trong ArrayList mới này là duy nhất (tức là không bao gồm các phần tử có giá trị giống nhau).
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n , node;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        n = sc.nextInt() ;

        for(int i = 1; i <= n;i++){
            System.out.println("nhap phan tu thu "+i+" :");
            node = sc.nextInt() ;
            arrayList.add(node);
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        for(int i :arrayList){
         if(!arrayList1.contains(i)){
             arrayList1.add(i);
         }
       }
        System.out.print(arrayList1);
    }
}
