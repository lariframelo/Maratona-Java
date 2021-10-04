package javacore.introducaoMetodos.teste;
//criação de métodos
import javacore.introducaoMetodos.dominio.Calculadora;

public class TesteCalculadora01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

     // modificador de acesso + Retorna ou não retorna(void) + Parâmetros

     calculadora.somaDoisNumeros();
     calculadora.subtraiDoisNumeros();
        
    }
}
