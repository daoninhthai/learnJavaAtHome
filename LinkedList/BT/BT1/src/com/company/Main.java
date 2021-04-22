package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình thực hiện các yêu cầu sau:
        //
        //Khai báo một danh sách liên kết lưu trữ danh sách thông tin sinh viên. Thông tin của 1 sinh viên bao gồm tên và điểm của sinh viên đó.
        //Thêm sinh viên vào trong danh sách vừa tạo. Việc nhập sinh viên sẽ dừng lại khi người dùng nhập họ tên sinh viên là một chuỗi rỗng.
        //Đếm số sinh viên phải thi lại và hiển thị thông tin của những sinh viên đó ra. Sinh viên phải thi lại khi điểm của sinh viên đó <= 5.
        //Hiển thị các sinh viên có điểm cao nhất. Nếu có nhiều sinh viên bằng điểm thì phải hiển thị tất cả những sinh viên đó ra.
        //Tìm kiếm sinh viên theo tên và hiển thị thông tin sinh viên vừa tìm được.

        String tenSinhvien , thongTin = null;
        String arrThongTin[];
        double diemSinhVien;
        LinkedList<String> danhSachSV = new LinkedList<>();
        LinkedList<String> svThiLai = new LinkedList<>();// sinh vien thi lai
        LinkedList<String> svDiemCao = new LinkedList<>();//sinh vien diem cao
        LinkedList<String> svCanTim = new LinkedList<>();//sinh vien can tim

        Scanner sc = new Scanner(System.in);
        //them danh sach sinh vien neu nhap vao ten sinh vien rong thi khong nhap nua
        do{
            System.out.println("nhap ten sinh vien");
            tenSinhvien = sc.nextLine();
            if(!tenSinhvien.isEmpty()){
                System.out.println("nhap diem sinh vien");
                diemSinhVien = sc.nextDouble();
                thongTin = tenSinhvien+"\t"+diemSinhVien;
                danhSachSV.add(thongTin);
            }
        }
            while (!tenSinhvien.isEmpty());{
                System.out.println("So sinh vien co trong danh sach = "+danhSachSV.size());
                System.out.println("Thong tin sinh vien vua nhap la");
                System.out.println("Ten sinh vien \t Diem");
                Iterator<String> iterator = danhSachSV.iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next());

                }
                for(int i = 0 ;i < danhSachSV.size();i++){
                    String sv = danhSachSV.get(i);
                    arrThongTin = sv.split("\t");
                    double point = Double.parseDouble(arrThongTin[1]);
                    if(point <= 5){
                        svThiLai.add(sv);
                    }
                }
                if(svThiLai.isEmpty()){
                    System.out.println("Khong co sinh vien thi lai");

                }
                else {
                    System.out.println("So sinh vien can phai thi lai = "+svThiLai.size());
                    System.out.println("Thong tin cua cac sinh vien phai thi lai: ");
                    System.out.println("Ten sinh vien \t Diem");
                    iterator = svThiLai.iterator() ;
                    while ((iterator.hasNext())){
                        System.out.println(iterator.next());
                    }
                }
                double maxTemp = 0;
                int i = 0 ;
                while(i<danhSachSV.size()){
                    arrThongTin = danhSachSV.get(i).split("\t");
                    if(Double.parseDouble(arrThongTin[1])>=maxTemp){
                        maxTemp = Double.parseDouble(arrThongTin[1]);
                    }
                    i++;
                }
                i = 0;
                while(i<danhSachSV.size()){
                    arrThongTin= danhSachSV.get(i).split("\t");
                    if(Double.parseDouble(arrThongTin[1])==maxTemp){
                        svDiemCao.add(danhSachSV.get(i));
                    }
                    i++;
                }
                System.out.println("thong tin sinh vien co diem cao nhat la");
                System.out.println("Ten sinh vien \t Diem");
                iterator =  svDiemCao.iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                System.out.println("Nhap ten sinh vien can tim");
                String search = sc.nextLine();
                i=0;
                while (i<danhSachSV.size()){
                    arrThongTin = danhSachSV.get(i).split("\t");
                    tenSinhvien = arrThongTin[0];
                    if(search.equalsIgnoreCase(tenSinhvien)){
                        svCanTim.add(danhSachSV.get(i));
                    }
                    i++;
                }
                System.out.println("Thong tin sinh vien "+search);
                System.out.println("Ten sinh vien \t Diem");
                iterator = svCanTim.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        }
    }

