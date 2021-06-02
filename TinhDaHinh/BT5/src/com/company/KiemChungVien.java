package com.company;

public class KiemChungVien extends NhanVien {
    private int soLoiTimDuoc;

    public KiemChungVien(int soLoiTimDuoc) {
        super();
        this.soLoiTimDuoc = soLoiTimDuoc;
    }

    public KiemChungVien() {
        super();
    }

    public int getSoLoiTimDuoc() {
        return soLoiTimDuoc;
    }

    public void setSoLoiTimDuoc(int soLoiTimDuoc) {
        this.soLoiTimDuoc = soLoiTimDuoc;
    }

    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap so loi tim duoc :");
        soLoiTimDuoc=sc.nextInt();
    }
    @Override
    public  long tinhTienLuong(){
        return this.luongCoBan+ this.soLoiTimDuoc*50000;
    }

    @Override
    public String toString() {
        return super.toString()+
                "soLoiTimDuoc=" + soLoiTimDuoc
                ;
    }
}
