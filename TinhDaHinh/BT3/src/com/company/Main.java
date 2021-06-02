package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// https://freetuts.net/ref/java-viet-chuong-trinh-quan-ly-can-bo-cua-mot-truong-dai-hoc-284.html
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
        int choose, soNhanVien;

        NhanVien nhanVien = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng cán bộ trong trường: ");
        soNhanVien = scanner.nextInt();
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin cán bộ thứ " + (i + 1) + ":");
            do {
                System.out.print("Chọn loại cán bộ (1 - giảng viên, 2 - can bo): ");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        nhanVien = new GiangVien();
                        nhanVien.nhapThongTin();
                        arrNhanVien.add(nhanVien);
                        break;
                    case 2:
                        nhanVien= new CanBo();
                        nhanVien.nhapThongTin();
                        arrNhanVien.add(nhanVien);
                        break;
                    default:
                        System.out.println("Chọn không hợp lệ.");
                        break;
                }
            } while (choose < 1 || choose > 3);
        }

        System.out.println("Hiển thị danh sách cán cán bộ trong trường: ");
        for (NhanVien nv : arrNhanVien) {
            System.out.println(nv.toString());
        }
}}
