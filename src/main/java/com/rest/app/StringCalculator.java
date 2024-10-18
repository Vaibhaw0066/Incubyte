package com.rest.app;

public class StringCalculator {

    public int addCommseparatedNumber(String numbersStr){

        int sum = 0;
        String []numberArrayStr = numbersStr.split(",");

        for(int i=0;i<numberArrayStr.length;i++){
            sum += Integer.parseInt(numberArrayStr[i]);
        }
        return sum;
    }

    public int add(String numberStr){
        if(numberStr.length()==0) {
            return 0;
        }else{
            return addCommseparatedNumber(numberStr);
        }
    }
}
