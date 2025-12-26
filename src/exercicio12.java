public class exercicio12 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        String entrada = "2 - 4";
        String[] partes = entrada.split(" ");
        int valoresquerdo = Integer.parseInt(partes [0]);
        String operador = partes [1];
        int valordireito = Integer.parseInt(partes[2]);
        switch (operador){
            case "+" -> System.out.println("Resultado: " + (valoresquerdo + valordireito));
            case "-" -> System.out.println("Resultado: " + (valoresquerdo - valordireito));
            case "*" -> System.out.println("Resultado: " + (valoresquerdo * valordireito));
            case "/" -> {
                if (valordireito !=0) System.out.println("Resultado: " + (valoresquerdo / valordireito));
                else System.out.println("Erro: Divisão por zero");
            }
            case "%" -> System.out.println("Resultado: " + (valordireito % valordireito));
            default -> System.out.println("Erro: Operador Inválido");
        }
    }
}
