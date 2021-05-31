package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Xây dựng chương trình quản lý danh sách các giao dịch nhà đất. Thông tin bao gồm:
        //
        //Giao dịch đất: Mã giao dịch, ngày giao dịch (ngày, tháng, năm), đơn giá, loại đất (loại A, B, C), diện tích. Nếu là loại B, C thì thành tiền = diện tích * đơn giá. Nếu là loại A thì thành tiền = diện tích * đơn giá * 1.5.
        //Giao dịch nhà: Mã giao dịch, ngày giao dịch (ngày, tháng, năm), đơn giá, loại nhà (cao cấp, thường), địa chỉ, diện tích. Nếu là loại nhà cao cấp thì thành tiền = diện tích * đơn giá, nếu là loại thường thì thành tiền = diện tích * đơn giá * 90%.
        //Viết chương trình thực hiện các yêu cầu sau:
        //
        //Xây dựng các lớp với quan hệ thừa kế.
        //Nhập xuất danh sách các giao dịch.
        //Tính trung bình thành tiền của giao dịch đất.
        //Xuất ra các giao dịch của tháng 9 năm 2013.
        int soGiaoDichDat,soGiaoDichNha;
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<>();
        ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
        System.out.println("Nhap so giao dich dat:");
        soGiaoDichDat = sc.nextInt();
        System.out.println("Nhap so giao dich nha:");
        soGiaoDichNha = sc.nextInt();
        for(int i = 0; i < soGiaoDichDat;i++){
            GiaoDichDat giaoDichDat =new GiaoDichDat();
            System.out.println("Nhap giao dich dat thu "+(i+1)+" :");
            giaoDichDat.nhapThongTin();
            arrGiaoDichDat.add(giaoDichDat);
        }
        for(int i = 0; i < soGiaoDichNha;i++){
            GiaoDichNha giaoDichNha =new GiaoDichNha();
            System.out.println("Nhap giao dich nha thu "+(i+1)+" :");
            giaoDichNha.nhapThongTin();
            arrGiaoDichNha.add(giaoDichNha);
        }
        System.out.println("Thong tin giao dich dat :");
        for (int i = 0; i <arrGiaoDichDat.size();i++){
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
        System.out.println("Thong tin giao dich nha :");
        for (int i = 0; i <arrGiaoDichNha.size();i++){
            System.out.println(arrGiaoDichNha.get(i).toString());
        }




    }
}
