package com.company;

import java.util.Date;

class Geometry{// lop cha
    private String color;
    private Boolean isFilled;
    private Date createdDate;
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color=color;
    }
    Geometry(String color , Boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
        this.createdDate = new Date();
        System.out.printf("Constructor in Geometry , with color:%s, "+
                "isFilled = %b at: %s\n", color, isFilled , this.createdDate);
    }
    void showSomething(int x){
        System.out.printf("x = %d",x);
    }
}
class Rectangle extends Geometry{
    double width;
    double height;

    Rectangle(String color, Boolean isFilled,double width, double height) {
        super(color, isFilled);
        this.width = width;

        this.height = height;
        System.out.println("Constructor in rectangle");
    }
    @Override // bat buoc neu muon ghi de

    String getColor(){
        return super.getColor() + " is color's rectangle";
    }

    //overload , nap chong
    void showSomething(String s){
        System.out.printf(" s = %s",s);
    }

}
class Square extends Geometry {

    public Square(String color, Boolean isFilled) {
        super(color, isFilled);
    }

}
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red",true,20,40);
        System.out.println(rectangle.getColor());//red is color's rectangle (test ghi de) : viet de len phuong thuc cua lop cha
        Geometry geometry = new Geometry("pink",true);
        geometry.showSomething(12);
        rectangle.showSomething("aduvjp");// nap chong : ten phuong thuc giong nhung tham so truyen vao khac

    }
}
