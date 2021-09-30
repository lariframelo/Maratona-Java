package introducao;
//Operadores ternários
public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        // se meu salário for > 5000, doar 500 reais pro DevDojo
       double salario = 6000;
       String msgDoar = "Vou doar 500 reais pro DevDojo";
       String msgNDoar = "Não tenho condições de doar, mas terei !";

       //(condição)? verdadeiro : falso
        System.out.println(salario > 5000 ? msgDoar : msgNDoar);
    }
}
