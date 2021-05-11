package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Để quản lý hồ sơ học sinh của trường trung học phổ thông, người ta cần quản lý những thông tin như sau: Các thông tin về lớp và các thông tin cá nhân của mỗi học sinh. Với mỗi học sinh, các thông tin cá nhân cần quản lý gồm có họ và tên, giới tính và quê quán.
        //
        //Hãy xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi học sinh.
        //Xây dựng lớp HoSoHocSinh (hồ sơ học sinh) để quản lý các thông tin về mỗi học sinh.
        //Xây dựng các phương thức nhập, hiển thị các thông tin của mỗi học sinh.
        //Viết chương trình chính thực hiện các công việc sau: Nhập vào danh sách gồm n học sinh (n nhập từ bàn phím), hiển thị ra màn hình tất cả những học sinh quê ở Thái Nguyên và những học sinh của lớp 10A1.
        ArrayList<HoSoHocSinh> arrHoSo = new ArrayList<>();
        int n;
        HoSoHocSinh hoSoHocSinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien:");
        n = sc.nextInt();
        for(int i  =  0 ; i < n ; i++){
            System.out.println("Nhap thong tin sv "+(i+1)+":");
            hoSoHocSinh= new HoSoHocSinh();
            hoSoHocSinh.nhapThongTinHS();
            arrHoSo.add(hoSoHocSinh);

        }
        for(int i = 0; i < n; i++){
            System.out.println("hien thi thong tin sinh vien thu "+(i+1)+" :");
            arrHoSo.get(i).hienThiThongTinLop();
        }
        System.out.println("sinh vien que Thai Nguyen:");
        for(int i = 0 ; i < n ;i++ ){
            if(arrHoSo.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thai Nguyen")){
                arrHoSo.get(i).hienThiThongTinLop();
            }
        }
        System.out.println("hien thi thong tin sv lop 10A1");
        for(int i = 0 ; i < n; i++){
            System.out.println(arrHoSo.get(i).getLop());
        }
        System.out.println(arrHoSo);
    }
}
