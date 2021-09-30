package introducao;

//Exercício de break;
//Dado o valor de um carro descubra em quantas parcelas ele pode ser comprado
//Condição parcela ser >=1000

public class Aula06EstruturasDeRepeticao4 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela >= 1000) {
                System.out.println(parcela + " vezes de " + valorParcela);
            } else {
                break;
            }
        }
    }
}
