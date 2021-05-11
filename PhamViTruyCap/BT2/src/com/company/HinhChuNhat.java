package com.company;

import java.util.Scanner;

public class HinhChuNhat {
    double chieuDai , chieuRong, dienTich,chuVi;
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("nhap chieu dai :");
        chieuDai = sc.nextDouble();
        System.out.println("nhap chieu rong :");
        chieuRong = sc.nextDouble();
    }
    public double chuVi(double chieuDai , double chieuRong){
        chuVi= (chieuDai+chieuRong)/2;
        return chuVi;
    }
    public double dienTich(double chieuDai , double chieuRong){
        dienTich = chieuDai*chieuRong;
        return dienTich;
    }
    public void hienThi(double chuVi , double dienTich){
        System.out.println("chu vi :"+chuVi);
        System.out.println("dien tich :"+dienTich);
    }

}
