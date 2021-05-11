package com.company;

import java.util.Scanner;

public class Mang {

    public int[] arr = new int[10];

    Scanner sc = new Scanner(System.in);
    public void nhap(){

        for(int i = 0; i < arr.length; i++){

            System.out.println("nhap A["+i+"]:");
            arr[i]= sc.nextInt();


        }
    }
    public void hienThi(){

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
    public void findMax(){
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("phan tu lon nhat : "+max);
    }
    public void findMin(){
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("phan tu nho nhat : "+min);
    }


}
