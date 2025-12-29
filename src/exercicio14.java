import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura (m): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f ", imc);
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do Peso");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clssificação: Peso Normal");

        } else if (imc >= 25.0  && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");

        } else {
            System.out.println("Classificação: Obesidade");
        }

    }
}
