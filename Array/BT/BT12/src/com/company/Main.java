package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Viết chương trình nhập  các phần tử cho mảng sao
        // cho không có phần tử nào trùng nhau.

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cua mang:");
        int A[]= new int[n];
        for(int i = 0 ; i < n; i++){
            A[i]= sc.nextInt();
        }
        int newArray[] = new int[n];
        int k = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n-1; j++){
                if(A[i] == A[j]){
                   for(int t=i;t<n-1;t++){
                       A[t]=A[t+1];
                   }
                   n--;
                }
            }
        }
        System.out.print(k);
        System.out.println("Mang moi:");
        for(int i = 0 ; i < n; i++){
            System.out.print(A[i]+",");
        }



    }
}
