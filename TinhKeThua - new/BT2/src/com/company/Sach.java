package com.company;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    Scanner sc = new Scanner(System.in);

    public Sach(){
        super();
    }

    public Sach(String maSach, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;

    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }



    public void nhapThongTin(){
        System.out.println("Nhap ma sach:");
        maSach = sc.nextLine();
        System.out.println("Nhap ten nha xuat ban:");
        nhaXuatBan = sc.nextLine();
        System.out.println("Nhap so luong:");
        soLuong = sc.nextInt();
        System.out.println("Nhap don gia:");
        donGia = sc.nextDouble() ;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", donGia='" + donGia + '\'' +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +

                '}';
    }
}
