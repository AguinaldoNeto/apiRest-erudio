package br.com.aguinaldo.neto.restwithspringbootandjava.math;

public class SimpleMath {

    private static final double TOTAL_OF_PARAM_NUMBER = 2;

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return(numberOne + numberTwo) / TOTAL_OF_PARAM_NUMBER;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }
}
