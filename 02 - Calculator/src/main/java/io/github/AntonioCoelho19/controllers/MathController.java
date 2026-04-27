package io.github.AntonioCoelho19.controllers;

import io.github.AntonioCoelho19.exception.UnsupportedMathOperationException;
import io.github.AntonioCoelho19.math.SimpleMath;
import io.github.AntonioCoelho19.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math") //foi aplicado à classe, aplicando-se a todos os métodos dentro dela
public class MathController {

    private SimpleMath math = new SimpleMath();

    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception {

        if(!NumberConverter.isNumeric(number1) || !NumberConverter.isNumeric(number2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/sub/{number1}/{number2}")
    public Double subtraction(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception{

        if(!NumberConverter.isNumeric(number1) || !NumberConverter.isNumeric(number2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.subtraction(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/mult/{number1}/{number2}")
    public Double multiplication(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception{

        if(!NumberConverter.isNumeric(number1) || !NumberConverter.isNumeric(number2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.multiplication(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/div/{number1}/{number2}")
    public Double division(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception{

        if(!NumberConverter.isNumeric(number1) || !NumberConverter.isNumeric(number2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.division(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/pow/{number1}/{number2}")
    public Double exponentiation(@PathVariable("number1") String number1, @PathVariable("number2") String number2) throws Exception{

        if(!NumberConverter.isNumeric(number1) || !NumberConverter.isNumeric(number2)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.exponentiation(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/sqrt/{number}")
    public Double squareRoot(@PathVariable("number") String number) throws Exception{

        if(!NumberConverter.isNumeric(number)) throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }

}

