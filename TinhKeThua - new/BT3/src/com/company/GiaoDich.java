package com.company;

import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private String ngayGD;
    public double donGia;
    public double dienTich;
    Scanner sc = new Scanner(System.in);
    public GiaoDich() {
        super();
    }

    public GiaoDich(String maGD, String ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void nhapThongTin(){
        System.out.println("Nhap ma giao dich :");
        maGD = sc.nextLine();
        System.out.println("Nhap don gia : ");
        donGia = sc.nextDouble();
        System.out.println("Nhap dien tich :");
        dienTich = sc.nextDouble();

    }

    @Override
    public String toString() {
        return "Mã giao dịch: " + this.maGD + ", ngày giao dịch: " + this.ngayGD +
                ", đơn giá: " + this.donGia + ", diện tích: " + this.dienTich;
    }
}



