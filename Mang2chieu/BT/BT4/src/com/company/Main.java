package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Thực hiện phép nhân hai ma trận và tìm ma trận chuyển vị
        // của ma trận tích vừa tính được.


        //Tạo 2 ma trận hai chiều A và B có kích thước lần
        // lượt là m1 * n1 và m2 * n2 (với m1, n1, m2, n2 > 0),
        // giá trị của các phần tử được nhập từ bàn phím.
        // Xuất 2 ma trận vừa nhập ra màn hình.
        //Tính và in ra màn hình ma trận C = A * B.
        // Lưu ý: Điều kiện để ma trận A nhân được với ma trận B là số cột
        // của ma trận A bằng số dòng của ma trận B.
        //Nếu tồn tại ma trận tích C, hãy tìm ma trận D là ma
        // trận chuyển vị của ma trận C. Biết rằng: Ma trận D = CT
        // là ma trận chuyển vị của ma trận C nếu các hàng của ma trận
        // C trở thành các cột của ma trận D và ngược lại. Tức Dij = Cji.


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m mang A :");
        int mA = sc.nextInt();
        System.out.println("Nhap n mang A :");
        int nA = sc.nextInt();
        System.out.println("Nhap m mang B :");
        int mB = sc.nextInt();
        System.out.println("Nhap n mang B :");
        int nB = sc.nextInt();
        int mC=0;
        int nC=0;
        int A[][] = new int[mA][nA];
        int B[][] = new int[mB][nB];
        int C[][] = new int [mA][nB];
        //nhap mang
        System.out.println("Nhap mang A");
        for(int i = 0 ; i < mA; i++){
            for(int j = 0; j < nA;j++){
                System.out.print("Nhap  A["+i+"]["+j+"] : ");
                A[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Nhap mang B");
        for(int i = 0 ; i < mB; i++){
            for(int j = 0; j < nB;j++){
                System.out.print("Nhap B["+i+"]["+j+"] : ");
                B[i][j]=sc.nextInt();
            }
            System.out.println();
        }


        //xuat mang
        System.out.println("xuat mang A");
        for(int i = 0 ; i < mA; i++){
            for(int j = 0; j < nA;j++){
                System.out.print(A[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("xuat mang B");
        for(int i = 0 ; i < mB; i++){
            for(int j = 0; j < nB;j++){
                System.out.print(B[i][j]+"\t");

            }
            System.out.println();
        }


        //tinh ma tran C
        for(int i = 0 ; i < mA;i++ ){
            for(int j = 0;j < nB;j++){
                C[i][j]=0;
                for(int k = 0 ; k <nA;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        //hien thi ma tran c
        System.out.println("ma tran c");
        for(int i = 0 ; i < mA; i++){
            for(int j = 0; j < nB;j++){
                System.out.print(C[i][j]+"\t");

            }
            System.out.println();
        }

        int D[][] = new int[nB][mA];
        System.out.println("ma tran D - ma tran chuyen vi cua C ");
        for(int i = 0 ; i < mA;i++){
            for(int j = 0; j < nB;j++){
                D[i][j]=C[j][i];
            }

        }

        for(int i = 0 ; i < nB; i++){
            for(int j = 0; j < mA;j++){
                System.out.print(D[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
