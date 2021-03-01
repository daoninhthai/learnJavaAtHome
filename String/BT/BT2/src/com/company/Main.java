package com.company;

public class Main {
// hàm compareTo sẽ trả về chênh lệch giá trị ký tự giữa 2 chuỗi
    // ky tu "r" < ky tu "z" nên trả về "<"
    public static void main(String[] args) {
        int result;
        String string1 = "Happy new year!";
        String string2 = "Happy new yeaz!";

        result = string1.compareTo(string2);
        if (result == 0) {
            System.out.println("Chuỗi " + string1 + " = " + string2);
        } else if (result < 0) {
            System.out.println("Chuỗi " + string1 + " < " + string2);
        } else if(result>0) {
            System.out.println("Chuỗi " + string1 + " > " + string2);
        }

    }
}
