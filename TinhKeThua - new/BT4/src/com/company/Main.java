package com.company;

public class Main {

    public static void main(String[] args) {
	//Viết chương trình thực hiện các yêu cầu sau:
        //
        //Xây dựng lớp hình chữ nhật với các thuộc tính là chiều dài, chiều rộng, viết các hàm tính chu vi và diện tích của nó.
        //Xây dựng lớp hình vuông kế thừa lớp hình chữ nhật.
        //Viết chương trình tính chu vi, diện tích hình vuông với độ dài cạnh nhập vào từ bàn phím.
        HinhVuong hinhVuong= new HinhVuong(6);
        System.out.println(hinhVuong.tinhChuVi());
        System.out.println(hinhVuong.tinhDienTich());
    }
}
