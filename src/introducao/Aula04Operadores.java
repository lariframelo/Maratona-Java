package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02/numero01;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQue20 = 10 > 20;
        boolean isDezMenorQue20 = 10 < 20;
        boolean isDezIgualA20 = 10 == 20;
        boolean isDezDiferenteDe20 = 10 != 20;
        System.out.println("Dez é maior que 20? " + isDezMaiorQue20);
        System.out.println("Dez é menor que 20? " + isDezMenorQue20);
        System.out.println("Dez é igual a 20? " + isDezIgualA20);
        System.out.println("Dez é diferente de 20? " + isDezDiferenteDe20);

        // &&(AND)  ||(OR)  !(not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30  && salario >= 3381;
        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation ;
        System.out.println("Posso comprar o PlayStation? " + isPlayStationCompravel);

        // =, +=, -=, *=, /=, %=
        // += é quando eu quero adicionar mais um valor ao que já tem na variável
        // e consequentemente é assim com os demais operadores ao lado de =
        double bonus = 1800;
        bonus += 200;
        System.out.println(bonus);

        //usado para contadores
        int contador = 0;
        contador += 1;
        contador ++; //outra forma de colocar
        contador --; //também tem no modo regressivo
        System.out.println(contador);

        //a ordem do sinal define a ordem de execução do comando ex:
        int contador2 = 0;
        System.out.println(contador2 ++); // aqui primeiro ele vai imprimir e depois contar
        System.out.println(contador2); // aqui vai mostrar o contador;
        System.out.println(++ contador2); // aqui vai contar

        }

    }

