package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào 1 chuỗi bất kỳ từ bàn phím và hiển thị
        // các ký tự có trong chuỗi đó ra màn hình.
        // Mỗi ký tự phải được in trên 1 dòng.


        String chuoi ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        chuoi = sc.nextLine();
        for(int i = 0 ; i < chuoi.length() ; i++){
            System.out.println(chuoi.charAt(i));
        }
    }
}
