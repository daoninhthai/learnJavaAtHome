package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình hiển thị thời gian hiện tại của Hàn Quốc.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println("thoi gian hien tai o han quoc la : "+ calendar.get(calendar.HOUR)+":"+
                calendar.get(calendar.MINUTE)+":"+calendar.get(calendar.SECOND));
    }
}
