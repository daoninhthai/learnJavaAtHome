package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(("Nhap n"));
        n = sc. nextInt();

        int A[]  = new int[n];
        System.out.println("Nhap cac phan tu vao mang A");
        for(int i = 0 ; i < n ;i++ ){
            A[i]= sc.nextInt();
        }
        for(int i = 0 ; i < n/2; i++){
            if(A[i] == A[n-i-1]){
                System.out.println("day la day doi xung");
                break;
            }
            else {
                System.out.println("ko phai day doi xung");
                break;
            }
        }
    }
}
