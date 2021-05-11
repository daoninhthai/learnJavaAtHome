package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Để quản lý khách hàng đến thuệ phòng trọ của một khách sạn, người ta cần quản lý những thông tin sau: Số ngày trọ, loại phòng trọ, giá phòng và các thông tin cá nhân về mỗi khách trọ. Thông tin cá nhân của mỗi khách trọ bao gồm họ và tên, ngày sinh và số chứng minh nhân dân.
        //
        //Hãy xây dựng lớp Nguoi để quản lý thông tin cá nhân của mỗi cá nhân.
        //Xây dựng lớp KhachSan để quản lý các thông tin về khách trọ.
        //Viết các phương thức: nhập, hiển thị thông tin về một khách trọ.
        //Viết chương trình chính thực hiện các công việc sau: Nhập vào một danh sách gồm n khách trọ (n nhập từ bàn phím), hiển thị ra màn hình thông tin về các cá nhân hiện đang trọ ở khách sạn đó và tính số tiền cần phải trả nếu một khách hàng trả phòng (căn cứ vào số chứng minh để tìm kiếm).

        Scanner sc = new Scanner(System.in);
        int n ;
        KhachSan khachSan;
        ArrayList<KhachSan> arrKhachSan = new ArrayList<>();

        n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n; i++){
            khachSan = new KhachSan();
            System.out.println("Nhap thong tin khach hang thu"+(i+1)+":");
            khachSan.nhapThongTinCanQuanLy();
            arrKhachSan.add(khachSan);
        }
        for(int i = 0; i< arrKhachSan.size();i++){
            System.out.println("Thong tin khach hang thu "+(i+1)+" :");
            arrKhachSan.get(i).hienThiThongTinCanQuanLy();
        }
        System.out.println("Nhap so cmnd:");
        String tim = sc.nextLine();
        for(int i = 0 ;i < arrKhachSan.size();i++ ){
            if(arrKhachSan.get(i).getNguoi().getSoCmnd().equalsIgnoreCase(tim)){
                System.out.println("So tien phong "+ arrKhachSan.get(i).tinhTien());
            }
        }
    }
}
