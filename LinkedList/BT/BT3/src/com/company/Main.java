package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình xây dựng danh sách liên kết lưu trữ dãy gồm n phần tử là số nguyên dương (n nhập vào từ bàn phím). Sau đó đảo ngược thứ tự các phần tử của danh sách và xuất danh sách liên kết đảo ngược ra màn hình.
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n,node ;

        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            System.out.println("Nhap phan tu "+ i);
            node = sc.nextInt();
            linkedList.add(node);
        }
        System.out.println("danh sach ban dau:");
        for(int i = 0 ; i < n;i++){
            System.out.print(linkedList.get(i)+"\t");
        }
        System.out.println("danh sach sau khi dao nguoc la:");
        Collections.reverse(linkedList);
        for(int i = 0 ; i < n;i++){
            System.out.print(linkedList.get(i)+"\t");
        }
    }
}
