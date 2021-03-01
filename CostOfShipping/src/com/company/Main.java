package com.company;

public class Main {
    public static float getCostOfShipping (float weight){
        if(weight>0 && weight <=3){
            return 10f;

        }
        else if(weight > 3 && weight <=10){
            return 20f;
        }
        else if(weight >10){
            return 100f;
        }
        return -1;
    }
    public static void main(String[] args) {
	    float costOfShipping = getCostOfShipping((10f));
	    if(costOfShipping>0){
	        System.out.println("Cost : "+ costOfShipping +"$");
        }
	    else {
	        System.out.println("đéo chuyển cho mày");
        }
    }
}
