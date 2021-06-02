package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Lớp HinhHoc là lớp cha và là một lớp trừu tượng. Lớp này có một phương thức trừu tượng là tinhDienTich().
        //Xây dựng lớp HinhTron và lớp HinhChuNhat kế thừa lớp HinhHoc và viết lại phương thức tinhDienTich() để tính diện tích của hình tròn và hình chữ nhật.
        //Lớp DanhSachHinh có 1 ArrayList dùng để lưu đối tượng HinhHoc bao gồm cả HinhTron và HinhChuNhat. Tạo hàm tạo mặc định để khởi tạo ArrayList và thêm vào 3 hình bất kỳ được xác định trước (không nhập từ bàn phím, gồm cả 2 loại hình). Viết phương thức thêm hình cho trước (hình tròn và hình chữ nhật) vào ArrayList với đối số truyền vào là hình cần thêm và phương thức hienThiDanhSach() hiển thị toàn bộ danh mục hình.
        //Viết lớp Main chứa hàm main() tạo mới 1 đối tượng DanhSachHinh. Tạo menu với các chức năng sau:
        //
        //Thêm hình tròn.
        //Thêm hình chữ nhật.
        //Hiển thị danh sách các loại hình.
        //Đếm số lượng hình chữ nhật.
        //Hiển thị thông tin hình chữ nhật có diện tích lớn nhất.


        int choose , chieuDai, chieuRong, banKinh;
        Scanner sc = new Scanner(System.in);
        Random random;
        HinhHoc hinhHoc;
        DanhSachHinh danhSachHinh = new DanhSachHinh();
        System.out.println("1. Thêm hình chữ nhật");
        System.out.println("2. Thêm hình tròn");
        System.out.println("3. Hiển thị danh sách hình");
        System.out.println("4. Đếm số lượng hình chữ nhật");
        System.out.println("5. Hiển thị thông tin hình chữ nhật có diện tích lớn nhất");
        System.out.println("6. Thoát chương trình");
        do{
            System.out.println("Chon chuc nang tu 1 -6");
            choose =sc.nextInt();
            switch (choose){
                case 1:
                    random = new Random();
                    do {
                        chieuDai = random.nextInt(5)+1;
                        chieuRong =random.nextInt(5)+1;
                    }while (chieuDai<=chieuRong);
                    hinhHoc = new HinhChuNhat(chieuDai, chieuRong);
                    danhSachHinh.themHinh(hinhHoc);
                    System.out.println("THem hinh thanh cong chieu dai ="+chieuDai+"chieu rong="+chieuRong);
                    break;

                case 2:
                    random = new Random();
                    banKinh=random.nextInt(5)+1;
                    hinhHoc= new HinhTron(banKinh);
                    danhSachHinh.themHinh(hinhHoc);
                    System.out.println("Thêm thành công hình tròn có bán kính = " + banKinh);
                    break;
                case 3:
                    System.out.println("THong tin cac hinh co trong danh sach :");
                    danhSachHinh.hienThiDanhSachHinh();
                    break;
                case 4:
                    System.out.println("SO luong hinh chu nhat"+danhSachHinh.demSoHinhChuNhat());
                    break;
                case 5:
                    System.out.println("THong tin hinh chu nhat co dien tich lon nhat");

                    danhSachHinh.hienThiHinhChuNhatCoDienTichLonNhat();
                case 6:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("chon chuc nang khong dung");
                    break;
            }


        }while (true);
    }
}
