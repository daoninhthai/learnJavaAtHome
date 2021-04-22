package com.company;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình xây dựng 1 danh sách liên kết lưu trữ n số nguyên dương (n được nhập từ bàn phím). Sau đó tính trung bình cộng của các số chẵn và hiển thị kết quả ra màn hình.
        int n ,node , sum=0,count=0;
        double TBCong;
        DecimalFormat dcf = new DecimalFormat("#.##");
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("nhap n");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            System.out.println("nhap vao phan tu so"+i);
            node=sc.nextInt();
            linkedList.add(node);
        }
        for(int i = 0; i<n;i++){
            if(linkedList.get(i)%2==0){
                sum+=linkedList.get(i);
                count+=1;
            }
        }
        TBCong= (double)sum/count;
        System.out.println("trung binh cong cua cac so chan la :"+dcf.format(TBCong));

    }
}
