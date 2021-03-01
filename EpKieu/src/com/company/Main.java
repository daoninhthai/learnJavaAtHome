package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        float y = x;//Implicit casting: Ép kiểu "ngầm định", từ kiểu nhỏ => kiểu to.VD: int sang float
        System.out.println("y = "+y);
        double floatVar = 123.345;
        int intVar = (int)floatVar;//Explicit casting: Ép kiểu "tường minh", từ to => nhỏ. VD: float sang int
        System.out.println("intVar = "+intVar);
    }
}
