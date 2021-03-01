package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một ma trận vuông,
        // sau đó tìm và in ra phần tử có giá trị lớn nhất,
        // nhỏ nhất nằm trên đường chéo chính của ma trận vuông đó.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m , n:");
        int m = sc.nextInt();
        int n = m;
        int A[][]= new int[m][n];
        System.out.println("Nhap vao phan tu cua mang : ");
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                System.out.print("Nhap vao phan hang "+i+" cot "+j+" :");
                A[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                System.out.print(A[i][j]+"\t" );
            }
            System.out.println();
        }


        int max = A[0][0];
        int min = A[0][0];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
               if(i==j){
                   if(A[i][j]>max){
                       max =A[i][j];
                   }
                   if(A[i][j]<min){
                       min =A[i][j];
                   }
               }
            }
        }

        System.out.print("max: "+max+", min: "+min);



    }
}
