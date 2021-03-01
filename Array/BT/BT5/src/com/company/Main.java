package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình thực hiện các công việc sau:
        // Nhập liệu cho mảng có n phần tử nguyên (n > 0) từ bàn phím.
        // Sau đó tính và in ra màn hình số lượng số nguyên lẻ,
        // số lượng số nguyên chẵn trong mảng đã nhập.
        //
        //Yêu cầu kỹ thuật: Chương trình phải kiểm tra n nhập vào:
        // nếu n <= 0 thì cho nhập lại số phần tử cho đến khi thỏa mãn điều kiện.


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu n");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Nhap cac phan tu vao chuoi");
        for(int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        int chan=0;
        int le=0;
        for(int i = 0 ;i<n; i++){
            if(array[i]%2==0){
                chan++;
            }
            if(array[i]%2 != 0){
                le++;
            }
        }

        System.out.printf("co "+chan+" phan tu chan");
        System.out.println();
        System.out.printf("co "+le+" phan tu le");

    }
}
