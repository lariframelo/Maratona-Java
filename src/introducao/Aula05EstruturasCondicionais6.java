package introducao;

public class Aula05EstruturasCondicionais6 {
    // Utilizando o switch, Dados os dias da semana como 1 a 7
    // Diga se é dia útil ou final de semana
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia) {
            case 1 :
            case 7 :
                System.out.println("Final de Semana");
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Dia útil");
                break;

        }
    }
}
