package introducao;
//Operadores ternários
public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        // se meu salário for > 5000, doar 500 reais pro DevDojo
       double salario = 6000;
       String resultado = salario > 5000 ? "Vou doar 500 reais pro DevDojo" : "Não tenho condições de doar, mas terei !"; // só vale alocado em uma String


       //(condição)? verdadeiro : falso
        System.out.println(resultado);
    }
}
