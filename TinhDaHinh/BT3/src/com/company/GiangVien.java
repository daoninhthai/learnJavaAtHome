package com.company;

public class GiangVien extends NhanVien {
    private String trinhDo;
    private int chonTrinhDo;
    private int soTietDay;

    public GiangVien(String trinhDo, int soTietDay) {
        super();
        this.trinhDo = trinhDo;
        this.soTietDay = soTietDay;
    }

    public GiangVien() {
        super();
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap trinh do giang vien (1-Cử nhân , 2-Thạc sĩ ,3-Tiến sĩ ):");
        chonTrinhDo = sc.nextInt();
        if(chonTrinhDo==1){
            trinhDo="Cử nhân";
            setPhuCap(300);
        }
        if(chonTrinhDo==2){
            trinhDo="Thạc sĩ";
            setPhuCap(500);
        }
        if(chonTrinhDo==3){
            trinhDo="Tiến sĩ ";
            setPhuCap(1000);
        }
        System.out.println("Nhap so tiet day :");
        soTietDay=sc.nextInt();
    }
    @Override
    public double tinhTien(){
        return heSoLuong*730+getPhuCap()+this.soTietDay*45;
    }

    @Override
    public String toString() {
        return super.toString()+
                "trinhDo='" + trinhDo + '\'' +

                ", soTietDay=" + soTietDay
                ;
    }
}
