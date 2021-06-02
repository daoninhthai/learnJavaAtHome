package com.company;

public class HinhTron extends HinhHoc {
    private int banKinh;

    public HinhTron(int banKinh) {
        super();
        this.banKinh = banKinh;
    }

    public HinhTron() {
        super();
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return 3.14*banKinh*banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ",Dien tich ="+tinhDienTich();
    }
}
