package com.company;


import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String soCmnd;
    private String queQuan;
    Scanner sc = new Scanner(System.in);
    public Nguoi() {
        super();
    }

    public Nguoi(String hoTen, String ngaySinh, String soCmnd, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCmnd = soCmnd;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void nhapThongTinKhachTro(){
        System.out.println("Nhap ten khach hang: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
        System.out.println("Nhap so cmnd: ");
        soCmnd = sc.nextLine();
    }
    public void hienThiThongTinKhachTro(){
        System.out.println("ho ten khach tro:"+hoTen);
        System.out.println("que quan"+queQuan);
        System.out.println("so cmnd :"+soCmnd);
    }


}
