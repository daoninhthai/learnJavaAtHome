package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một mảng số nguyên
        // và sau đó tách các số chẵn và lẻ trong mảng đó sang hai mảng khác.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt() ;
        System.out.println("Nhap cac phan tu cua mang: ");
        int A[]= new int[n];
        int ch[]= new int[n];
        int le[]= new int[n];
        int j=0;
        int k=0;
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ;i++){
            if(A[i]%2==0){
                ch[j]=A[i];
                j++;
            }
            else {
                le[k]= A[i];
                k++;
            }
        }
        System.out.println("chan");
        for(int i =0;i<j;i++){
            System.out.printf(ch[i]+",");
        }
        System.out.println();
        System.out.println("le");
        for(int i =0;i<k;i++){
            System.out.printf(le[i]+",");
        }


    }
}
