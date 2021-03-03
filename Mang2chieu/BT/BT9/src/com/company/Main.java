package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  //histogram
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap  m,n");
        int m = sc.nextInt();
        System.out.println("Nhap L");
        int L=sc.nextInt();
        int n = m;
        int A[][] = new int[m][n];
        int rk[]= new int[L];


//        System.out.println("Nhap mang A");
//        for(int i = 0 ; i < m; i++){
//            for(int j = 0; j < n ;j++){
//                System.out.print("Nhap A["+i+"]["+j+"] :");
//                A[i][j]= sc.nextInt();
//            }
//            System.out.println();
//        }
        //mang rk

        for(int i = 0 ; i < L;i++){
            rk[i]=rk[i+1]-1;

            System.out.print(rk[i]);
        }

//        for(int i = 0 ; i < m; i++){
//            for(int j = 0; j < n ;j++){
//
//            }
//
//        }



//
//        for(int i = 0; i < L;i++){
//            System.out.print("rk"+i+",");
//        }
    }
}
