public class exercicio3 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        int valororiginal = 80;
        double valordobro = valororiginal + 0.75;

        int valorfinal = (int) valordobro;
        System.out.println("Valor inteiro : " + valororiginal);
        System.out.println("Valor da double (com o decimal): " + valordobro);
        System.out.println("Valor final (depois do casting): " + valorfinal);

    }
}
