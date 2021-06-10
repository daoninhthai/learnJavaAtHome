package com.company;

import java.util.ArrayList;
import java.util.List;

public class NhanVien {
    private String name;
    private int age;
    private String address;

    public NhanVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public static List<NhanVien> danhSachNhanVien(){
        List<NhanVien> nhanViens = new ArrayList<>();
        nhanViens.add(new NhanVien("Dao",12,"TN"));
        nhanViens.add(new NhanVien("Thai",14,"NB"));
        nhanViens.add(new NhanVien("Ninh",13,"HN"));

        return nhanViens;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
