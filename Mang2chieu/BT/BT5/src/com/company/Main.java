package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Tạo ma trận vuông A bậc n (n > 0 và được nhập từ bàn phím)
        //
        // , giá trị của các phần tử được nhập từ bàn phím. Xuất ma trận vừa nhập
        // ra màn hình.
        //Kiểm tra ma trận A có phải là ma trận tam giác trên hay không?
        // Nếu phải, tính định thức (det(A)) của ma trận A. Biết rằng:
        // Ma trận tam giác trên là ma trận
        // có các phần tử nằm dưới đường chéo chính đều bằng 0.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m,n:");
        int m = sc.nextInt();
        int n = m;
        int A[][]= new int[m][n];
        //nhap mang
        System.out.println("Nhap ma tran A:");
        for(int i = 0; i < m ;i++){
            for(int j = 0; j < n; j++){
                System.out.print("Nhap A["+i+"]["+j+"] : ");
                A[i][j] = sc.nextInt();
            }
        }
        //xuat mang
        for(int i = 0; i < m ;i++){
            for(int j = 0; j < n; j++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println();
        }
        int kt=0;
        for(int i = 0; i < m ;i++){
            for(int j = 0; j < n; j++){
                if(i>j){
                    if(A[i][j]==0){
                        kt=1;
                    }
                    else {
                        kt=0;
                    }
                }
            }

        }
        if(kt==1){
            System.out.println("ma tran A la ma tran tam giac tren");
        }
        else {
            System.out.println("deo phai");
        }
        //dinh thuc
        int dinhThuc = 1;
        for(int i = 0; i < m ;i++){
            for(int j = 0; j < n; j++){
               if(i==j){
                  dinhThuc *= A[i][j];
               }
            }
        }
        System.out.println("dinh thuc ="+dinhThuc);

    }

}
