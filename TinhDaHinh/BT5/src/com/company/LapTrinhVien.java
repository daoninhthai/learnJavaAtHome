package com.company;

public class LapTrinhVien  extends NhanVien{
    private int soGioOverTime;

    public LapTrinhVien() {
        super();
    }

    public LapTrinhVien(int soGioOverTime) {
        super();
        this.soGioOverTime = soGioOverTime;
    }

    public int getSoGioOverTime() {
        return soGioOverTime;
    }

    public void setSoGioOverTime(int soGioOverTime) {
        this.soGioOverTime = soGioOverTime;
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap so gio lam them :");
        soGioOverTime = sc.nextInt();
    }
    @Override
    public long tinhTienLuong(){
        return (this.luongCoBan+this.soGioOverTime*200000);
    }

    @Override
    public String toString() {
        return super.toString()+
                "soGioOverTime=" + soGioOverTime
                ;
    }
}
