package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Công ty du lich V quản lý thông tin của các chuyến xe. Thông tin của 2 loại chuyến xe:
        //
        //Chuyến xe nội thành: Mã số chuyến, họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
        //Chuyến xe ngoại thành: Mã số chuyến, họ tên tài xế, số xe, nơi đến, số ngày đi được, doanh thu.
        //Viết chương trình thực hiện các yêu cầu sau:
        //
        //Xây dựng các lớp có quan hệ thừa kế.
        //Nhập, xuất danh sách các chuyến xe.
        //Tính tổng doanh thu cho từng loại xe.

        ArrayList<ChuyenXeNgoaiThanh> arrNgoaiThanh = new ArrayList<>();
        ArrayList<ChuyenXeNoiThanh> arrNoiThanh = new ArrayList<>();
        int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuNoiThanh , doanhThuNgoaiThanh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so xe noi thanh:");
        soChuyenNoiThanh = sc.nextInt();
        System.out.println("Nhap so xe ngoai thanh:");
        soChuyenNgoaiThanh = sc.nextInt();

    }
}
