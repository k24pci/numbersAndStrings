package com.ucx.training.sessions.numbersAndStrings;

public class CountZeros {


    static void countZeros(int number) {

        String binNr = Integer.toString(number,2);
        int zeros = binNr.length() - binNr.replaceAll("0", "").length();
        System.out.println("Number of 0's:" + zeros);
        }
    }


