package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//tim va dem so lan xuat hien cua ky tu a
        String chuoi;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        chuoi = sc.nextLine() ;
        for(int i = 0; i<chuoi.length();i++){
            if(chuoi.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
