package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình thực hiện các yêu cầu sau:
        //
        //Tạo mới 2 HashSet có kiểu là Integer và nhập các phần tử cho 2 HashSet này.
        //Kiểm tra xem HashSet 2 có phải là tập hợp con của HashSet 1 hay không? Nếu có thì thông báo là tập hợp con, ngược lại thì thông báo không là tập hợp con.
        //Thêm tất cả các phần tử của HashSet 2 vào HashSet 1 và hiển thị lại HashSet 1.
        //Tìm và hiển thị các phần tử chung giữa 2 HashSet này.
        HashSet<Integer> hashSetInteger1 = new HashSet<>();
        HashSet<Integer> hashSetInteger2 = new HashSet<>();

        hashSetInteger1.add(3);
        hashSetInteger1.add(2);
        hashSetInteger1.add(6);
        hashSetInteger1.add(8);
        hashSetInteger2.add(6);
        hashSetInteger2.add(3);
        hashSetInteger2.add(8);

        if(hashSetInteger1.containsAll(hashSetInteger2)){
            System.out.println("hashset2 la con cua hashset1");
        }
        else{
            System.out.println("hashset2 khong phai la tap con cua hasset1");
        }

        hashSetInteger1.retainAll(hashSetInteger2);
        System.out.println("cac phan tu chung:");
        System.out.print(hashSetInteger1);
    }
}
