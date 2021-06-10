package com.company;

public class LuyThuaHaiSo {
    public static int coSo,luyThua;

    public LuyThuaHaiSo() {
    }

    public  void tinhLuyThua(int coSo, int luyThua){
        System.out.println(Math.pow(coSo,luyThua));
    }
    public static void main(String[] args) {
        LuyThuaHaiSo luyThuaHaiSo=new LuyThuaHaiSo();
        luyThuaHaiSo.tinhLuyThua(2,3);
    }
}
