package com.company;

import java.util.Scanner;

public class HoSoHocSinh {
    private String lop;
    private Nguoi nguoi;
    Scanner sc = new Scanner(System.in);

    public HoSoHocSinh(String lop, Nguoi nguoi) {
        this.lop = lop;
        this.nguoi = nguoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public HoSoHocSinh() {
        super();
    }

    public void nhapThongTinHS(){
        nguoi= new Nguoi();
        nguoi.nhapThongTinSV();
        System.out.println("nhap lop:");
        lop=sc.nextLine();
    }
    public void hienThiThongTinLop(){
        nguoi.hienThiThongTinSV();
        System.out.println("lop"+lop);
    }

}
