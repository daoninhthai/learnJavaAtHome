package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một ma trận.
        // Sau đó tìm và in ra phần tử chẵn dương nhỏ nhất trong ma trận.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m,n");
        int m = sc.nextInt();
        int n = m;
        System.out.println("Nhap mang A:");
        int A[][] = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print("Nhap A["+i+"]["+j+"] : ");
                A[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        // xuat mang
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(A[i][j]+"\t");

            }
            System.out.println();
        }
        int min =A[0][0];
        int dong=0;
        int cot =0;
        for(int i = 0 ; i < m ;i++){
            for(int j = 0;j < n; j++){
                if(A[i][j]<min && A[i][j]%2 == 0 && A[i][j]>=0){
                    min = A[i][j];
                    dong = i;
                    cot = j;
                }
            }
        }
        System.out.println("min :"+min+" ,vi tri dong :"+dong+" vi tri cot :"+cot);
    }
}
