package io.github.AntonioCoelho19.request.converters;

import io.github.AntonioCoelho19.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value");
        String number = strNumber.replace(",","."); //R$49,99 --> R$49.99
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",","."); //R$49,99 --> R$49.99
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
