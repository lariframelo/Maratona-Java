package javacore.introducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salarios) {
            System.out.println(salario + " ");
        }

    }

    public void mediaSalariol() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial é de : " + media);
    }
}

