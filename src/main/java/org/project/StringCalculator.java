package org.project;


public class StringCalculator {

    public int add(String numbers){

        //Return 0 for no arguments.
        if(numbers.isEmpty()){
            return 0;
        }

        String delimiter = ",|\n";
        if(numbers.startsWith("//")){

            int delimiterEndIndex = numbers.indexOf("\n");

            //extract the delimiter
            delimiter = numbers.substring(2,delimiterEndIndex);

            //update the string to remove the delimiter information
            numbers = numbers.substring(delimiterEndIndex+1);
        }

        String[] numbersArr = numbers.split(delimiter);

        int sum = 0;

        for(String token : numbersArr){
            int number = Integer.parseInt(token);
            sum +=number;
        }

        return sum;
    }
}
