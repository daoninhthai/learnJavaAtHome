package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình nhập vào một chuỗi bất kỳ,
        // sau đó tách các từ có trong chuỗi đó và hiển thị mỗi từ trên 1 dòng.


        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        chuoi = sc.nextLine() ;
        for(int i = 0; i < chuoi.length(); i++){
            if(Character.isWhitespace(chuoi.charAt(i))){
                System.out.println();
            }
            else {
                System.out.print(chuoi.charAt(i));
            }
        }

    }
}
