package com.demo.springboot.classes;

import java.util.ArrayList;

public class ValidatePesel {

    public static boolean isValidate(String numbers){
        ArrayList <Integer> list = new ArrayList<>();
        Integer validationSum = 0 ;
        if (numbers.length() == 11) {
            for (int i = 0; i < numbers.length(); i++) {
                list.add((int) numbers.charAt(i));
            }
            validationSum = 1*list.get(0) + 3*list.get(1)+ 7*list.get(2) + 9*list.get(3) + 1*list.get(4) + 3*list.get(5) + 7*list.get(6) + 9*list.get(7) + 1*list.get(8) + 3*list.get(9) + 1*list.get(10);

            if(validationSum%10==0){
                return true;
            }
        }
        else{
            return false;
        }
        return false;
    }
}
