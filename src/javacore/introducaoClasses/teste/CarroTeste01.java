package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome = "Fusca azul";
        carro1.modelo = "Sport";
        carro1.ano = 1976;

        carro2.nome = "Celtinha";
        carro2.modelo = "Sport";
        carro2.ano = 2004;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
