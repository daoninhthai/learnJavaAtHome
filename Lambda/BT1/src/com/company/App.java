package com.company;

import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<NhanVien> nhanViens =NhanVien.danhSachNhanVien();
        System.out.println("danh sach truoc khi sap xep :");
        for(int i=0;i<nhanViens.size();i++){
            System.out.println(nhanViens.get(i).toString());
        }
        Collections.sort(nhanViens, (NhanVien person1, NhanVien person2) -> {
            return person1.getName().compareTo(person2.getName());
        });
        System.out.println("danh sach sau khi sap xep :");
        for(int i=0;i<nhanViens.size();i++){
            System.out.println(nhanViens.get(i).toString());
        }
    }


}
