package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    // Khai báo 1 Set có Class triển khai là HashSet, kiểu dữ liệu là String. Sau đó thêm vào phần tử là tên của các khoa của một trường đại học cho Set này (giá trị của các phần tử được nhập từ bàn phím).
        //Hiển thị các phần tử vừa nhập có trong Set vừa nhập sử dụng Iterator.
        //Thêm vào một khoa mới vào trong Set, nếu tên khoa đó đã tồn tại thì thông báo cho người dùng biết tên khoa đó đã có, còn ngược lại thêm bình thường và thông báo "Thêm thành công!".
        //Xóa một khoa bất kỳ ra khỏi Set. Kiểm tra nếu khoa cần xóa có tồn tại trong Set thì mới xóa và thông báo "Xóa thành công!", ngược lại thông báo "Xóa không thành công!".

        Set<String> khoa = new HashSet<String>();
        khoa.add("cong nghe thong tin");
        khoa.add("hoa sinh");
        khoa.add("kinh te");
        khoa.add("thuy van");
        khoa.add("tai chinh");
        khoa.add("ke toan");
        Scanner sc = new Scanner(System.in);

        Iterator<String> khoaIterator = khoa.iterator();

        while (khoaIterator.hasNext()){
            System.out.print(khoaIterator.next()+",");
        }
        System.out.println();
        System.out.println("Nhap khoa can them");
        String themKhoa = sc.next();

        if(khoa.contains(themKhoa)){
                System.out.println("da ton tai khoa");
            }
        else {
                khoa.add(themKhoa);
                System.out.println("them thanh cong");
            }
        khoaIterator = khoa.iterator();
        System.out.println("khoa sau khi them");
        while (khoaIterator.hasNext()){
            System.out.print(khoaIterator.next()+",");
        }


        System.out.println();
        System.out.println("Nhap khoa can xoa");
        String xoaKhoa = sc.next();
        if(khoa.contains(xoaKhoa)){
            khoa.remove(xoaKhoa);
            System.out.println("xoa thanh cong");
            khoaIterator = khoa.iterator();
            while (khoaIterator.hasNext()){
                System.out.print(khoaIterator.next()+",");
            }
        }
        else {
            System.out.println("khoa khong ton tai");

        }
    }

}
