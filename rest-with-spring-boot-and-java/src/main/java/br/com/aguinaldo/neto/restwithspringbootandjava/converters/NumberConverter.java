package br.com.aguinaldo.neto.restwithspringbootandjava.converters;

import static java.util.Objects.isNull;

public class NumberConverter {

    public static Double convertToDouble(String stringNumber) {

        if (isNull(stringNumber))
            return 0D;

        String number = stringNumber.replaceAll(",", ".");

        if (isNumeric(number))
            return Double.parseDouble(number);

        return 0D;
    }

    public static boolean isNumeric(String stringNumber) {
        if (isNull(stringNumber))
            return false;

        String number = stringNumber.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
