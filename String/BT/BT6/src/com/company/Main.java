package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình nhập vào một chuỗi bất kỳ từ bàn phím.
        // Sau đó đếm và in ra số khoảng trắng có trong chuỗi đó.

        String chuoi;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi : ");
        chuoi = sc.nextLine();
        for(int i = 0 ; i < chuoi.length();i++ ){
            if(Character.isWhitespace(chuoi.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

    }
}
