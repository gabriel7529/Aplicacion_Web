package org.example.calculatorservice2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CalculatorWebServiceImpl implements CalculatorWebService {
    @WebMethod
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}