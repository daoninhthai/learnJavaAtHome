package com.company;

public class MiengDatHinhThang extends MiengDat{
    private double dayLon, dayNho,chieuCao;

    public MiengDatHinhThang(double dayLon, double dayNho, double chieuCao) {
        super();
        this.dayLon = dayLon;
        this.dayNho = dayNho;
        this.chieuCao = chieuCao;
    }

    public MiengDatHinhThang() {
        super();
    }

    public double getDayLon() {
        return dayLon;
    }

    public void setDayLon(double dayLon) {
        this.dayLon = dayLon;
    }

    public double getDayNho() {
        return dayNho;
    }

    public void setDayNho(double dayNho) {
        this.dayNho = dayNho;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap chieu dai day nho :");
        dayNho = sc.nextDouble();
        System.out.println("Nhap chieu dai day lon :");
        dayLon = sc.nextDouble();
        System.out.println("Nhap chieu cao :");
        chieuCao = sc.nextDouble();
    }
    @Override
    public double tinhDienTich(){
        return (dayLon+dayNho)*chieuCao/2;
    }
    @Override
    public double tinhTien(){
        return this.donGia*(long) this.tinhDienTich()*0.9;
    }


    @Override
    public String toString() {
        return "MiengDatHinhThang{" +
                "dayLon=" + dayLon +
                ", dayNho=" + dayNho +
                ", chieuCao=" + chieuCao +
                '}';
    }
}
