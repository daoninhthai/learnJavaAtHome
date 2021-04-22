package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình thực hiện các yêu cầu sau:
        //
        //Nhập vào một danh sách liên kết lưu trữ các số nguyên dương và các phần tử cho danh sách này.
        //Hiển thị các phần tử lẻ ra màn hình.
        //Tìm trong danh sách các phần tử có giá trị chia hết cho 2 và 5.
        //In phần tử cuối cùng trong danh sách liên kết.
        //Kiểm tra phần tử kế cuối của danh sách là chẵn hay lẻ.
        //Đếm xem trong danh sách có bao nhiêu giá trị x, với x được nhập từ bàn phím.
        //Xuất ra màn hình giá trị của nút thứ k trong danh sách (k nhập từ bàn phím).
        //Xóa phần tử lẻ trong danh sách.
        //Xóa phần tử chẵn trong danh sách.


        LinkedList<Integer> linkedList = new LinkedList<>();
        int n ,node;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("Nhap phan tu thu "+i);
            node = sc.nextInt();
            linkedList.add(node);
        }
        System.out.println("LinkedList vua nhap:");
        for(int i = 0;i < n;i++){
            System.out.print(linkedList.get(i)+"\t");
        }
        System.out.println();
        System.out.println("Cac phan tu le");
        for(int i = 0;i < n;i++){
            if(linkedList.get(i) % 2 != 0){
                System.out.print(linkedList.get(i)+"\t");

            }
        }
        System.out.println();
        System.out.println("Cac phan tu chia het cho 2 va 5");

        for(int i = 0;i < n;i++){
            if(linkedList.get(i) % 2 == 0 && linkedList.get(i) %5 == 0 ){
                System.out.print(linkedList.get(i)+"\t");

            }
        }
        System.out.println();
        System.out.println("phan tu cuoi cung trong danh sach:");
        System.out.println(linkedList.getLast());
        if(linkedList.getLast()%2==0){
            System.out.println("Phan tu cuoi la chan");
        }
        else {
            System.out.println("phan tu cuoi la le");
        }
        System.out.println("Nhap x");
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n;i++){
            if(x==linkedList.get(i)){
                count++;
            }
        }
        System.out.print("phan tu "+x+" xuat hien "+count+" lan");
        System.out.println();
        System.out.println("nhap k :");
        int k=sc.nextInt();
        while(k<0||k>n-1){

            System.out.print("Nhap lai k:");
            k =sc.nextInt();
        }
        System.out.println("vi tri k la :"+linkedList.get(k));
        for(int i = 0; i<n;i++){
            if(linkedList.get(i)%2!=0){
                linkedList.remove(linkedList.get(i));
                n--;
                i--;
            }
        }
        System.out.println();
        System.out.println("LinkedList vua nhap:");
        for(int i = 0;i < n;i++){
            System.out.print(linkedList.get(i)+"\t");

        }


    }
}
