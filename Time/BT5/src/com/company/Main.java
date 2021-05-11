package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình tính và hiển thị sự chênh lệch về ngày, tháng, năm giữa 2 ngày bất kỳ.
        LocalDate startDate = LocalDate.of(1999,1,29);
        LocalDate endDate = LocalDate.of(2021,5,2);
        Period different = Period.between(startDate,endDate);
        System.out.println("Su chenh lech la "+different.getYears()+" nam "+different.getMonths()+" thang "
        +different.getDays()+" ngay");

    }
}
