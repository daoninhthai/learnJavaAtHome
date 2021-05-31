package com.company;

public class RightTriangle extends Shape{
    private int canhVuong, n;

    public RightTriangle(int canhVuong, int n) {
        this.canhVuong = canhVuong;
        this.n = n;
    }

    public RightTriangle() {
        super();
    }

    public int getCanhVuong() {
        return canhVuong;
    }

    public void setCanhVuong(int canhVuong) {
        this.canhVuong = canhVuong;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void draw(){
        super.draw();
        for(int i =1;i<=canhVuong;i++){
            for(int j =1;j<=i;j++){
               System.out.print("*");

            }
            System.out.println();
        }
    }
}
