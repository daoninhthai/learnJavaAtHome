package com.company;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình tạo 1 lớp để lưu trữ chiều dài và chiều rộng của 1 hình chữ nhật và tính chu vi, diện tích hình chữ nhật đó.
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.nhap();
        hinhChuNhat.chuVi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
        hinhChuNhat.dienTich(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong) ;
        hinhChuNhat.hienThi(hinhChuNhat.chuVi, hinhChuNhat.dienTich);
    }
}
