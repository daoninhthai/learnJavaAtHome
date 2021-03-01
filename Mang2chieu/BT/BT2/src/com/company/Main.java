package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một ma trận vuông bậc n và sau đó tính tổng các phần
        // tử nằm trên đường chéo chính của ma trận vuông đó
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int m = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int n = sc.nextInt();
        int A[][]= new int[m][n];
        System.out.println("Nhap phan tu cho mang :");
        for(int i = 0 ; i < m;i++){
            for(int j = 0 ; j < n; j++){
                System.out.println("Nhap hang "+i+" cot "+j+" :");
                A[i][j]= sc.nextInt();
            }
        }
        for(int i = 0 ; i < m;i++){
            for(int j = 0 ; j < n; j++){
                System.out.print(A[i][j]+"\t");

            }
            System.out.println();
        }
        int tong = 0;
        for(int i = 0 ; i < m;i++){
            for(int j = 0 ; j < n; j++){
               if(i==j){
                   tong+=A[i][j];
               }
            }
        }
        System.out.println("tong :"+tong );
    }
}
