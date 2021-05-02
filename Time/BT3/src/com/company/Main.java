package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình hiển thị ngày hiện tại sau 2 tuần.
        Calendar calendar = Calendar.getInstance();
   calendar.add(calendar.DAY_OF_MONTH,14);
   System.out.println(calendar.getTime());

    }
}
