package com.company;

public class Main {

    public static void main(String[] args) {
	// Xây dựng lớp NhanVien, biết:
        //
        //ho, ten, soSP lần lượt là các thuộc tính họ, tên và số sản phẩm của nhân viên.
        //Viết hàm tạo NhanVien(String, String, int): hàm này sẽ khởi tạo họ, tên và số sản phẩm của nhân viên. Hàm này phải kiểm tra số sản phẩm là lớn hơn hoặc bằng 0, nếu là số âm thì gán giá trị cho soSP = 0.
        //Viết các hàm lấy và gán giá trị cho các thuộc tính của lớp.
        //Viết phương thức getLuong() để tính lương cho nhân viên, biết rằng lương = số sản phẩm * đơn giá, với đơn giá tùy thuộc vào số sản phẩm như sau:


        NhanVien nhanVien = new NhanVien("Dao","Thai",299);
        nhanVien.getLuong();
    }
}
