package com.rest.app;

public class StringCalculator {

    public int add(String str){
        if(str.length()==0){
            return 0;
        }else if(str.length()==1){
            return str.charAt(0)-'0'; // TODO : Support for "15" -> 15
        }else{
            return -1; // TODO : Logic for comma separated number "1,2" -> 3
        }
    }
}
