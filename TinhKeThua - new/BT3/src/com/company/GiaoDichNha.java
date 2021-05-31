package com.company;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    public int number;
    private double tinhTien;

    public GiaoDichNha(String maGD, String ngayGD, double donGia, double dienTich, String loaiNha, int number,double tinhTien) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.number = number;
        this.tinhTien = tinhTien;
    }

    public GiaoDichNha() {
        super();
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTinhTien() {
        return tinhTien;
    }

    public void setTinhTien(double tinhTien) {
        this.tinhTien = tinhTien;
    }

    public String loaiNha(int x){
        switch (number) {
            case 1 -> loaiNha = "cao cap";
            case 2 -> loaiNha = "thuong";
            default -> System.out.println("khong hop le");
        }
        return loaiNha;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap loai nha(1-cao cap ,2-thuong):");
        number =sc.nextInt();
    }

    public double tinhTien(){
        if(loaiNha.equals("cao cap")){
            tinhTien = donGia*dienTich;
        }
        else {
            tinhTien = donGia*dienTich*0.9;
        }
        return tinhTien;
    }
    @Override
    public String toString() {
        return super.toString()+
                ",loaiNha='" + loaiNha(number) + ",tinh tien ='" + tinhTien
                ;
    }
}
