package javacore.introducaoMetodos.teste;

import javacore.introducaoMetodos.dominio.Estudante;
import javacore.introducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Ronaldo";
        estudante01.idade = 55;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriela";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprimeEstudante(estudante01);
        impressora.imprimeEstudante(estudante02);

    }
}
