package com.company;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	// Viết chương trình tính sự chênh lệch về giờ, phút, giây giữa 2 ngày bất kỳ.
        Calendar calendar = Calendar.getInstance();
        LocalDateTime startDate = LocalDateTime.of(2010,2,2,4,3,4);
        LocalDateTime endDate = LocalDateTime.of(2011,1,1,3,2,3);
        long differentInSeconds = Duration.between(startDate,endDate).getSeconds();
        long differentInHours = Duration.between(startDate,endDate).toHours();
        long differentInMinutes = Duration.between(startDate,endDate).toMinutes();

        System.out.println("Sự chênh lệch giữa startDate và endDate là " +
                differentInSeconds + " giây tương ứng với " + differentInMinutes +
                " phút và tương ứng với " + differentInHours + " giờ.");
    }
}
