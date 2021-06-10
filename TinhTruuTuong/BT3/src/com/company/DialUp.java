package com.company;

public class DialUp extends ThueBao{
    private int THUE_BAO_HANG_THANG_DIAL_UP =30000;
    private int GIA_TIEN_MOT_PHUT=30;
    private int soPhutTruyCap;

    public DialUp(int soPhutTruyCap) {
        super();
        this.soPhutTruyCap = soPhutTruyCap;
    }

    public DialUp() {
        super();
    }

    public int getSoPhutTruyCap() {
        return soPhutTruyCap;
    }

    public void setSoPhutTruyCap(int soPhutTruyCap) {
        this.soPhutTruyCap = soPhutTruyCap;
    }

    public double tinhTien(){
        return THUE_BAO_HANG_THANG_DIAL_UP+GIA_TIEN_MOT_PHUT*this.soPhutTruyCap;
    }

    @Override
    public String toString() {
        return
                "THUE_BAO_HANG_THANG_DIAL_UP=" + THUE_BAO_HANG_THANG_DIAL_UP +
                ", GIA_TIEN_MOT_PHUT=" + GIA_TIEN_MOT_PHUT +
                ", soPhutTruyCap=" + soPhutTruyCap +
                ", tinh tien"+this.tinhTien();
    }
}
