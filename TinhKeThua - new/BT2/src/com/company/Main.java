package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Thư viện X quản lý danh sách các loại sách. Thông tin về các loại sách:
        //
        //Sách giáo khoa: Mã sách, đơn giá, số lượng, nhà xuất bản, tình trạng (mới, cũ). Nếu tình trạng sách là mới thì thành tiền = số lượng * đơn giá. Nếu tình trạng sách là cũ thì thành tiền = số lượng * đơn giá * 50%.
        //Sách tham khảo: Mã sách, đơn giá, số lượng, nhà xuất bản, thuế, thành tiền = số lượng * đơn giá + thuế.
        //Viết chương trình thực hiện các yêu cầu sau:
        //
        //Xây dựng các lớp với chức năng thừa kế.
        //Nhập xuất danh sách các loại sách.
        //Tính tổng thành tiền cho từng loại.
        //Tính trung bình cộng đơn giá của các sách tham khảo.
        //Xuất ra các sách giáo khoa của nhà xuất bản X.

        Scanner sc = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> arrSachThamKhao = new ArrayList<>();
        int soSachGiaoKhoa, soSachThamKhao;
        double tongTienSachGiaoKhoa = 0, tongTienSachThamKhao = 0, tongDonGiaSachThamKhao = 0,
                trungBinhCongDonGia = 0;
        System.out.println("Nhap so sach giao khoa: ");
        soSachGiaoKhoa = sc.nextInt();
        System.out.println("Nhap so sach giao khoa: ");
        soSachThamKhao = sc.nextInt();
        System.out.println("Nhap thong tin sach giao khoa:");
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapThongTin();
            arrSachGiaoKhoa.add(sachGiaoKhoa);
        }
        System.out.println("Nhap thong tin sach tham khao :");
        for (int i = 0; i < soSachThamKhao; i++) {
            System.out.println("Nhap thong tin sach thu " + (1 + i) + " :");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapThongTin();
            arrSachThamKhao.add(sachThamKhao);
        }
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getDonGia() * arrSachGiaoKhoa.get(i).getSoLuong() * 0.5;
            }
            if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getDonGia() * arrSachGiaoKhoa.get(i).getSoLuong();
            }
        }
        System.out.println("tong tien sach giao khoa :" + tongTienSachGiaoKhoa);


        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            tongTienSachThamKhao += arrSachThamKhao.get(i).getDonGia() * arrSachThamKhao.get(i).getSoLuong() + arrSachThamKhao.get(i).getThue();
        }
        System.out.println("tong tien sach tham khao :" + tongTienSachThamKhao);
        System.out.println("-----Thông tin sách giáo khoa-----");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            System.out.println(arrSachGiaoKhoa.get(i).toString());
        }

        System.out.println("-----Thông tin sách tham khảo-----");
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            System.out.println(arrSachThamKhao.get(i).toString());
        }

    }
}
