package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình đếm số lần xuất hiện của 1
        // phần tử bất kỳ được nhập từ bàn phím.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang :");
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu bat ky");
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0 ;i < n;i++){
            if(A[i] == k){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Khong co phan tu nao = "+ k);
        }
        else {
            System.out.println("so phan tu = "+ k +" la " +count);
        }

    }
}
