package com.company;

import java.time.YearMonth;

public class Main {

    public static void main(String[] args) {
	//Java - Viết chương trình hiển thị thứ của ngày đầu tiên và cuối cùng của tháng hiện tại.Y
        YearMonth yearMonth = YearMonth.of(2021,5);
        String first = yearMonth.atDay(1).getDayOfWeek().name();
        System.out.println("thu cua ngay dau thang la :"+first);
        String last = yearMonth.atEndOfMonth().getDayOfWeek().name();
        System.out.println("thu cua ngay cuoi thang la :"+last);
    }
}
