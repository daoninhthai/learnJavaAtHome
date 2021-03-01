package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Một ma trận được gọi là ma trận đối xứng trước hết nó phải là ma trận vuông
        // (có số dòng và số cột bằng nhau) và các phần tử của nó đối xứng nhau
        // qua đường chéo chính. Viết chương trình nhập từ bàn phím các phần tử của
        // ma trận A, kích thước m dòng, n cột (1 <= m, n <= 5).
        // Kiểm tra xem ma trận vừa nhập có phải là ma trận đối xứng hay không?


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m , n");
        int m  = sc.nextInt();
        int n = m;
        int A[][] = new int[m][n] ;
        // nhap mang
        System.out.println("nhap vao phan tu mang :");
        for(int i = 0 ; i < m; i++ ){
            for( int j =0; j < n; j++){
                System.out.print("nhap phan tu hang "+ i +" cot "+j+" :");
                A[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }

        int kt = 0;
        for(int i = 0 ; i < m; i++ ){
            for( int j =0; j < i; j++){
               if(A[i][j]==A[j][i]){
                   kt = 1;
               }
               else {
                   kt = 0;
               }

            }

        }



        //xuat mang
        System.out.println("xuat mang: ");
        for(int i = 0 ; i < m; i++ ){
            for( int j =0; j < n; j++){

                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }


        if(kt==1){
            System.out.print("doi xung");
        }
        else{
            System.out.print("ko doi xung");
        }

    }
}
