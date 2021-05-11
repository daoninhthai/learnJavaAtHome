package com.company;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String queQuan;
    Scanner sc = new Scanner(System.in);
    public Nguoi(){
        super();
    }
    public Nguoi(String hoTen, String queQuan) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void nhapThongTinSV(){
        System.out.println("Nhap ten sv");
        hoTen=sc.nextLine();
        System.out.println("Nhap que quan");
        queQuan=sc.nextLine();
    }
    public void hienThiThongTinSV(){
        System.out.println("ten sinh vien:"+hoTen);
        System.out.println("que quan:"+queQuan);

    }

}
