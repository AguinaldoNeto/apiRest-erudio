package br.com.aguinaldo.neto.restwithspringbootandjava.controller;

import br.com.aguinaldo.neto.restwithspringbootandjava.converters.NumberConverter;
import br.com.aguinaldo.neto.restwithspringbootandjava.exceptions.UnsupportMathOperationException;
import br.com.aguinaldo.neto.restwithspringbootandjava.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static br.com.aguinaldo.neto.restwithspringbootandjava.converters.NumberConverter.convertToDouble;
import static br.com.aguinaldo.neto.restwithspringbootandjava.converters.NumberConverter.isNumeric;

@RestController
public class MathController {

    private final AtomicLong couter = new AtomicLong();

    private SimpleMath math = new SimpleMath();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
                throw new UnsupportMathOperationException("Please, set a numeric value.");
            }

        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportMathOperationException("Please, set a numeric value.");

        return math.sub(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportMathOperationException("Please, set a numeric value.");

        return math.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportMathOperationException("Please, set a numeric value.");

        return math.division(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new UnsupportMathOperationException("Please, set a numeric value.");

        return math.mean(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "number") String number) {
        if (!isNumeric(number))
            throw new UnsupportMathOperationException("Please, set a numeric value.");

        return math.squareRoot(convertToDouble(number));
    }






}