package com.company;

public class NhanVienToanThoiGian  extends NhanVien{
    private int soNgayLamThem;
    private String loaiNhanVien;
    private static long LUONG_NHAN_VIEN_LA_SEP =20000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG=10000000;
    private static long LUONG_LAM_THEM=800000;

    public NhanVienToanThoiGian(int soNgayLamThem, String loaiNhanVien) {
        super();
        this.soNgayLamThem = soNgayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }

    public NhanVienToanThoiGian() {
        super();
    }

    public int getSoNgayLamThem() {
        return soNgayLamThem;
    }

    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("nhap loai nhan vien(1-sep,2-NVThuong)");
        loaiNhanVien= sc.next();
        if(loaiNhanVien.equals("1")){
            loaiNhanVien="Sep";
        }
        if(loaiNhanVien.equals("2")){
            loaiNhanVien="Nhan vien binh thuong";
        }
        System.out.println("Nhap so ngay lam them");
        soNgayLamThem=sc.nextInt();
    }
    public void tinhLuong(){
        super.tinhLuong();
        if(loaiNhanVien.equals("Sep")){
            luongNV=LUONG_NHAN_VIEN_LA_SEP+LUONG_LAM_THEM*this.soNgayLamThem;
        }
        if(loaiNhanVien.equals("Nhan vien binh thuong")){
            luongNV=LUONG_NHAN_VIEN_BINH_THUONG+LUONG_LAM_THEM*this.soNgayLamThem;
        }
    }

    @Override
    public String toString() {
        return super.toString()+

                ", soNgayLamThem=" + soNgayLamThem +
                ", loaiNhanVien='" + loaiNhanVien + '\'' +
                '}';
    }
}
