package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Viết chương trình nhập vào 1 số nguyên n và 1 chuỗi bất kỳ,
        // sau đó in ra chuỗi mới được ghép từ n lần chuỗi đó.
        // Nếu n < 2 thì xuất ra chuỗi gốc.
        //
        //Ví dụ: Nhập vào số nguyên n = 4 và chuỗi là "Hi" thì
        // chương trình sẽ hiển thị chuỗi "HiHiHiHi" ra màn hình.


        String chuoi ;
        int soLan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        chuoi = sc.nextLine();
        System.out.println("Nhap vao so lan lap");
        soLan = sc.nextInt();
        for(int i = 0; i < soLan ; i++){
            System.out.print(chuoi);
        }
    }
}
