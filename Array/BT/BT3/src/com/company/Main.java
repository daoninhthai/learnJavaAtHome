package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n ;


	    Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu : ");
        n = sc.nextInt() ;

        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang : ");
        for(int i = 0 ; i < n;i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Mang vua nhap : ");
        for(int i = 0 ; i < n ; i++){
            System.out.printf(A[i]+" , ");
        }
        //sap xep
        int temp = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j <= n-1;j++){
                if(A[i]>A[j]){
                    temp = A[i];
                    A[i]=A[j];
                    A[j]= temp;
                }
            }
        }
        int d = 0;
        int c = n-1;
        System.out.println("Mang sau khi sap xep : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(A[i]+" , ");
        }
        //tim kiem
        System.out.println("Nhap vao so nguyen k :");
        int k = sc.nextInt();

        while(d<=c){
            int l = (d+c)/2;
            if(A[l]==k){
                System.out.printf("tim thay "+k+" tai vi tri "+ l);
                return;
            }
            else if(A[l]<k){
                d = l+1;

            }
            else {
                c = l-1;

            }

        }
        System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");

    }

}

