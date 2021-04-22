package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Khai báo 1 List có Class triển khai là ArrayList, kiểu dữ liệu là String. Sau đó thêm vào phần tử là các thứ trong tuần cho List này (giá trị của các phần tử được nhập từ bàn phím).
        //Hiển thị các phần tử có trong List vừa nhập bằng 2 cách: sử dụng Iterator và ListIterator.
        //Thay đổi phần tử bất kỳ trong List và hiển thị lại List sau khi thay đổi.
        //Xóa phần tử vừa thay đổi trong List và hiển thị lại các phần tử còn lại của List.
        //Hiển thị các phần tử của List theo thứ tự từ phần tử cuối trở về phần tử đầu tiên.
        Scanner sc = new Scanner(System.in);
        List<String> listString = new ArrayList<String>();
        listString.add("Monday");
        listString.add("Tuesday");
        listString.add("Wednesday");
        listString.add("Thursday");
        listString.add("Friday");
        listString.add("Saturday");
        listString.add("Sunday");

        Iterator<String> iterator =  listString.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
        System.out.println();
        System.out.print("Nhap vao tu moi :");
        String element = sc.next();
        System.out.print("nhap phan tu muon doi :");
        int index = sc.nextInt();
        listString.set(index,element);

        for(String s : listString){
            System.out.print(s+",");
        }

    }
}
