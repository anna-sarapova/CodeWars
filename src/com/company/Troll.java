package com.company;

public class Troll {
    public static String removeVowel(String str){
        StringBuilder modifiedString = new StringBuilder();

        for(char c : str.toCharArray()){
            if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'o' && c != 'O' && c != 'u' && c != 'U' && c != 'i' && c != 'I') {
                modifiedString.append(c);
            }
        }

        str = modifiedString.toString();

        return str;
    }
}
