package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím.
        //Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng.
        //In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
        //Yêu cầu kỹ thuật: Chương trình phải kiểm tra n nhập vào (n >= 2 và n <= max - 1,
        // với max là số phần tử tối đa của mảng).

        int n;
        int A[]= new int[101];
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang :");
        n = sc.nextInt();

        if(n >=2 && n < 100) {
            System.out.println("Nhap cac phan tu trong mang : ");
            for (int i = 0; i < n;i++){
                A[i]= sc.nextInt();
            }
            System.out.println("mang A : ");
            for(int i = 0 ; i < n;i++){
                System.out.printf(A[i]+", ");
            }
            for(int i = 0; i < n-1 ; i++){
                for(int j = i+1 ; j <= n-1;j++){
                    if(A[i]>A[j]){
                        temp=A[i];
                        A[i]=A[j];
                        A[j]=temp;
                    }
                }
            }
            System.out.println();
            System.out.println("mang sau khi sap xep: ");
            for(int i = 0 ; i < n; i++){
                System.out.printf(A[i]+", ");
            }

        }
        else {
            System.out.println("so phan tu khong hop le");
        }
    }
}
