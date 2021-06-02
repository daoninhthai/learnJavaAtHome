package com.company;

import java.util.ArrayList;

public class DanhSachHinh {
    ArrayList<HinhHoc> hinhHocArrayList;
    public DanhSachHinh(){
        super();
        hinhHocArrayList = new ArrayList<>();
        hinhHocArrayList.add(new HinhChuNhat(7,3));
        hinhHocArrayList.add((new HinhTron(3)));
        hinhHocArrayList.add(new HinhChuNhat(10,1));
    }
    public void themHinh(HinhHoc hinhHoc){
        hinhHocArrayList.add((hinhHoc));
    }
    public void hienThiDanhSachHinh(){
        for(int i = 0; i <hinhHocArrayList.size();i++){
            System.out.println(hinhHocArrayList.get(i).toString());
        }

    }
    public int demSoHinhChuNhat(){
        int soHinhChuNhat=0;
        for (HinhHoc hinhHoc : hinhHocArrayList){
            if(hinhHoc instanceof HinhChuNhat){
                soHinhChuNhat++;
            }
        }
        return soHinhChuNhat;
    }
    public void hienThiHinhChuNhatCoDienTichLonNhat(){
        double temp = 0;
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        for(HinhHoc hinhHoc :hinhHocArrayList){
            if(hinhHoc instanceof HinhChuNhat){
                if(temp < hinhHoc.tinhDienTich()){
                    temp =hinhHoc.tinhDienTich();
                    hinhChuNhat = (HinhChuNhat) hinhHoc;
                }
            }
        }
        System.out.println("Hình chữ nhật có diện tích lớn nhất là " + hinhChuNhat.toString());
    }
}


