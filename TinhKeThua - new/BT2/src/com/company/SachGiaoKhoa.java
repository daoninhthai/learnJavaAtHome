package com.company;

public class SachGiaoKhoa extends Sach {
    private  String tinhTrang;
    private double thanhTien;
    private int number;
    public SachGiaoKhoa(String maSach, double donGia, int soLuong, String nhaXuatBan, String tinhTrang, int number) {
        super(maSach, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
        this.number =number;
    }

    public SachGiaoKhoa() {
        super();
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String tinhTrangSach(int x ){
        switch (number){
            case 0:
                tinhTrang = "cũ ";
                break;
            case 1:
                tinhTrang = "mới";
                break;
            default:
                break;
        }
        return tinhTrang;

    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("nhap tinh trang(cu = 0,moi = 1):");
        number=sc.nextInt();
    }

    @Override
    public String toString() {

        return super.toString()  +
                ", tinhTrang='" + tinhTrangSach(number) + '\'' +
                '}';
    }
}
