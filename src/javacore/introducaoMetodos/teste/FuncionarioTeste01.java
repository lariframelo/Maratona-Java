package javacore.introducaoMetodos.teste;

import javacore.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Osvaldo";
        funcionario.idade = 66;
        funcionario.salarios = new double[]{1200, 937.32, 2000};

        funcionario.imprimirDados();
        funcionario.mediaSalariol();
    }
}
