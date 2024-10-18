package com.rest.app;

public class StringCalculator {

    public int addCommaSeparatedNumber(String numbersStr){

        int sum = 0;
        String delimiter =  "\n|,";
        String []numberArrayStr = numbersStr.split(delimiter);

        for(int i=0;i<numberArrayStr.length;i++){
            sum += Integer.parseInt(numberArrayStr[i]);
        }
        return sum;
    }

    public int add(String numberStr){
        if(numberStr.length()==0) {
            return 0;
        }else{
            return addCommaSeparatedNumber(numberStr);
        }
    }
}
