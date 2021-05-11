package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Để quản lý các biên lai thu tiền điện, người ta cần các thông tin như sau: Với mỗi biên lai có các thông tin về hộ sử dụng điện, chỉ số cũ, chỉ số mới, số tiền phải trả của mỗi hộ sử dụng điện. Các thông tin riêng của mỗi hộ sử dụng điện gồm họ tên chủ hộ, số nhà, mã số công tơ của hộ dân sử dụng điện.
        //
        //Hãy xây dựng lớp KhachHang để lưu trữ các thông tin riêng của mỗi hộ sử dụng điện.
        //Xây dựng lớp BienLai để quản lý việc sử dụng và thanh toán tiền điện của các hộ dân.
        //Xây dựng các phương thức nhập và hiển thị một thông tin riêng của mỗi hộ sử dụng điện.
        //Cài đặt chương trình chính thực hiện các công việc sau: Nhập vào các thông tin cho n hộ sử dụng điện (n nhập từ bàn phím), hiển thị thông tin về các biên lai đã nhập và tính tiền điện mỗi hộ dân phải trả, biết rằng tiền phải trả được tính theo công thức sau:
        ArrayList<BienLai> arrbienLai = new ArrayList<>();
        BienLai bienLai;

        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        n = sc.nextInt();
        for(int i = 0 ; i < n;i++){
            bienLai = new BienLai();
            bienLai.nhapThongTinBienLai();
            arrbienLai.add(bienLai);

        }
        System.out.println("Hien thi thong tin:");
        for(int i = 0; i < n ; i++){
            arrbienLai.get(i).hienThongTinBienLai();
        }

    }
}
