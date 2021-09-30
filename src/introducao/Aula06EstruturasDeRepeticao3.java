package introducao;
//função do break
//imprimir os 25 primeiros números de algum valor
public class Aula06EstruturasDeRepeticao3 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax ; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
