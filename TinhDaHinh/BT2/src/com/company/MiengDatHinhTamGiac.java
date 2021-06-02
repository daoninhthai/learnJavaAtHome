package com.company;

public class MiengDatHinhTamGiac extends MiengDat {
    private double chieuCao, canhDay;

    public MiengDatHinhTamGiac(double chieuCao, double canhDay) {
        super();
        this.chieuCao = chieuCao;
        this.canhDay = canhDay;
    }

    public MiengDatHinhTamGiac() {
        super();
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanhDay() {
        return canhDay;
    }

    public void setCanhDay(double canhDay) {
        this.canhDay = canhDay;
    }
    @Override

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap chieu cao :");
        chieuCao = sc.nextDouble();
        System.out.println("Nhap chieu dai day :");
        canhDay=sc.nextDouble();
    }
    @Override
    public double tinhDienTich(){
        super.tinhDienTich();
        return (chieuCao*canhDay)/2;

    }
    @Override
    public double tinhTien(){
        return this.donGia*(long) this.tinhDienTich()*0.9;

    }


    @Override
    public String toString() {
        return "MiengDatHinhTamGiac{" +
                super.toString()+
                "chieuCao=" + chieuCao +
                ", canhDay=" + canhDay +
                '}';
    }
}
