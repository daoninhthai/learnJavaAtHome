package com.company;

public class Main {

    public static void main(String[] args) {
	//Xây dựng chương trình cộng, trừ, nhân và chia 2 phân số. Sử dụng phương thức khởi tạo để nhập tử số và mẫu số. Mỗi một phép tính tương ứng cho một phương thức
        PhanSo phanSo1 = new PhanSo(1,2);
        PhanSo phanSo2 =new PhanSo(3,4);
        phanSo1.cong(phanSo2);
    }
}
