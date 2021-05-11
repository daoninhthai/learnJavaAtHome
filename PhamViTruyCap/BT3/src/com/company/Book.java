package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Book {
     String tenSach;
     int tongSoSach, soSachDangMuon=0 , soSachConLai;
     int soQuyenSach, soDauSach;
    Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> thuVien = new HashMap<>();
    public void nhap(){
        System.out.println("Nhap tong so dau sach:");
        soDauSach =sc.nextInt();
        for(int i = 0; i< soDauSach;i++){
            System.out.println("Nhap ten sach :");
            tenSach = sc.next();

            System.out.println("Nhap so quyen : ");
            soQuyenSach =sc.nextInt();
            thuVien.put(tenSach,soQuyenSach);
        }
        System.out.print(thuVien);
    }
    public void hienThi(){

        tongSoSach = 0;
        for (Integer integer : thuVien.values()) {
            tongSoSach += integer;
        }
        System.out.println("tong so sach co trong thu vien : "+tongSoSach+" quyen");
        System.out.print("so sach muon :"+soSachDangMuon);
        System.out.print("So sach con lai:"+(tongSoSach-soSachDangMuon));
        System.out.print(thuVien);
    }
    public void muonSach(){
        System.out.print("Nhap ten sach muốn mượn :");
        String tenSachMuon = sc.next();
        for(String integer : thuVien.keySet()){
            if(tenSachMuon.equals(integer)){
                int sachmuon = thuVien.get(tenSachMuon) -1;
                thuVien.replace(tenSachMuon,sachmuon);
                soSachDangMuon+=1;
                System.out.println("Mượn thanh cong");
            }
        }
    }




}
