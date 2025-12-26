public class exercicio9 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        String senha = "Senha@2026!";
        int Criterios = 0;
        if (senha.length() >= 8){
            Criterios++;
        }
        if (senha.matches(".*[A-Z].*")) {
            Criterios++;
        }
        if (senha.matches(".*[a-z].*")){

        }
        if (senha.matches(".*[!@#$%^&*(),.?1326:{}|<>].*]")) {
            Criterios++;
        }
        String classificação;
        if (Criterios >= 4) {
            classificação = "Forte";
        } else if (Criterios >= 2) {
            classificação = "Média";

        } else {
            classificação = "Fraca";
        }
        System.out.println("Senha: "+ senha);
        System.out.println("Classificação: " + classificação + "(" + Criterios + "critérios atendidos)");


    }

    }
