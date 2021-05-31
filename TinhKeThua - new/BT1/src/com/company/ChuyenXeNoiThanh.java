package com.company;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    public void nhapThongTinXe(){
        super.nhapThongTinXe();
        System.out.println("Nhap so tuyen:");
        soTuyen=sc.nextLine();
        System.out.println("nhap so km di duoc");
        soKmDiDuoc=sc.nextInt();
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soTuyen='" + soTuyen + '\'' +
                ", soKmDiDuoc=" + soKmDiDuoc +
                '}';
    }
}
