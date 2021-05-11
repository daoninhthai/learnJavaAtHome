package com.company;

import java.util.Scanner;

public class BienLai {
    private int soTienPhaiTra;
    private int chiSoCu;
    private int chiSoMoi;
    private KhachHang khachHang;
    Scanner sc = new Scanner(System.in);
    public BienLai() {
        super();
    }
    public BienLai(int soTienPhaiTra, int chiSoCu, int chiSoMoi) {
        this.soTienPhaiTra = soTienPhaiTra;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }



    public int getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(int soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public void nhapThongTinBienLai(){
        khachHang = new KhachHang();
        khachHang.nhapThongTinKH();
        do{
            System.out.println("Nhap chi so cu:");
            chiSoCu = sc.nextInt();
            System.out.println("Nhap chi so moi");
            chiSoMoi = sc.nextInt();
        }while (chiSoMoi<chiSoCu);{
            soTienPhaiTra= (chiSoMoi-chiSoCu)*750;
        }

    }
   public void hienThongTinBienLai(){
        khachHang.hienThiThongTin();
        System.out.println("so tien phai tra la "+soTienPhaiTra);
   }

}
