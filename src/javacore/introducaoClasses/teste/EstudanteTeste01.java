package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante ();
        estudante.nome = "Luffy";
        estudante.sexo = 'F';
        estudante.idade = 25;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante);//sai o endereço na memório


    }
}
