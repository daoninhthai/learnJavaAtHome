package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String chuoi ;
	    char kytu;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhap vao ky tu can dem : ");
        kytu = sc.next().charAt(0);
        for(int i = 0; i<chuoi.length();i++){
            if(kytu == chuoi.charAt(i)){
                count++;
            }

        }
        System.out.println(count);


    }
}
