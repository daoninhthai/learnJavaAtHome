package com.company;

public class ADSL extends ThueBao{
    private static int GIA_THUE_BAO_ADSL=50000;
    private static int GIA_THEO_MOT_PHUT_ADSL=50;
    private int soPhutTruyCap;

    public ADSL(int soPhutTruyCap) {
        super();
        this.soPhutTruyCap = soPhutTruyCap;
    }

    public ADSL() {
        super();
    }

    public int getSoPhutTruyCap() {
        return soPhutTruyCap;
    }

    public void setSoPhutTruyCap(int soPhutTruyCap) {
        this.soPhutTruyCap = soPhutTruyCap;
    }

    @Override
    public double tinhTien() {
        return GIA_THUE_BAO_ADSL+GIA_THEO_MOT_PHUT_ADSL*this.soPhutTruyCap;
    }

    @Override
    public String toString() {
        return "ADSL{" +
                "soPhutTruyCap=" + soPhutTruyCap +
                "tinh tien"+this.tinhTien();
    }
}
