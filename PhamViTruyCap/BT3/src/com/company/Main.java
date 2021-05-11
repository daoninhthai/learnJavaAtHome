package com.company;

public class Main {

    public static void main(String[] args) {
	// Một đối tượng sách trong hệ thống quản lý thư viện có các thuộc tính: tên sách, tổng số quyển sách, số quyển sách đang cho mượn.
        //
        //Xây dựng lớp Book với các thuộc tính trên và các phương thức sau: phương thức nhập liệu cho đối tượng từ bàn phím (các thông tin cần nhập là tên sách, tổng số sách, số đang cho mượn), phương thức in thông tin tên sách ra màn hình, phương thức tính số sách còn lại trong thư viện (số sách còn lại = tổng số - số đang cho mượn).
        //Trên cơ sở lớp đã xây dựng, viết chương trình chính thực hiện các công việc: nhập danh sách các quyển sách với số lượng các quyển sách được nhập từ bàn phím, in ra màn hình các quyển sách hiện có trong thư viện.

        Book book = new Book();
        book.nhap();
        book.hienThi();
        book.muonSach();
        book.hienThi();
    }
}
