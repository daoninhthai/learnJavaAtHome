package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình thực hiện các công việc sau:
        // Nhập một mảng có n phần tử nguyên từ bàn phím (n > 0).
        // Sau đó nhập vào số nguyên k và xóa các phần tử trong mảng có giá trị bằng k.
        //
        //Yêu cầu kỹ thuật: Chương trình phải kiểm tra n nhập vào:
        // nếu n <= 0 thì cho nhập lại số phần tử cho đến khi thỏa mãn điều kiện.

        int temp =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu: ");
        int n = sc.nextInt();
        int A[]= new int[n];
        System.out.println("Nhap vao cac phan tu: ");
        for(int i = 0 ; i < n; i++){
            A[i]= sc.nextInt();
        }
        System.out.println("Mang :");
        for(int i = 0 ; i<n ;i++){
            System.out.print(A[i]);
        }
        System.out.println("Nhap vao so nguyen k");
        int k = sc.nextInt();
        for(int i = 0 ;i<n-1;i++){
          if(A[i]==k){

              for(int j=i;j<n-1;j++){
                  A[j]=A[j+1];
              }
              --n;
          }
        }

        System.out.println("Mang sau khi xoa :");
        for(int i = 0 ; i<n ;i++){
            System.out.print(A[i]);
        }
    }
}
