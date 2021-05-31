package com.company;

public class Rectangle extends Shape {
    private int chieuDai;
    private int chieuRong;

    public Rectangle() {
        super();
    }

    public Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void draw(){
        super.draw();
        for (int i = 1; i <= chieuRong; i++) {
            // vẽ chiều dài
            for (int j = 1; j <= chieuDai; j++) {
                if ((j == 1) || (j == chieuDai) || (i == 1) || (i == chieuRong)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            }
        }
    }
