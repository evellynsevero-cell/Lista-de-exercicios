public class exercicio8 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        double P1 = 6.5, P2 = 8.0, P3 = 7.5;
        double media = (P1 + P2 + P3) /3;
        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media >= 5 && media < 7){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
