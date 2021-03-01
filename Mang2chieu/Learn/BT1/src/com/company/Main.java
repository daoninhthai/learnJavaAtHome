package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình thực hiện các công việc sau:
        //
        //Nhập m, n là số dòng và 2 số cột của 2 ma trận 2 chiều A và B từ bàn phím.
        //Nhập giá trị cho các phần tử cho 2 ma trận này.
        //Tính và in ra màn hình ma trận C là tổng của 2 ma trận này.
        //Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m");
        int m = sc.nextInt();
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int A[][]= new int[m][n];
        int B[][]= new int[m][n];
        int C[][]= new int[m][n];

        //mang a
        System.out.println("Nhap so phan tu cua mang A");
        for(int i = 0; i < m ;i++ ){
            for(int j = 0; j < n;j++){
                System.out.println("Nhap dong "+i+" cot "+j+" :");
                A[i][j] = sc.nextInt();
            }
        }

        //mang b
        System.out.println("Nhap so phan tu cua mang B");
        for(int i = 0; i < m ;i++ ){
            for(int j = 0; j < n;j++){
                System.out.println("Nhap dong "+i+" cot "+j+" :");
                B[i][j] = sc.nextInt();
            }
        }


        //hien thi mang a va mang b
        System.out.println("mang A vua nhap :");
        for(int i = 0; i < m ;i++ ){
            for(int j = 0; j < n;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("mang B vua nhap :");
        for(int i = 0; i < m ;i++ ){
            for(int j = 0; j < n;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.print("\n");
        }

        //mang c= mang a + mang b

        for(int i = 0; i < m ;i++ ){
            for(int j = 0; j < n;j++){

                C[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println("mang C = mangA + mang B :");
        for(int i = 0; i < m ;i++ ){
            for(int j = 0; j < n;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }
}
