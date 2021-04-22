package com.company;

public class Main {

    public static void main(String[] args) {
	//
        String s ="1234567898765431";
        String s1;

        for(int i = 0; i<s.length()-1;i++){
            if(i%4==0){
                System.out.print(s.charAt(i)+",");
            }

        }
        System.out.println();
        for(int i = 0; i<s.length()-1;i++){
            if(i%4!=0){
                System.out.print(s.charAt(i)+",");
            }

        }
    }
}
