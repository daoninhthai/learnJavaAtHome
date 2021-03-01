package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều, sau đó tìm
        // và hiển thị phần tử có giá trị lớn nhất trong ma trận đó.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang :");
        int m = sc.nextInt();
        System.out.println("Nhap so cot :");
        int n = sc.nextInt();
        System.out.println("Nhap mang");
        int A[][] = new int[m][n];
        for(int i = 0 ; i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.println("Nhap phan tu dong "+i+" cot "+j+" : ");
                A[i][j]=sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0 ; i < m;i++){
            for(int j = 0;j < n;j++){
                if(A[i][j]>max ){
                    max=A[i][j];
                }
            }
        }
        System.out.println("max : "+max);

    }
}
