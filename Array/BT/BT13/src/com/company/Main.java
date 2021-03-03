package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Nhap n");
        n = sc.nextInt();
        int m=n;
        int p=n;
        int A[] = new int[n];
        int B[] = new int[m];
        int C[] = new int[p];
        // nhap mang
        System.out.println("Nhap mang A");
        for(int i = 0 ; i < n;i++){
            System.out.print("Nhap A["+i+"]:");
            A[i]= sc.nextInt();
        }
        // truyen phan tu
        for(int i = 0 ; i < n ; i++){
            if(i%4==0){
                B[i]=A[i];

            }
            else {
                C[i]=A[i];

            }
        }

        //xoa so 0
        for(int i = 0 ;i < m;i++){
            if(B[i]== 0){

            }
        }

        //xuat mang
        System.out.println("Mang A:");
        for(int i = 0 ; i < n;i++){
            System.out.print( A[i]+"\t");

        }
        System.out.println();
        System.out.println("Mang B:");
        for(int i = 0 ; i < n;i++){
            System.out.print( B[i]+"\t");

        }
        System.out.println();
        System.out.println("Mang C:");
        for(int i = 0 ; i < n;i++){
            System.out.print( C[i]+"\t");

        }
    }
}
