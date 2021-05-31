package com.company;

public class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        this.soSP = soSP;
        if(this.soSP<0){
            this.soSP=0;
        }
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    public void getLuong(){
        double tienLuong = 0;
        if(this.soSP>1&&this.soSP<=199){
            tienLuong=0.5*soSP;
        }
        if(this.soSP>200&&this.soSP<=399){
            tienLuong=0.55*soSP;
        }
        if(this.soSP>400&&this.soSP<=599){
            tienLuong=0.6*soSP;
        }
        if(this.soSP>600){
            tienLuong=0.65*soSP;
        }
        System.out.println("tien luong :"+tienLuong);
    }
}
