package com.company;

import java.util.Scanner;

public class MiengDat {
    private String maSo;
    protected double donGia;
    Scanner sc = new Scanner(System.in);
    public MiengDat(String maSo, double donGia) {
        this.maSo = maSo;
        this.donGia = donGia;
    }

    public MiengDat() {
        super();
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double tinhDienTich(){
        return 0;
    }
    public double tinhTien(){
        return donGia*this.tinhDienTich();
    }


    public void nhapThongTin(){
        System.out.println("Nhap ma so mieng dat :");
        maSo= sc.nextLine();
    }

    @Override
    public String toString() {
        return "MiengDat{" +
                "Ma So='" + maSo + '\'' +
                ", Don Gia=" + donGia +
                ", Dien Tich ="+this.tinhDienTich()+
                ", Tong Tien ="+this.tinhTien()+
                '}';
    }
}
