public class exercicio13 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        int valor = 258;
        System.out.println("decomposição do valor " + valor + ":");
        int notasde100 = valor / 100;
        valor %= 100;
        System.out.println(notasde100 + " nota(s) de 100");
        int notasde50 = valor / 50;
        valor %= 50;
        System.out.println(notasde50 + " nota(s) de 50" );
        int notasde20 = valor / 50;
        valor %= 20;
        System.out.println(notasde20 + " nota(s) de 20");
        int notasde10 = valor / 10;
        valor %= 10;
        System.out.println(notasde10 + " nota(s) de 10");
        int notasde5 = valor / 5;
        valor %= 5;
        System.out.println(notasde5 + " nota(s) de 5 ");
        int notasde2 = valor / 2;
        valor %= 2;
        System.out.println(notasde2 + " nota(s) de 2 ");
        int notasde1 = valor / 1;
        valor %= 1;
        System.out.println(notasde1 + " nota(s) de 1");
    }
}
