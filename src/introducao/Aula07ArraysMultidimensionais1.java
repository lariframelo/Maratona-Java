package introducao;

public class Aula07ArraysMultidimensionais1 {
    public static void main(String[] args) {
        //3 arrays de 3 espaços na memória cada
        int [][] dias = new int [3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) { //vai passar pelas referências
            for (int j = 0; j < dias[0].length; j++) { //vai entrar nas referências
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------");
        //forEach
        for (int [] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
            
        }
    }
}
