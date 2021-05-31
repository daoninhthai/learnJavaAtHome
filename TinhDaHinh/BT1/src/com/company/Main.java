package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình tính lương nhân viên trong một nhân viên với mô tả như sau:
        //
        //Công ty này có hai loại nhân viên đó là nhân viên toàn thời gian và nhân viên thời vụ.
        //
        //Nhân viên toàn thời gian bình thường sẽ hưởng lương 10 triệu/tháng. Nhân viên toàn thời gian là sếp sẽ hưởng lương 20 triệu/tháng.
        //Nhân viên toàn thời gian nếu làm thêm thì sẽ được cộng thêm 800 ngàn/ngày (bất kể chức vụ), nhân viên thời vụ cứ làm thêm mỗi giờ được 100 ngàn.
        //Ứng dụng sẽ cho phép người dùng nhập thông tin từng nhân viên. Mỗi nhân viên có tên nhân viên, loại nhân viên (nhân viên toàn thời gian, nhân viên thời vụ). Nhân viên toàn thời gian thì là nhân viên bình thường hay là sếp, có làm thêm ngày nào không. Nhân viên thời vụ thì làm được bao nhiêu giờ. Cuối cùng dựa vào thông tin đó, xuất ra màn hình lương tương ứng của từng nhân viên.


        Scanner sc = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();

        int soNhanVienToanThoiGian, soNhanVienThoiVu;
        System.out.println("Nhap so nhan vien toan thoi gian :");
        soNhanVienToanThoiGian = sc.nextInt();
        System.out.println("Nhap so nhan vien thoi vu :");
        soNhanVienThoiVu = sc.nextInt();
        for(int i = 0; i < soNhanVienToanThoiGian; i++){
            System.out.println("Nhap thong tin nhan vien toan thoi gian thu"+(i+1)+" :");
            nhanVien = new NhanVienToanThoiGian();
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }
        for(int i =0; i < soNhanVienThoiVu;i++){
            System.out.println("Nhap thong tin nhan vien thoi vu thu "+(i+1)+" :");
            nhanVien = new NhanVienThoiVu();
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }


        System.out.println("Thong tin nhan vien :");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }


    }
}
