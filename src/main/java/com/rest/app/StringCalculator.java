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
        if(numberStr.length()==0){
            return 0;
        }else if(numberStr.length()==1){
            return numberStr.charAt(0)-'0'; // TODO : Support for "15" -> 15
        }else{
            return addCommseparatedNumber(numberStr);
        }
    }
}
