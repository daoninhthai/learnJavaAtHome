package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một ma trận. Sau đó,
        // tìm và in ra màn hình phần tử lớn nhất và vị
        // trí của phần tử đó trong ma trận.


        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m,n");
        int m = sc.nextInt();
        int n = m;
        System.out.println("Nhap mang A");
        int A[][] = new int[m][n];
        for(int i = 0 ; i < m; i++ ){
            for(int j = 0 ; j < n ; j++){
                System.out.print("Nhap A["+i+"]["+j+"] : ");
                A[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        // xuat mang
        for(int i = 0 ; i < m; i++ ){
            for(int j = 0 ; j < n ; j++){
                System.out.print(A[i][j]+"\t");

            }
            System.out.println();
        }
        int hang = 0;
        int cot =0;

        int max=A[0][0];
        for(int i = 0 ; i < m; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(A[i][j]>max){
                    max=A[i][j];
                     hang = i;
                     cot = j;
                }

            }

        }
        System.out.println(max);
        hang=hang+1;
        cot=cot+1;
        System.out.println("hang "+hang+" cot "+cot);

    }
}
