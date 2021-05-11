package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class NhanVien {
    String hoTen,sdt;
    String ketqua;
    HashMap<String,String> nhanVien = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("nhap so nhan vien : ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int id=i+1;
            System.out.println("Nhap ten nhan vien thu "+id+" :");
            hoTen = sc.next();
            System.out.println("Nhap so dien thoai :");
            sdt = sc.next();
            nhanVien.put(sdt,hoTen);
        }

    }
    public String timKiemNV(String hoTen){



        for(String i:nhanVien.values()){
            if(hoTen.equals(i)){
              ketqua="co nhan vien";
            }
            else {
               ketqua="khong co nhan vien";
            }
        }
        return ketqua;

    }


}
