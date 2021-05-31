package com.company;

import java.util.Scanner;

public class ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapThongTinXe(){
        System.out.println("Nhap ma so chuyen:");
        maSoChuyen= sc.nextLine();
        System.out.println("nhap ten tai xe:");
        hoTenTaiXe = sc.nextLine();
        System.out.println("Nhap so xe:");
        soXe= sc.next();
        System.out.println("Nhap doanh thu:");
        doanhThu = sc.nextDouble();



    }

}
