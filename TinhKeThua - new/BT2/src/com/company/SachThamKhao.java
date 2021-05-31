package com.company;

public class SachThamKhao extends Sach {
    private double thue ;
    public SachThamKhao() {
       super();
    }
    public SachThamKhao(String maSach, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }



    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap so tien thue: ");
        thue = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", thue=" + thue +
                '}';
    }
}
