package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sap xep noi bot
        int n;
        int temp ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu :");
        n = sc.nextInt();
        int A[]= new int[n];
        System.out.println("Nhap cac phan tu cua mang :");
        for(int i = 0 ; i < n ; i++ ){
            A[i] = sc.nextInt() ;
        }
        System.out.println();
        System.out.println("mang sau khi nhap :");
        for(int i = 0 ; i < n ; i++ ){
            System.out.printf(A[i]+",");
        }

        System.out.println();
        System.out.println("Sap xep");
//        for(int i = 0 ; i < n-1;i++){
//            for(int j = n-1 ;j >= 1; j--){
//                if(A[j]<A[j-1]){
////                    temp = A[j-1];
////                    A[j-1]=A[j];
////                    A[j]=temp;
//
////                    temp = A[j];
////                    A[j] = A[j-1];
////                    A[j-1] = temp;
//
//
//                }
//            }
//        }
        for(int i = 0 ; i < n-1;i++){
            for(int j = 0 ;j<n-i-1; j++){
                if(A[j]>A[j+1]){
                    temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;


                }
            }
        }
        for(int i = 0 ; i < n ; i++ ){
            System.out.printf(A[i]+",");
        }


    }
}
