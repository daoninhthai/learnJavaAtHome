package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Một ma trận được gọi là ma trận thưa nếu số phần tử có giá trị bằng 0
        // nhiều hơn số phần tử khác 0. Viết chương trình thực hiện các công việc sau:
        //
        //Nhập m, n là số dòng và số cột của ma trận hai chiều A từ bàn phím.
        //Nhập giá trị các phần tử của ma trận A từ bàn phím.
        //Kiểm tra và thông báo lên màn hình ma trận vừa nhập là ma trận thưa hay ma trận
        // không thưa.
        //Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong m: ");
        int m = sc.nextInt();
        System.out.println("Nhap so cot n: ");
        int n = sc.nextInt();
        int A[][] = new int[m][n];
        //nhap gia tri cua mang
        System.out.println("Nhap cac gia tri cua mang A");
        for(int i = 0 ; i < m;i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print("Nhap phan tu dong "+i+" cot "+j+" :");
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        //xuat mang
        System.out.println("Nhap cac gia tri cua mang A");
        for(int i = 0 ; i < m;i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(A[i][j] +"\t");

            }
            System.out.println();
        }
        int count = 0;


        for(int i = 0 ; i < m;i++){
            for(int j = 0 ; j < n ;j++){
                if(A[i][j]==0){
                    count++;
                }

            }

        }
        if(count>(m*n)/2){
            System.out.println("mang nay la mang thưa");
        }
        else {
            System.out.println("mang nay khong thưa");
        }


    }
}
