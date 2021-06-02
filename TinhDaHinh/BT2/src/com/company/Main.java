package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Một công ty kinh doanh bất động sản sở hữu n miếng đất. Mỗi miếng đất có những thông tin sau:
        //
        //Mã số (ví dụ: MS001).
        //Đơn giá một m2.
        //Ngoài ra, mỗi miếng đất tùy theo hình dạng còn có những thông tin riêng. Hiện có 3 loại hình dạng:
        //
        //Hình chữ nhật: diện tích = dài * rộng.
        //Hình thang: diện tích = (đáy lớn + đáy nhỏ) * chiều cao / 2.
        //Hình tam giác: diện tích = (đáy * chiều cao) / 2.
        //Những miếng đất hình thang và hình tam giác được công ty giảm giá 10%.
        //
        //Viết chương trình thực hiện các yêu cầu sau:
        //
        //Nhập danh sách những miếng đất của công ty.
        //Tính tổng diện tích các miếng đất.
        //Tính tổng giá tiền của các miếng đất.
        MiengDat miengDat;
        Scanner sc = new Scanner(System.in);
        ArrayList<MiengDat> miengDatArrayList = new ArrayList<>();
        int soMiengDat;
        int chonLoaiDat;
        System.out.println("Nhap so mieng dat  :");
        soMiengDat = sc.nextInt();

        for(int i = 0; i < soMiengDat;i++){
            System.out.println("Nhap thong tin mieng dat thu "+(i+1)+" :");
            System.out.println("Chon loai dat (1-hinh chu nhat),(2-hinh tam giac),(3-hinh thang");
            chonLoaiDat = sc.nextInt();
            if(chonLoaiDat==1){
                miengDat= new MiengDatHinhChuNhat();
                miengDat.nhapThongTin();
                miengDatArrayList.add(miengDat);
            }
            if(chonLoaiDat==2){
                miengDat = new MiengDatHinhTamGiac();
                miengDat.nhapThongTin();
                miengDatArrayList.add(miengDat);
            }
            if (chonLoaiDat==3){
                miengDat = new MiengDatHinhThang();
                miengDat.nhapThongTin();
                miengDatArrayList.add(miengDat);
            }
        }
        System.out.println("Thong tin cac mieng dat :");
        for(int i = 0; i < miengDatArrayList.size();i++){
            System.out.println(miengDatArrayList.get(i).toString());
        }
        double tongTien = 0 ;
        for(int i = 0; i <miengDatArrayList.size();i++ ){
            tongTien += miengDatArrayList.get(i).tinhTien();
        }
        System.out.println(tongTien);
        double tongTien1 = 0 ;
        for(MiengDat miengDat1:miengDatArrayList){
            tongTien1 += miengDat1.tinhTien();
        }
        System.out.println(tongTien1);
    }
}
