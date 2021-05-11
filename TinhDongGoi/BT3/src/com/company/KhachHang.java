package com.company;

import java.util.Scanner;

public class KhachHang {
    private String tenKH;
    private String soNha;
    private String maSoCongTo;
    Scanner sc = new Scanner(System.in);
    public KhachHang() {
        super();
    }

    public KhachHang(String tenKH, String soNha, String maSoCongTo) {
        this.tenKH = tenKH;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }


    public void nhapThongTinKH(){
        System.out.println("Nhap ten khach hang :");
        tenKH = sc.nextLine();
        System.out.println("Nhap so nha");
        soNha = sc.nextLine();
        System.out.println("nhap ma so cong to");
        maSoCongTo = sc.nextLine();

    }

    public void hienThiThongTin() {
        System.out.println( "KhachHang{" +
                "tenKH='" + tenKH + '\'' +
                ", soNha='" + soNha + '\'' +
                ", maSoCongTo='" + maSoCongTo + '\'' +
                '}');
    }
}
