package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Công ty phần mềm Hoàn Cầu được thành lập từ năm 2007, chuyên nhận thực hiện các dự án phần mềm từ các đơn vị khác, cũng như phát triển các phần mềm do chính công ty đề xuất. Giả sử công ty có 2 loại nhân viên: Lập trình viên là những người sẽ viết mã nguồn cho các ứng dụng, Kiểm chứng viên có nhiệm vụ kiểm tra mã nguồn và chương trình mà lập trình viên viết ra để tìm các lỗi trước khi giao sản phẩm cho khách hàng.
        //
        //Hiện tại, công ty lưu trữ thông tin của các loại nhân viên như sau:
        //
        //Lập trình viên: mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản, số giờ overtime.
        //Kiểm chứng viên: mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản, số lỗi phát hiện được.
        //Do tính chất công việc khác nhau nên lương cơ bản của lập trình viên và kiểm chứng viên cũng khác nhau. Cụ thể:
        //
        //Lương (lập trình viên) = lương cơ bản + số giờ làm thêm * 200.000.
        //Lương (kiểm chứng viên) = lương cơ bản + số lỗi * 50.000.
        //Bạn hãy đề xuất thiết kế các lớp đối tượng cần thiết để quản lý danh sách các nhân viên của công ty và hỗ trợ tính lương cho nhân viên theo tiêu chí đặt ra như trên.
        //
        //Hãy viết chương trình thực hiện các yêu cầu sau:
        //
        //Nhập vào danh sách nhân viên (lưu trữ trong một mảng duy nhất).
        //Liệt kê danh sách nhân viên có lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
        int luongTrungBinh = 0,tongLuong = 0;
        Scanner sc = new Scanner(System.in);
        int choose;
        int soNhanVien;
        System.out.println("Nhap so nhan vien :");
        soNhanVien=sc.nextInt();
        NhanVien[] nhanVien =new NhanVien[soNhanVien];
        for(int i = 0; i<soNhanVien;i++){
            System.out.println("Nhap nhan vien thu "+(i+1)+" :");
            do{
                System.out.println("1-coder , 2-tester");
                choose=sc.nextInt() ;
                switch (choose) {
                    case 1 -> {
                        nhanVien[i] = new LapTrinhVien();
                        nhanVien[i].nhapThongTin();
                    }
                    case 2 -> {
                        nhanVien[i] = new KiemChungVien();
                        nhanVien[i].nhapThongTin();
                    }
                    default -> System.out.println("Nhap sai ");
                }
            }while (choose<1||choose>3);

        }
        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }
        System.out.println("Danh sách nhân viên có lương thấp hơn mức lương trung bình của "
                + "các nhân viên trong công ty.");
        for(int i=0;i<soNhanVien;i++){
            tongLuong+=nhanVien[i].tinhTienLuong();

        }
        luongTrungBinh =tongLuong/soNhanVien;
        for (int i = 0; i < soNhanVien; i++) {
            if (nhanVien[i].tinhTienLuong() <= luongTrungBinh) {
                System.out.println(nhanVien[i].toString());
            }
        }
    }
}
