package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình tách đôi mảng số nguyên ban đầu sang hai mảng,
        // một nửa đầu sang mảng thứ nhất và nửa còn lại sang mảng thứ hai.
        // Sau đó hiển thị hai mảng đó ra màn hình.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = sc.nextInt();
        int A[]= new int[n];
        System.out.println("Nhap cac phan tu ");
        for(int i = 0 ;i < n; i++){
            A[i]= sc.nextInt();
        }
        int tr[] = new int[n];
        int ph[] = new int[n];
        int t = 0;
        int p = 0;
        for(int i = 0 ; i < n/2; i++){
            tr[t]=A[i];
            t++;
        }
        for(int i = n/2;i < n;i++){
            ph[p] = A[i];
            p++;
        }
        System.out.println("Trai:");
        for(int i = 0;i<t;i++){
            System.out.printf(tr[i]+",");
        }
        System.out.println();
        System.out.println("Phai:");
        for(int i = 0; i<p;i++){
            System.out.printf(ph[i]+",");
        }


    }
}
