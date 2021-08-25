package org.fasttrackit.course4.calculator;

public class CalculatorOp {

    public void switchMethod(float op1, int op2, String operationtype) {


        switch (operationtype) {
            case "sum":
                float sum = op1 + op2;
                System.out.println("Suma numerelor este: " + sum);
                break;
            case "substract":
                float subs = op1 - op2;
                System.out.println("Rezultatul diferentei este: " + subs );
                break;
            case "multiply":
                float multiplu= op1*op2;
                System.out.println("Rezultatul inmultirii este: " + multiplu);
                break;
            case "divide":
                float div = op1/op2;
                System.out.println("Rezultatul impartirii este: " + div);
                break;
            default:
                System.out.println(" Nu am realizat nici o operatie aritmetica.");


        }
    }

}
