package org.century.poosobrecarga;

public class Calculadora {

    //Los argumentos no pueden ser del mismo tipo, ya que manda error
    //asi los metodos retornar tipos de datos distintos

    public int sumar(int a, int b) {
        return a + b;
    }

    public float sumar(float x, float y) {
        return x + y;
    }

    public float sumar(int i, float j) {
        return i + j;
    }

    public float sumar(float i, int j) {
        return i + j;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(String a, String b) {
        int result;
        try {
            result = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(int a, int b, double c) {
        return (double) a + (double) b + c;
    }

    //SOBRECARGA CON Varargs -> Var argumentos -> muchos argumentos del MISMO TIPO de DATO
    //Recibe la cantidad que quiera , siempre y cuando sean del mismo tipo
    //Es un arreglo
    public int sumar(int... argumentos) {
        int total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    //Ejemplo de sobrecarga con Varargs
    public float sumar(float a, int... argumentos) {
        float total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    //Metodos estaticos son cobrecarga
    public static int sumar(int x, int y, long z) {
        return x + y + (int) z;
    }

}
