package javacore.introducaoMetodos.teste;

import javacore.introducaoMetodos.dominio.Calculadora;

public class TesteCalculadora03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(10, 2);
        System.out.println(result);
    }


}
