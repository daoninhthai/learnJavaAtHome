package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Đánh giá mật khẩu

        String password;
        int countL = 0;
        int countU = 0;
        int countD = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Mật Khẩu : ");
        password = sc.nextLine() ;
        for(int i = 0; i<password.length();i++){
            if(Character.isLowerCase(password.charAt(i))){
                countL++;
            }
            if(Character.isUpperCase(password.charAt(i))){
                countU++;
            }
            if(Character.isDigit(password.charAt(i))){
                countD++;
            }

        }
        if(countL+countU+countD < 8){
            System.out.println("So ky tu phai lon hon 8");
        }
        if(countU<1 || countD < 1){
            System.out.println("Mat khau can co chu hoa va so");
        }
        else {
            System.out.println("Mat khau hop le");
        }
    }
}
