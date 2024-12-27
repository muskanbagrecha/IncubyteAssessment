package org.project;


public class StringCalculator {

    public int add(String numbers){

        //Return 0 for no arguments.
        if(numbers.isEmpty()){
            return 0;
        }
        String[] numbersArr = numbers.split(",");
        int sum = 0;
        for(String token : numbersArr){
            int number = Integer.parseInt(token);
            sum +=number;
        }
        return sum;
    }
}
