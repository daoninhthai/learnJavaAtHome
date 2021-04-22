package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Viết chương trình nhập vào một ma trận số thực.
        // Sau đó xóa dòng có tổng lớn nhất của ma trận đó.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap  m,n");
        int m = sc.nextInt();


        int n = m;
        int A[][] = new int[m][n];



        System.out.println("Nhap mang A");
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n ;j++){
                System.out.print("Nhap A["+i+"]["+j+"] :");
                A[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        int max = 0;
        int vitri =0;
        int sum=0;

        for (int j = 0; j < n; j++) {
            sum += A[0][j];
        }

        max = sum;
        for(int i = 1 ; i < m ; i++){
            sum = 0;
            for(int j = 0; j < n ;j++){
                sum += A[i][j];
            }
            if(sum>max){
                max = sum;
                vitri=i;
            }

        }
        for(int i = vitri ; i<m;i++){
            for(int j =0; j< n;j++){
                A[i][j]=A[i+1][j];
            }
            m--;
        }
        System.out.println("max:"+max);
        //mang Tong
        System.out.println("Xuat mang A");
        for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
