package com.company;

public class GiaoDichDat extends GiaoDich{
     private String loaiDat;
    private double tinhTien;
    public GiaoDichDat() {
        super();
    }

    public GiaoDichDat(String maGD, String ngayGD, double donGia, double dienTich, String loaiDat,double tinhTien) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
        this.tinhTien=tinhTien;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getTinhTien() {
        return tinhTien;
    }

    public void setTinhTien(double tinhTien) {
        this.tinhTien = tinhTien;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap loai dat(A/B/C):");
        loaiDat = sc.next();
    }
    public double tinhTien(){
        if(loaiDat.equals("A")){
            tinhTien = donGia*dienTich*1.5;
        }
        else {
            tinhTien = donGia*dienTich;
        }
        return tinhTien;
    }

    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + this.loaiDat +", tinh tien "+this.tinhTien;
    }
}
