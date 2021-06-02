package com.company;

public class CanBo extends NhanVien{
    private String chucVu;
    private String phongBan;
    private int chonChucVu;
    private int soNgayCong;

    public CanBo(String chucVu, String phongBan, int chonChucVu, int soNgayCong) {
        super();
        this.chucVu = chucVu;
        this.phongBan = phongBan;
        this.chonChucVu = chonChucVu;
        this.soNgayCong = soNgayCong;
    }

    public CanBo() {
        super();
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap chuc vu Can Bo (1-Truong phong , 2- Pho phong ,3-Nhan vien) :");
        chonChucVu = sc.nextInt();
        if(chonChucVu==1){
            chucVu="Truong phong";
            setPhuCap(2000);
        }
        if(chonChucVu==2){
            setPhuCap(1000);
            chucVu ="Pho phong";
        }
        if(chonChucVu==3){
            setPhuCap(500);
            chucVu = "Nhan vien";
        }
        System.out.println("Nhap so ngay cong :");
        soNgayCong=sc.nextInt();

    }
    @Override
    public double tinhTien(){
        return heSoLuong*730+getPhuCap()+this.soNgayCong*200;
    }

    @Override
    public String toString() {
        return super.toString()+
                "chucVu='" + chucVu + '\'' +
                ", phongBan='" + phongBan + '\'' +
                ", soNgayCong=" + soNgayCong
                ;
    }
}
