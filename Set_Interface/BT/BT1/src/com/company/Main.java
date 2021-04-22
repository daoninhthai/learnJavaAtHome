package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    // Viết chương trình khai báo 2 Setvà nhập vào các phần tử cho Set đó. Sau đó tiến hành thực hiện phép toán hợp, tìm những phần tử khác nhau và toán tử giao giữa 2 Set.
        String animal1[] = {"Dog", "Cat", "Bear", "Bee", "Snake", "Tiger"};
        String animal2[] = {"Dog", "Bird", "Snake", "Monkey"};

        // chuyển 2 mảng này thành List sử dụng Arrays.asList()
        // và thêm vào trong Set
        Set<String> setAnimal1 = new HashSet<>(animal1);
        HashSet<String> setAnimal2 = new HashSet<>(Arrays.asList(animal2));
        System.out.println(setAnimal1);

    }
}
