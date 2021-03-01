package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một mảng các số nguyên bất kỳ và sau đó hiển thị
        // các phần tử chia hết cho 5 trong mảng đó.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang :");
        for(int i = 0 ; i < n; i++){
            A[i] = sc.nextInt();
        }
        int newArray[] = new int[n];
        int j = 0;
        for(int i = 0 ; i < n ;i++){
            if(A[i] % 5 == 0){
                newArray[j] = A[i];
                j++;
            }

        }
        if(j==0){
            System.out.println("khong co phan tu chia het cho 5");
        }
        else {
            System.out.println("Mang moi: ");
            for(int i = 0 ; i < j; i++){
                System.out.printf(newArray[i]+",");
            }
        }

    }
}
