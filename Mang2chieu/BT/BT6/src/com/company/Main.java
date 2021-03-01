package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một ma trận có m dòng, n cột.
        // Sau đó tính trung bình của các phần
        // tử nhỏ nhất trên mỗi cột của ma trận đó.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m,n");
        int m = sc.nextInt();
        int n = m;//gia su m = n
        int A[][]= new int[m][n];
        System.out.println("Nhap mang A : ");
        for(int i = 0 ;i < m;i++){
            for(int j =0; j < n;j++){
                System.out.print("Nhap A["+i+"]["+j+"] :");
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int min =A[0][0];
        int sum=0;
        for(int i = 0 ;i < n;i++){
            for(int j = 0; j < n;j++){
                if(A[j][i]<min){
                    min=A[j][i];
                }
            }
            sum+=min;
        }
        float average = sum/n;
        System.out.println("trung binh :"+average);

    }
}
