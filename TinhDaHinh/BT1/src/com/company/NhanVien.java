package com.company;

import java.util.Scanner;

public class NhanVien {
    private String tenNV;
    protected long luongNV;
    Scanner sc = new Scanner(System.in);

    public NhanVien(String tenNV, long luongNV) {
        super();
        this.tenNV = tenNV;
        this.luongNV = luongNV;
    }

    public NhanVien() {
        super();
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public long getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(long luongNV) {
        this.luongNV = luongNV;
    }
    public void nhapThongTin(){
        System.out.println("Nhap ten nhan vien:");
        tenNV=sc.nextLine();

    }
    public void tinhLuong(){

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "tenNV='" + tenNV + '\'' +
                ", luongNV=" + luongNV +
                '}';
    }



}

