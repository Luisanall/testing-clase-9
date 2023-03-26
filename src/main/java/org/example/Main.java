package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora ();
        System.out.println (Calculadora.multiplicar ( 80, 3 ));
        System.out.println (Calculadora.sumar ( 150, 180) / Calculadora.numero ( 3 ) );
        System.out.println (Calculadora.restar ( 90,50 * Calculadora.numero ( 15 ) ));
        System.out.println (Calculadora.sumar ( 70,40 * Calculadora.numero ( 25 ) ));
    }

}
