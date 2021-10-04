package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Adalberto";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println(professor.idade);
        System.out.println(professor.nome);
        System.out.println(professor.sexo);

    }

}
