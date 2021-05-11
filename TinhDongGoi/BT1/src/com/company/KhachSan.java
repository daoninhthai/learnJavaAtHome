package com.company;


import java.util.Scanner;

public class KhachSan {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoi nguoi;
    Scanner sc = new Scanner(System.in);
    public KhachSan(){
        super();
    }

    public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy(){
        nguoi = new Nguoi();
        nguoi.nhapThongTinKhachTro();
        System.out.println("nhap so ngay tro");
        soNgayTro = sc.nextInt();
        System.out.println("Nhap loai phong: ");
        loaiPhong = sc.next();
        System.out.println("Nhap gia phong 1 ngay: ");
        giaPhong= sc.nextDouble();


    }
    public void hienThiThongTinCanQuanLy(){
        nguoi.hienThiThongTinKhachTro();
        System.out.println("So ngay tro :"+soNgayTro);
        System.out.println("Loai phong :"+loaiPhong);
        System.out.println("Gia phong :"+giaPhong);

    }

    public double tinhTien(){
        return giaPhong*soNgayTro;
    }

}
