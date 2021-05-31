package com.company;

public class NhanVienThoiVu extends NhanVien{
    private int gioLamViec;
    private static long LUONG_NHAN_VIEN_THOI_VU_MOT_GIO=100000;

    public NhanVienThoiVu(int gioLamViec) {
        super();
        this.gioLamViec = gioLamViec;
    }

    public NhanVienThoiVu() {
        super();
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap so gio lam viec");
        gioLamViec=sc.nextInt();
    }
    public void tinhLuong(){
        luongNV=this.gioLamViec*LUONG_NHAN_VIEN_THOI_VU_MOT_GIO;
    }

    @Override
    public String toString() {
        return super.toString()+
                "gioLamViec=" + gioLamViec ;
    }
}
