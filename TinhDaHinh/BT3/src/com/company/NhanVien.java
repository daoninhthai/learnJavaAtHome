package com.company;

import java.util.Scanner;

public class NhanVien {
    private String hoTen;
    protected double heSoLuong;
    private double phuCap;
    Scanner sc = new Scanner(System.in);
    public NhanVien(String hoTen, double heSoLuong, double phuCap) {
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }

    public NhanVien() {
        super();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
    public void nhapThongTin(){
        System.out.println("Nhap ho ten :");
        hoTen = sc.nextLine();
        System.out.println("Nhap he so luong :");
        heSoLuong = sc.nextDouble();

    }
    public double tinhTien(){
        return 0;
    }
    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", phuCap=" + phuCap +
                ", Luong ="+this.tinhTien();
    }
}
