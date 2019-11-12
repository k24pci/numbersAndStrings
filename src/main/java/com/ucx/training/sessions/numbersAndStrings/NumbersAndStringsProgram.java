package com.ucx.training.sessions.numbersAndStrings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersAndStringsProgram {
    public static void main(String[] args) {
        Integer intVal = Integer.valueOf(3);
        Long longVal = Long.valueOf(3L);

        System.out.println(intVal.equals(longVal));
        System.out.println(intVal.intValue() == longVal.longValue());

        System.out.println(Integer.parseInt("0100",2));
        System.out.println(Integer.parseInt("A",16));
        System.out.println(Integer.parseInt("7",8));

        Double random = Math.random();
        System.out.println("Random value: " + (int)(random * 10));

        System.out.println(Integer.toString(8,2));

        String text = "Hello "
                .concat("World, ")
                .concat("this is Java Programming Language!");

        System.out.println(text);

        String searchMe = "Green eggs and ham.";
        String findMe = "eggs";
        System.out.println(searchMe.toLowerCase().contains(findMe.toLowerCase()));
        System.out.println(searchMe.substring(6));
        System.out.println(searchMe.indexOf(findMe));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ")
                .append("World!");
        System.out.println(stringBuilder.toString());

        String sValue  = "Hello";
        String sValue2 = "Hello";
        String sValue3 = new String("Hello");

        System.out.println(sValue == sValue2);
        System.out.println(sValue.equals(sValue2));
        System.out.println(sValue.equals(sValue3));
        System.out.println(sValue == sValue3);

        Set<Integer> set = Set.of(1,7,9,10);
        System.out.println(set);

        List<Integer> list = List.of(1,7,9,10,7);
        System.out.println(list);

        Set<Integer> listWithoutDuplicates = new HashSet<>(list);
        System.out.println(listWithoutDuplicates);

        CountZeros.countZeros(16);
        System.out.println(FindNumber.findNumber(Set.of(1,7,9,10),8));

    }
}
