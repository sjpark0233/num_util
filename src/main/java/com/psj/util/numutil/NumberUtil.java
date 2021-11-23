package com.psj.util.numutil;

public class NumberUtil {

    public static int parseInt(String args) {
        int number = 0;

        try {
            number = Integer.parseInt(args);
        } catch (NumberFormatException e) {
            number = 0;
        }

        return number;
    }
}
