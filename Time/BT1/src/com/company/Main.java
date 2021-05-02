package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình hiển thị ngày đầu tháng và cuối tháng của tháng hiện tại.
        Calendar calendar = Calendar.getInstance();
        System.out.println("ngay dau thang la "+ calendar.getActualMinimum(calendar.DATE));
        System.out.println("ngay cuoi thang la "+calendar.getActualMaximum(calendar.DATE));

    }
}
