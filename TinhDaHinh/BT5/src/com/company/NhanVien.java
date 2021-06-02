package com.company;

import java.awt.*;
import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private String soDienThoai;
    private String email;
    protected long luongCoBan;

    Scanner sc = new Scanner(System.in);

    public NhanVien(String maNV, String hoTen, String soDienThoai, String email, long luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {
        super();
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void nhapThongTin(){
        System.out.println("Nhap ma nhan vien :");
        maNV=sc.nextLine();
        System.out.println("Nhap ho ten nhan vien :");
        hoTen=sc.nextLine();
        System.out.println("Nhap so dien thoai :");
        soDienThoai=sc.nextLine();
        System.out.println("Nhap email:");
        email = sc.nextLine();
        System.out.println("Nhap luong co ban :");
        luongCoBan=sc.nextLong();

    }
    public long tinhTienLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", luongCoBan=" + luongCoBan +
                        ", Tien Luong"+ this.tinhTienLuong()
                ;
    }
}
