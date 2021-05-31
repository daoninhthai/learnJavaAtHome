package com.company;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;
    Scanner sc = new Scanner(System.in);
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
    public void nhapThongTinXe(){
        super.nhapThongTinXe();
        System.out.println("Nhap noi den:");
        noiDen = sc.nextLine();
        System.out.println("Nhap so ngay di duoc");
        soNgayDiDuoc = sc.nextInt();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                ", sc=" + sc +
                '}';
    }
}
