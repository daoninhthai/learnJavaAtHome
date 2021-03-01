package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một mảng số nguyên có n
        // phần tử và thực hiện các công việc sau:
        //
        //Xuất giá trị các phần tử của mảng.
        //Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
        //Đếm số phần tử là số chẵn.
        //Sắp xếp mảng tăng dần.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cua mang: ");
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        // xuat gia tri phan tu cua mang
        System.out.println("mang A:");
        for(int i = 0 ; i < n ; i++){
            System.out.print(A[i]+",");
        }
        //tim max
        int max = 0;
        int min = 0;
        for(int i = 0 ;i < n; i++){

                if(A[i]>max){
                    max=A[i];
                }
                if(A[i]<min){
                    min=A[i];
                }
        }
        //dem so phan tu chan
        int count = 0;
        for(int i = 0 ; i < n ;i++){
            if(A[i]%2 == 0){
                count++;
            }
        }
        int temp = 0 ;
        //sap xep mang tang dan
        for(int i = 0;i < n-1; i++){
            for(int j = i+1; j <= n-1;j++){
                if(A[i]>A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }

        System.out.println();
        System.out.print("max: "+max);
        System.out.println();
        System.out.print("min: "+ min);
        System.out.println();
        System.out.print("so phan tu chan: "+ count);
        System.out.println("mang A sau khi sap xep be -> lon:");
        for(int i = 0 ; i < n ; i++){
            System.out.print(A[i]+",");
        }

        //lon den be
        for(int i = 0;i < n-1; i++){
            for(int j = i+1; j <= n-1;j++){
                if(A[i]<A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("mang A sau khi sap xep lon -> be:");
        for(int i = 0 ; i < n ; i++){
            System.out.print(A[i]+",");
        }
        
    }
}
