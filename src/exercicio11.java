public class exercicio11 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        int diadasemana = 7;
        switch (diadasemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }

    }
}
