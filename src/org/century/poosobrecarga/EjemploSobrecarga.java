package org.century.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("Sumar Int " + cal.sumar(2,3));
        System.out.println("Sumar Float " + cal.sumar(10.0F,23.0F));
        System.out.println("Sumar int-int-double " + cal.sumar(34,34,45.0));
        System.out.println("Sumar String " + cal.sumar("34","56"));


        //Varargs ->
        System.out.println("SUMA => Var Args " + cal.sumar(1,2,3,4,5,6,7,8,9,10));


        //Metodo static
        System.out.println("Suma int method static " + Calculadora.sumar(4,5,1345L));

    }
}
