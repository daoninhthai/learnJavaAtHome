package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình tạo 1 lớp NhanVien lưu trữ họ tên và số điện thoại của 3 nhân viên và sau đó tìm kiếm nhân viên theo tên.
        Scanner sc= new Scanner(System.in);
        String hoTen;
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhap();
        System.out.println("Nhap ten nhan vien muon tim :");
        hoTen = sc.next();
        System.out.println(nhanVien.timKiemNV(hoTen));

    }
}
