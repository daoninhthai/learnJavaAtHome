package com.company;

public class MiengDatHinhChuNhat extends MiengDat{
    private double chieuDai, chieuRong;

    public MiengDatHinhChuNhat(double chieuDai, double chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public MiengDatHinhChuNhat() {
        super();
    }
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap chieu dai mieng dat hinh chu nhat:");
        chieuDai= sc.nextDouble();
        System.out.println("Nhap chieu rong cua hinh chu nhat :");
        chieuRong=sc.nextDouble();
    }
    public double tinhDienTich(){
        super.tinhDienTich();
        return this.chieuDai*this.chieuRong;
    }


    @Override
    public String toString() {
        return  super.toString()+
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong
               ;
    }
}
