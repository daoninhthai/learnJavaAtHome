package com.company;

public class HinhChuNhat {
    protected int chieuDai,chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {

    }

    public double tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public double tinhDienTich(){
        return chieuDai*chieuRong;
    }
}
