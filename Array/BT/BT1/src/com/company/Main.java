package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập mảng n số nguyên với các giá trị ngẫu nhiên.
        // Xuất tổng, tìm giá trị nhỏ nhất và sắp xếp mảng.

        int n;
        int temp = 0;
        int tong = 0;
        int min = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang : ");
        n=sc.nextInt();
        int A[]= new int[n];
        System.out.println("Nhap mang A : ");
        for(int i = 0 ; i < n; i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Mang A :");
        for(int i = 0 ; i < n; i++){
            System.out.printf(A[i]+",");
        }

        System.out.println();
        System.out.println("Mang sau khi sap xep: ");
        for(int i = 0; i < n-1 ; i++){
            for(int j = i+1 ; j <= n-1 ; j++){
                if(A[i]>A[j]){
                    temp = A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        for(int i = 0 ; i < n; i++){
            System.out.printf(A[i]+",");
        }
        System.out.println();
        System.out.printf("phan tu nho nhat cua mang :"+A[0]);


        System.out.println();
        System.out.println("tong cua mang : ");
        for(int i = 0 ; i < n; i++){
            tong = tong + A[i];
        }
        System.out.println(tong);




    }
}
