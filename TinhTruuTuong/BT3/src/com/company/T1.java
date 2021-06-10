package com.company;

public class T1 extends ThueBao{
    private static int GIA_TIEN_MOT_THANG=2000000; // bien static de su dung chung cho cac doi tuong


    public T1() {
        super();
    }

    @Override
    public double tinhTien() {
        return GIA_TIEN_MOT_THANG;
    }

    @Override
    public String toString() {
        return "T1{tinh tien}"+this.tinhTien();
    }
}
