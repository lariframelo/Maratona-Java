package introducao;

public class Aula06EstruturasDeRepeticao2 {
    public static void main(String[] args) {
        //Contar os pares de 1 a 1 milhão
        for (int i = 1; i <= 1000000 ; i++ ) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
