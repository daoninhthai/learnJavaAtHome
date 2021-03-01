package com.company;

public class Main {

    public static void main(String[] args) {
//	    for (int i = 0 ; i < 100 ; i++){
//	        System.out.println(i);
////	        if(i == 20){
////	            break;
////	        }
//	      if(i!=10){
//	          continue;
//          }
//	      System.out.println("the end");
//        }
        String exampleString = "aboa";// Kiem tra 1 string co phai la 1 xau doi xung
	    int startIndex = 0 ;
	    boolean isPalindrom = true;

	    int endIndex = exampleString.length()-1;
        while(startIndex < endIndex){
            if(exampleString.charAt(startIndex) != exampleString.charAt(endIndex)){
                isPalindrom= false;
                break;
            }

            startIndex++;
            endIndex--;
        }
        if(isPalindrom){
            System.out.println(exampleString + " is a palindrom");
        }
        else {
            System.out.println(exampleString +" is not a palindrom");
        }
    }
}
