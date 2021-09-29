package introducao;
/*  Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário <salário> na data <data>.

 */
public class Aula03TiposPrimitivosExe {

    public static void main(String[] args) {
        String nome = "Larissa";
        String endereco = "Av Cavalhada, 10250";
        double salario = 3519.80;
        String dataRecebimento = "03.10.2021";
        String mensagem = ("Eu " + nome + ", morando no endereço " + endereco +
                ", afirmo que recebi o salário de " + salario + " na data " + dataRecebimento);
        System.out.println(mensagem);
    }
}
