package com.developer;

import java.util.stream.Collectors;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "moose" == false
isIsogram "aba" == false
 */
public class Isogram {
    public static boolean  isIsogram(String str) {
        /*long stringSize = str.toLowerCase().chars().mapToObj(e -> (char) e).collect(Collectors.toList()).stream().count();
        long distinctStringSize = str.toLowerCase().chars()
                .mapToObj(e -> (char) e).collect(Collectors.toList()).stream().distinct().count();
        return stringSize == distinctStringSize;*/
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
    
    public static void main(String[] args) {
        String str = "abcc";
        System.out.println(isIsogram(str));
    }
}
