package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Tạo 2 ArrayList: ArrayList 1 chứa các phần tử có kiểu chuỗi và ArrayList 2 chứa các phần tử là số nguyên. Sau đó nhập vào 5 phần tử cho 2 ArrayList này,
        //Hiển thị các phần tử của 2 ArrayList này sử dụng Iterator.
        //Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của 1 phần tử bất kỳ trong ArrayList 1. Nếu không tìm thấy phần tử đó thì hiển thị thông báo không tìm thấy.
        //Tạo 1 List có các phần tử được tách từ vị trí số 3 trong ArrayList 2.
        //Đảo ngược các phần tử trong 2 ArrayList này.
        //Xáo trộn các phần tử trong ArrayList 1 và hiển thị lại ArrayList này sau khi xáo trộn.
        //Chuyển ArrayList 2 thành mảng và hiển thị các phần tử của mảng.
        ArrayList<String> stringArrayList= new ArrayList<>();
        ArrayList<Integer>integerArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int nodeInt;
        String nodeString;
        System.out.println("Nhap phan tu cho integerArrayList :");
        for(int i = 1 ; i <= n; i++){
            System.out.println("Nhap phan tu so "+i+ ":");
            nodeInt = sc.nextInt();
            integerArrayList.add(nodeInt);
        }
        System.out.println("Nhap phan tu cho stringArrayList :");
        for(int i = 1; i <= n ; i++){
            System.out.println("Nhap phan tu so "+i+" :");
            nodeString = sc.nextLine();
            stringArrayList.add(nodeString);
        }

        Iterator<Integer> integerIterator = integerArrayList.iterator();
        System.out.println("Integer ArrayList:");
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next()+",");
        }
        Iterator<String> stringIterator = stringArrayList.iterator();
        System.out.println("String ArrayList:");
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next()+",");
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nhap tu muon tim trong string:");

        String k;
        k = sc.nextLine();
        if(stringArrayList.contains(k)){
            int firstIndex = stringArrayList.indexOf(k);
            int lastIndex = stringArrayList.lastIndexOf(k);
            System.out.println("First Index :"+firstIndex+", Last Index:"+lastIndex);
        }
        else {
            System.out.println("Khong co phan tu");
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Tạo 1 List có các phần tử được tách từ vị trí số 3 trong ArrayList 2.");
        
    }
}
